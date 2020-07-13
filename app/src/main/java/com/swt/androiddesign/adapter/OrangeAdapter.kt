package com.swt.androiddesign.adapter


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/13
 */
class OrangeAdapter() : OrangeBag() {

    var appleBag: AppleBag? = null

    constructor(appleBag: AppleBag) : this() {
        this.appleBag = appleBag
    }

    override fun bag(num: Int) {
        this.appleBag?.bag(num)
    }

}