package com.dkt.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: dkt
 * @Pcakage: com.dkt.cglib.CglibTest
 * @Date: 2022年12月08日 14:31
 * @Description:
 */
public class CglibTest {
    public static void main(String[] args) {
        // 创建目标对象
        Target target = new Target();
        // 创建增强类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("方法执行前的业务");
                Object invoke = methodProxy.invoke(target, objects);
                System.out.println("方法执行后的业务");
                return null;
            }
        });
        Target proxy = (Target) enhancer.create();
        proxy.method();
    }
}
