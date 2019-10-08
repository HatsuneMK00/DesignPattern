package xyz.makise.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//1 添加一个生产动态代理对象的工厂
//在没有正常的业务类工厂类的时候 用这个动态代理的工厂类返回一个织入了增强的代理类
class DynamicProxy {
//    可以在产生动态代理类的时候也进行增强 但真正的增强在InvocationHandler的实现类里
    MyAspect aspect = new MyAspect();
//    interfaces前面的Class<?>(这里不可以是<T>)确定了泛型T的类型
//    太神奇了我懵了
//    使用泛型可以避免强制转换 这边直接返回了需要的接口类型
    static <T> T getDynamicProxy(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
