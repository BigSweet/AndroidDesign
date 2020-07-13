package com.swt.androiddesign.factory


/**
 * introduce：工厂模式
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/13
 */
object FactoryTest {

    @JvmStatic
    fun main(args: Array<String>) {
        var appleFactory = AppleFactory()
        appleFactory.getPackage()
        println(ApplePackage(appleFactory.getFruits()))
    }
}