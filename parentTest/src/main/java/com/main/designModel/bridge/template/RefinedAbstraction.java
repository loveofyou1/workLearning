package com.main.designModel.bridge.template;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    @Override
    public void request() {
        /**
         * 业务处理...
         */
        super.request();
        super.getImp().doAnything();
    }
}
