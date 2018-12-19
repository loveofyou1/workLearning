package com.main.learn.threads.concurrencyPractice.chapter11;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @author sunlei19
 * @create 2018-03-23 17:39
 */
@ThreadSafe
public class AttributeStore {
    @GuardedBy("this")
    private final Map<String, String> attributes = new HashMap<String, String>();

    public synchronized boolean userLocationMatches(String name, String regexp) {
        String key = "users." + name + ".location";
        /**真正需要锁的地方只有map.get方法，而现在是整个方法都加锁了*/
        String location = attributes.get(key);
        if (location == null) {
            return false;
        } else {
            return Pattern.matches(regexp, location);
        }
    }


    public boolean userLocationMatchesImprove(String name, String regexp) {
        String key = "users." + name + ".location";
        String location;
        synchronized (this) {
            location = attributes.get(key);
        }

        if (location == null) {
            return false;
        } else {
            return Pattern.matches(regexp, location);
        }

    }
}
