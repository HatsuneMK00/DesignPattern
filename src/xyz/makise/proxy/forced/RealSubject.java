package xyz.makise.proxy.forced;

//强制代理中 真实对象需要检查是否是由代理类执行的方法
//这样使用时 要保证代理类必须是来自于真实对象的getProxy()方法 否则强制可能会不生效
//即使这样 也必须有口头的约定不能够直接调用 否则在调用了getProxy之后 真实对象也可以直接调用方法 违反了强制代理的初衷
public class RealSubject implements Subject {
    //    记录自己的代理是谁
    private Subject proxy = null;

    //    方法中要对是否是代理执行的方法进行判断
    @Override
    public void request() {
        if (isProxy()) {
            System.out.println("request execute");
        } else {
            System.out.println("use proxy!");
        }
    }

    //    返回一个该真实对象的代理
    @Override
    public Subject getProxy() {
        this.proxy = new Proxy(this);
        return proxy;
    }

    //    检查是否由代理类执行的方法
//    想要完全强制代理 就必须获取调用者对象与保存的代理对象进行比较
    private boolean isProxy() {
        return !(proxy == null);
    }
}
