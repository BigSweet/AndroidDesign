package com.swt.androiddesign.instance


/**
 * introduce：单列模式
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/13
 */
//饿汉式
class EHInstance {
    var ehInstance: EHInstance = EHInstance()
}

//懒汉式
class LHInstance {
    var lhInstance: LHInstance? = null
    fun getInstance(): LHInstance? {
        if (lhInstance == null) {//双重校验锁
            synchronized(LHInstance::class) {
                if (lhInstance == null) {
                    lhInstance = LHInstance()
                }
            }
        }
        return lhInstance
    }
}