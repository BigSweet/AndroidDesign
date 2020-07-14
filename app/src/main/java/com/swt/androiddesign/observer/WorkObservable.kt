package com.swt.androiddesign.observer

import java.util.*


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/14
 */
class WorkObservable : Observable() {

    init {
        addObserver(JavaWorkObserver())
        addObserver(AndroidWorkObserver())
    }

    fun bossComing() {
        setChanged()
        notifyObservers()
    }

}