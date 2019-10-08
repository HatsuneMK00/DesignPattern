package xyz.makise.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//2 Ϊҵ����ʵ��һ����̬�������ľ���ʵ�����Լ����ʹ�õ��Ѷ�
public class UserServiceDynamicProxy extends DynamicProxy {
    public static <T> T getUserServiceDynamicProxy(IUserService userService) {

        return (T) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), new UserServiceInvocationHandler(userService) {
        });
    }
}
