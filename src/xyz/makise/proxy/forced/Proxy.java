package xyz.makise.proxy.forced;

class Proxy implements IAdvice, Subject {
    Subject subject = null;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void before() {
        System.out.println("before");
    }

    @Override
    public void after() {
        System.out.println("after");
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    @Override
    public Subject getProxy() {
        return this;
    }

}
