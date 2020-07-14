package com.swt.androiddesign.proxy


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/14
 */
class OuterStore : OrderInterface {
    override fun saveOrder() {
        println("海外下单")
    }


}