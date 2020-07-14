package com.swt.androiddesign.decorator


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/13
 */
class ColorBag : DecoratorBag {
    var decoratorBag: DecoratorBag? = null

    constructor(decoratorBag: DecoratorBag) {
        this.decoratorBag = decoratorBag
    }

    override fun bag() {
        super.bag()
        println("彩色包装")
    }
}