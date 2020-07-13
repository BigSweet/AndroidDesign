package com.swt.androiddesign;

/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/10
 */
class SixDesign {

    //<---六大原则--->
    /**
     * 单一原则（Single Responsibility Principle）:
     * 一个类或者一个方法只负责一项职责，尽量做到类的只有一个行为原因引起变化
     */

    /**
     * 里氏替换原则（LSP liskov substitution principle）:
     * 子类可以扩展父类的功能，但不能改变原有父类的功能；
     */

    /**
     * 依赖倒置原则（dependence inversion principle）:
     * 面向接口编程；（通过接口作为参数实现应用场景）
     * 上层模块不应该依赖下层模块，两者应依赖其抽象；
     * 抽象不应该依赖细节，细节应该依赖抽象；
     */

    /**
     * 接口隔离（interface segregation principle）:
     * 建立单一接口；（扩展为类也是一种接口，一切皆接口）
     */

    /**
     * 迪米特原则（law of demeter LOD）:
     * 最少知道原则，尽量降低类与类之间的耦合（局部变量中不要引入新的类）；
     */

    /**
     * 开闭原则（open closed principle）:
     * 用抽象构建架构，用实现扩展原则；
     */

}
