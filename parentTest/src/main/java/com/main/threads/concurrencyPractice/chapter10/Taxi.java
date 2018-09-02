package com.main.threads.concurrencyPractice.chapter10;

import com.main.threads.concurrencyPractice.chapter4.Point;
import net.jcip.annotations.GuardedBy;

/**
 * @author sunlei19
 * @create 2018-03-23 10:51
 */
public class Taxi {
    @GuardedBy("this")
    private Point location, destination;


    public java.awt.Point getDestination() {
        return destination;
    }

    public void setDestination(Point destination) {
        this.destination = destination;
    }

    private final Dispatcher dispatcher;

    public Taxi(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }


    public synchronized Point getLocation() {
        return location;
    }


    public void setLocation(Point location) {
        boolean reachedDestination;
        synchronized (this) {
            this.location = location;
            reachedDestination = location.equals(destination);
        }

        if (location.equals(destination)) {
            dispatcher.notifyAvailable(this);
        }
    }
}
