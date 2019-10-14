package xyz.makise.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServiceInvocationHandler implements InvocationHandler {
    //    被代理类的类加载器
    Class cls = null;
    //    被代理的具体对象
    private Object object = null;

    private MyAspect aspect = new MyAspect();

//    使用构造器传入被代理的对象

    UserServiceInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        System.out.println(o.getClass().getName());
        aspect.before();
        Object result = method.invoke(this.object, args);
        aspect.after();
        return result;
    }
}
