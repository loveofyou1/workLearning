package com.main.threads.concurrencyPractice.chapter8;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;

/**
 * @author sunlei19
 * @create 2018-03-20 17:45
 */
public class ConcurrentPuzzleSolver<P, M> {
    private final Puzzle<P, M> puzzle;
    private final ExecutorService exec;
    private final ConcurrentMap<P, Boolean> seen;
    final ValueLatch<Puzzle.Node<P, M>> solution = new ValueLatch<Puzzle.Node<P, M>>();

    private class ValueLatch<T> {
        public boolean isSet() {
            return true;
        }

        public Puzzle.Node<P, M> getValue() {
            return null;
        }

        public void setValue(Object pos) {
        }
    }

    public ConcurrentPuzzleSolver(Puzzle<P, M> puzzle, ExecutorService exec, ConcurrentMap<P, Boolean> seen) {
        this.puzzle = puzzle;
        this.exec = exec;
        this.seen = seen;
    }

    public List<M> solve() {
        try {
            P p = puzzle.initialPosition();
            exec.execute(newTask(p, null, null));
            //阻塞知道找到答案
            Puzzle.Node<P, M> solNode = solution.getValue();
            return (solNode == null) ? null : solNode.asMoveList();
        } finally {
            exec.shutdown();
        }
    }

    private Runnable newTask(P p, M m, Puzzle.Node<P, M> n) {
        return new SolverTask(p, m, n);
    }

    private class SolverTask extends Puzzle.Node implements Runnable {

        public SolverTask(P pos, Object move, Puzzle.Node prev) {
            super(pos, move, prev);
        }

        @Override
        public void run() {
            if (solution.isSet() || seen.putIfAbsent((P) pos, true) != null) {
                return;//已经找到了解答或者已经遍历了这个位置
            }
            if (puzzle.isGoal((P) pos)) {
                solution.setValue(pos);
            } else {
                for (M m : puzzle.legalMoves((P) pos)) {
                    exec.execute(newTask(puzzle.move((P) pos, m), m, this));
                }
            }
        }
    }
}
