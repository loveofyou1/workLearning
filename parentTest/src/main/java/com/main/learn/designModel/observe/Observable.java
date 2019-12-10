package com.main.learn.designModel.observe;

/**
 * @author sunlei19
 * @Description TODO
 * @Date 2019/10/2 18:26
 */
public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers(String context);

}
