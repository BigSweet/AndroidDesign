package com.swt.androiddesign.observer

import java.util.*


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/14
 */
class JavaWorkObserver : Observer {
    override fun update(o: Observable?, arg: Any?) {
        println("java开始工作")
    }
}