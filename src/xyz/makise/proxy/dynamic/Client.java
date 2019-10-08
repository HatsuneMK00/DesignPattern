package xyz.makise.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

class Client {
    public static void main(String[] args) {
//        可以专门为需要代理的业务类写一个具体的DynamicProxy的工厂类
        IUserService userService = new UserService();
        IUserService proxy = UserServiceDynamicProxy.getUserServiceDynamicProxy(userService);
        proxy.addUser();

//        添加一个工厂用来返回动态类 使外界使用动态类的过程更简单
//        IUserService userService = new UserService();
//        UserServiceInvocationHandler userServiceInvocationHandler = new UserServiceInvocationHandler(userService);
//        IUserService proxy = DynamicProxy.getDynamicProxy(userService.getClass().getClassLoader(),
//                userService.getClass().getInterfaces(),userServiceInvocationHandler);
//        proxy.addUser();

//        IUserService userService = new UserService();
//        InvocationHandler userServiceInvocationHandler =
//                new UserServiceInvocationHandler(userService);
//        IUserService proxy = (IUserService) Proxy.newProxyInstance(IUserService.class.getClassLoader(),
//                UserService.class.getInterfaces(), userServiceInvocationHandler);
//        proxy.addUser();
//        proxy.deleteUser();
    }
}
