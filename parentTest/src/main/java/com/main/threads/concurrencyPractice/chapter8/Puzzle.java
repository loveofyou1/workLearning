package com.main.threads.concurrencyPractice.chapter8;

import net.jcip.annotations.Immutable;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author sunlei19
 * @create 2018-03-20 17:32
 */
public interface Puzzle<P, M> {
    P initialPosition();

    boolean isGoal(P position);

    Set<M> legalMoves(P position);

    P move(P position, M move);

    @Immutable
    static class Node<P, M> {
        final P pos;
        final M move;
        final Node<P, M> prev;


        public Node(P pos, M move, Node<P, M> prev) {
            this.pos = pos;
            this.move = move;
            this.prev = prev;
        }

        List<M> asMoveList() {
            List<M> solution = new LinkedList<M>();
            for (Node<P, M> n = this; n.move != null; n = n.prev) {
                solution.add(0, n.move);
            }
            return solution;
        }
    }

}
