package xyz.makise.proxy.standard;

public interface Subject {
//    这两个函数对应一个实现类中的属性
//    之所以要放到接口中是因为代理模式下只有接口里有的方法能够被代理
//    在调用heavyJob()之前 真实的对象是不被创建出来的
//    可以通过代理类实现延迟的实例化 提高程序运行效率
//    public String getInfo();
//    public void setInfo(String info);
    void heavyJob();
}
