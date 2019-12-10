package com.main.learn.effective.four;

/**
 * @author sunlei19
 * @Description 接口应该只被用来定义类型，它们不应该被用来导出常量
 * @Date 2019/11/10 23:48
 */
public class PhysicalConstants {
    public PhysicalConstants() {
    }

    // 字面量使用下划线分割成千
    public static final double AVOGADROS_NUMBER = 6.022_14_857e23;
}
