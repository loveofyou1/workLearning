package com.main.threads.concurrencyPractice.chapter4;

import com.main.test.serialize.Person;
import net.jcip.annotations.ThreadSafe;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sunlei19
 * @create 2018-03-16 20:18
 */
@ThreadSafe
public class PersonSet {
    private final Set<Person> mySet = new HashSet<>();

    public synchronized void addPerson(Person person) {
        mySet.add(person);
    }

    public synchronized boolean containPerson(Person person) {
        return mySet.contains(person);
    }
}
