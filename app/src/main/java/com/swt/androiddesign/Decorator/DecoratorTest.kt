package com.swt.androiddesign.Decorator


/**
 * introduce：装饰器模式
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/13
 */
object DecoratorTest {
    @JvmStatic
    fun main(args: Array<String>) {
        var base = DecoratorBag()
        var colorBag = ColorBag(base)
        colorBag.bag()
    }

}