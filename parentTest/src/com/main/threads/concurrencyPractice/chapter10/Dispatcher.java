package com.main.threads.concurrencyPractice.chapter10;

import net.jcip.annotations.GuardedBy;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author sunlei19
 * @create 2018-03-23 10:52
 */
public class Dispatcher {
    @GuardedBy("this")
    private final Set<Taxi> taxis;
    @GuardedBy("this")
    private final Set<Taxi> availableTaxis;

    public Dispatcher(Set<Taxi> taxis, Set<Taxi> availableTaxis) {
        this.taxis = taxis;
        this.availableTaxis = availableTaxis;
    }

    public synchronized void notifyAvailable(Taxi taxi) {
        availableTaxis.add(taxi);
    }

    public synchronized Image getImage() {
        Set<Taxi> copy;
        synchronized (this) {
            copy = new HashSet<Taxi>(taxis);
        }

        Image image = new Image();
        for (Taxi taxi : copy) {
            getImage().drawMarker(taxi.getDestination());
        }
        return image;
    }

    class Image {
        void drawMarker(Point location) {

        }
    }

}
