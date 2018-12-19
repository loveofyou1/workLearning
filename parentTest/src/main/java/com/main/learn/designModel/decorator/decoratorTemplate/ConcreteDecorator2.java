package com.main.learn.designModel.decorator.decoratorTemplate;

public class ConcreteDecorator2 extends Decorator {
    //定义被修饰者
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    private void method2() {
        System.out.println("method2 装饰");
    }

    @Override
    public void operate() {
        this.method2();
        super.operate();
    }
}
