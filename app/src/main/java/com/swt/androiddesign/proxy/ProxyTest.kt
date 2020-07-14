package com.swt.androiddesign.proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy
import java.util.*


/**
 * introduce：代理模式
 * author：sunwentao
 * email：wentao.sun@freebrio.com
 * data: 2020/7/14
 */
object ProxyTest {
    @JvmStatic
    fun main(args: Array<String>) {
        //普通代理模式
        var proxy = OrderProxy()
        proxy.saveOrder()


        //动态代理模式
        var order = OuterStore()
        var proxy11 = Proxy.newProxyInstance(
            order.javaClass.classLoader,
            order.javaClass.interfaces
        ) { _, method, args ->
            println("下单前操作")
            val result = method?.invoke(order, *args.orEmpty())
            println("下单后操作")
            result
        } as OrderInterface
        proxy11.saveOrder()
    }
}