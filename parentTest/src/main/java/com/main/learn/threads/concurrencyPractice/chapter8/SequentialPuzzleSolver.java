package com.main.learn.threads.concurrencyPractice.chapter8;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author sunlei19
 * @create 2018-03-20 17:38
 */
public class SequentialPuzzleSolver<P, M> {
    private final Puzzle<P, M> puzzle;
    private final Set<P> seen = new HashSet<>();

    public SequentialPuzzleSolver(Puzzle<P, M> puzzle) {
        this.puzzle = puzzle;
    }

    public List<M> solve() {
        P pos = puzzle.initialPosition();
        return search(new Puzzle.Node<P, M>(pos, null, null));
    }

    private List<M> search(Puzzle.Node<P, M> node) {
        if (!seen.contains(node.pos)) {
            seen.add(node.pos);
            if (puzzle.isGoal(node.pos)) {
                return node.asMoveList();
            }
            for (M move : puzzle.legalMoves(node.pos)) {
                P pos = puzzle.move(node.pos, move);
                Puzzle.Node<P, M> child = new Puzzle.Node<>(pos, move, node);
                List<M> result = search(child);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

}
