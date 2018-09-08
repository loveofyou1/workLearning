package com.main.threads.artOfThread.thread05;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Dean
 * @create 2018/9/7
 */
public class CacheData {
    Object data;
    volatile boolean cacheValid;
    final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();


    void processCacheData() {
        rwl.readLock().lock();
        if (!cacheValid) {
            //must release read lock before acquiring write lock
            rwl.readLock().unlock();
            rwl.writeLock().lock();
            try {
                //Recheck state because another thread might have
                // acquired write lock and changed state before we did.
                if (!cacheValid) {
                    data = new Object();
                    cacheValid = true;
                }
                // Downgrade by acquiring read lock before releasing write lock
                rwl.readLock().lock();
            } finally {
                // Unlock write, still hold read
                rwl.writeLock().unlock();
            }
        }

        try {
            System.out.println(data.toString());
        } finally {
            rwl.readLock().unlock();
        }
    }

}
