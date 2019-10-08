package xyz.makise.proxy.dynamic;

//这里模拟一下web业务层中事务处理的aop操作
//动态代理用于aop
//在Spring中使用aop时 结合了工厂模式 由工厂直接返回一个被代理过的
public interface IUserService {
    void addUser();
    void deleteUser();
    void findUser();
}
