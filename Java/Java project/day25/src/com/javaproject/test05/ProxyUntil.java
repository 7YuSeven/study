package com.javaproject.test05;

//创建代理

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUntil {
    public static Star createProxy(SuperStar superStar) {
        /*
        参数一：用于指定用哪个类加载器，去加载生成的代理类
        参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
        参数三：用来指定生成的代理对象要干什么事情*/

        Star star = (Star) Proxy.newProxyInstance(
                ProxyUntil.class.getClassLoader(),
                new Class[]{Star.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*
                        参数一：代理对象
                        参数二：要运行的方法
                        参数三：方法的参数
                         */
                        if ("sing".equals(method.getName())) {
                            System.out.println("准备话筒");
                        } else if ("dance".equals(method.getName())) {
                            System.out.println("准备舞台");
                        }

                        return method.invoke(superStar, args);
                    }
                }
        );

        return star;
    }
}
