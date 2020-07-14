package com.swt.androiddesign.observer


/**
 * introduce：观察者模式
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/14
 */
object ObserverTest {
    @JvmStatic
    fun main(args: Array<String>) {
        var test = WorkObservable()
        test.bossComing()
    }
}