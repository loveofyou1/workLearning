package com.main.threads.concurrencyPractice.chapter7;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.*;

/**
 * @author sunlei19
 * @create 2018-03-19 16:07
 */
public class NewTaskForCancel {

    public interface CancellableTask<T> extends Callable<T> {
        void cancel();

        RunnableFuture<T> newTask();
    }

    @ThreadSafe
    public class CancellingExecutor extends ThreadPoolExecutor {

        public CancellingExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
                                  BlockingQueue<Runnable> workQueue) {
            super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
        }

        protected RunnableFuture newTaskFor(Callable callable) {
            if (callable instanceof CancellableTask) {
                return ((CancellableTask) callable).newTask();
            } else {
                return super.newTaskFor(callable);
            }
        }
    }

    public abstract class SocketUsingTask implements CancellableTask {
        @GuardedBy("this")
        private Socket socket;

        protected synchronized void setSocket(Socket s) {
            socket = s;
        }

        public synchronized void cancel() {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public RunnableFuture newTask() {
            return new FutureTask(this) {
                public boolean cancel(boolean mayInterruptIfRunning) {
                    try {
                        SocketUsingTask.this.cancel();
                    } finally {
                        return super.cancel(mayInterruptIfRunning);
                    }
                }
            };
        }
    }

}
