package com.swt.androiddesign.builder


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/13
 */
object BuilderDesign {

    var builderModel: BuilderModel? = null

    init {
        builderModel = BuilderModel()
    }

    fun build(): BuilderDesign {
        println(builderModel?.applePrice + "苹果价格" + "橘子价格" + builderModel?.orangePrice)
        return this
    }

    fun setApplePrice(price: String): BuilderDesign {
        builderModel?.applePrice = price
        return this
    }

    fun setOrangePrice(price: String): BuilderDesign {
        builderModel?.orangePrice = price
        return this
    }
}