package com.swt.androiddesign.adapter


/**
 * introduce：适配器模式
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/13
 */
object AdapterDesign {
    @JvmStatic
    fun main(args: Array<String>) {
        var apple = Apple(6)
        var appleBag = AppleBag()
        //当苹果包装够用的时候
        apple.pack(appleBag)
        //当苹果包装不够用的时候，适配器模式 用橘子的包装
        var orangeBag = OrangeAdapter(appleBag)
        orangeBag.bag(apple.num)
    }

}