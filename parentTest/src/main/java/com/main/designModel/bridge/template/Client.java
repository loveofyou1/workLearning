package com.main.designModel.bridge.template;

public class Client {
    public static void main(String[] args) {
        //定义一个实现化角色
        Implementor implementor = new ConcreteImplementor1();
        //定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(implementor);
        abs.request();
    }
}
