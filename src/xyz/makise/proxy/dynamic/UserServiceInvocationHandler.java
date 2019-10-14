package xyz.makise.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UserServiceInvocationHandler implements InvocationHandler {
    //    ����������������
    Class cls = null;
    //    ������ľ������
    private Object object = null;

    private MyAspect aspect = new MyAspect();

//    ʹ�ù��������뱻����Ķ���

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
