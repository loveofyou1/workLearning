package com.main.learn.threads.exercise.core.three.pc;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2020/1/1 10:44
 */
public class Run {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        ThreadP threadP = new ThreadP(p);
        threadP.start();

        C c = new C(lock);
        ThreadC threadC = new ThreadC(c);
        threadC.start();
    }
}
