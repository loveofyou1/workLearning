package com.main.designModel.template;

import com.main.designModel.template.abstractFather.HummerModel;
import com.main.designModel.template.sub.Hummber1;
import com.main.designModel.template.sub.Hummer2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 模板方法：
 * 定义一个操作中的算法的框架，而将一些步骤延迟到子类中。
 * 使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * <p>
 * 使用场景：
 * <p>
 * ● 多个子类有公有的方法，并且逻辑基本相同时。
 * <p>
 * ● 重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现。
 * <p>
 * ● 重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数（见“模板方法模式的扩展”）约束其行为。
 * <p>
 * 注意事项：该方法是子类影响父类的设计，开发时不建议经常使用子类影响父类的方式。
 */
public class TemplateClient {
    public static void main(String[] args) throws IOException {
        System.out.println("-------H1型号悍马--------");
        System.out.println("H1型号的悍马是否需要喇叭声响？0-不需要   1-需要");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        HummerModel hummerModel = new Hummber1();
        if ("0".equalsIgnoreCase(type)) {
            ((Hummber1) hummerModel).setAlarmFlag(false);
        }
        hummerModel.run();

        HummerModel hummerModel2 = new Hummer2();
        hummerModel2.run();
    }
}
