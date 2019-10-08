package xyz.makise.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

//2 为业务类实现一个动态代理工厂的具体实现类以简化外界使用的难度
public class UserServiceDynamicProxy extends DynamicProxy {
    public static <T> T getUserServiceDynamicProxy(IUserService userService) {

        return (T) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), new UserServiceInvocationHandler(userService) {
        });
    }
}
