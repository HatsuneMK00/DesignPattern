package xyz.makise.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

class Client {
    public static void main(String[] args) {
//        ����ר��Ϊ��Ҫ�����ҵ����дһ�������DynamicProxy�Ĺ�����
        IUserService userService = new UserService();
        IUserService proxy = UserServiceDynamicProxy.getUserServiceDynamicProxy(userService);
        proxy.addUser();

//        ���һ�������������ض�̬�� ʹ���ʹ�ö�̬��Ĺ��̸���
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
