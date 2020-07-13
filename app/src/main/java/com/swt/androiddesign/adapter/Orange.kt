package com.swt.androiddesign.adapter


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/13
 */
class Orange(var num: Int) {
    fun pack(orangeBag: OrangeBag) {
        orangeBag.bag(num)
    }
}