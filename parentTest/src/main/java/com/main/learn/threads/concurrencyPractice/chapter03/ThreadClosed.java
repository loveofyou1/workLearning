package com.main.learn.threads.concurrencyPractice.chapter03;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author sunlei19
 * @create 2018-03-15 20:56
 */
public class ThreadClosed {


    public int loadTheArk(Collection<Animal> candidates) {
        Load ark = new Load();
        SortedSet<Animal> animals;
        int numPairs = 0;
        Animal candidate = null;

        //animals被封闭在方法中，不要使他逸出
        animals = new TreeSet<>(new SpeciesGenderComparator());
        animals.addAll(candidates);
        for (Animal a : animals) {
            if (candidate == null || !candidate.isPotentialMate(a)) {
                candidate = a;
            } else {
                ark.load(new AnimalPair(candidate, a));
                ++numPairs;
                candidate = null;
            }
        }
        return numPairs;
    }
}


class Animal {

    public boolean isPotentialMate(Animal animal) {
        if (animal != null) {
            return true;
        }
        return false;
    }
}

class SpeciesGenderComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}

class Load {
    void load(AnimalPair pair) {

    }
}

class AnimalPair {
    public AnimalPair(Animal animal, Animal a) {

    }
}
