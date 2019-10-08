package xyz.makise.proxy.dynamic;

public class MyAspect implements IAdvice {
    @Override
    public void before() {
        System.out.println("before");
    }

    @Override
    public void after() {
        System.out.println("after");
    }
}
