package com.swt.androiddesign.factory


/**
 * introduce：here is introduce
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/13
 */
class AppleFactory : AbstractFruits() {
    override fun getFruits(): Fruits {
        return Apple()
    }

    override fun getPackage(): Package {
        return ApplePackage()
    }
}