package com.main.learn.threads.concurrencyPractice.chapter8;

import javax.swing.text.Element;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * @author sunlei19
 * @create 2018-03-20 17:14
 */
public class DiguiExecutor {
    void processSequentially(List<Element> elements) {
        for (Element e : elements) {
            process(e);
        }
    }


    void processInParallel(Executor exec, List<Element> elements) {
        for (final Element e : elements) {
            exec.execute(new Runnable() {
                @Override
                public void run() {
                    process(e);
                }
            });
        }
    }

    private void process(Element e) {
    }
}
