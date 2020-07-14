package com.swt.androiddesign.observer

import java.util.*


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/14
 */
class AndroidWorkObserver : Observer {
    override fun update(o: Observable?, arg: Any?) {
        println("android开始工作")
    }
}