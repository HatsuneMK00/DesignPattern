package xyz.makise.proxy.standard;

//代理类必须实现需要代理的对象实现的接口才能够对外实现封装好的代理
//外界像使用真实对象一样使用代理对象
//代理对象可以为真实对象的方法添加增强 或是延迟真实对象的实例化
class Proxy implements Subject, IAdvice {
    private Subject subject = null;
//    我感觉这样设计并不是很好 不太能实现延迟实例化的功能
//    private String info;

//    从外部传入代理目标 可以传入很多个
    public Proxy(Subject subject) {
        this.subject = subject;
    }

//    @Override
//    public String getInfo() {
//        return this.info;
//    }
//
//    @Override
//    public void setInfo(String info) {
//        this.info = info;
//    }

    @Override
    public void heavyJob() {
//        进行增强
        before();
        subject.heavyJob();
        after();
    }

    @Override
    public void before() {
        System.out.println("before execute");
    }

    @Override
    public void after() {
        System.out.println("after execute");
    }
}
