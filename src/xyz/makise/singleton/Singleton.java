package xyz.makise.singleton;

public class Singleton {
//    保证只有一个单例
    private static final Singleton singleton = new Singleton();
//    私有化构造器
    private Singleton() {
    }
//    通过该方法获得实例
    public static Singleton getInstance(){
        return singleton;
    }
//    其他方法尽量都是static的 why?
    public static void doSomething(){

    }

    public void doOtherThing(){

    }
}
