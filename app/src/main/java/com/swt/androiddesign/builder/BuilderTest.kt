package com.swt.androiddesign.builder


/**
 * introduce：建造者模式
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/13
 */
object BuilderTest {

    @JvmStatic
    fun main(args: Array<String>) {
        BuilderDesign.setApplePrice("2").setOrangePrice("3").build()
    }
}