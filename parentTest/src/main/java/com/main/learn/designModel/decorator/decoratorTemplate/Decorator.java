package com.main.learn.designModel.decorator.decoratorTemplate;

/**
 * 装饰者类
 */
public abstract class Decorator extends Component {

    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
