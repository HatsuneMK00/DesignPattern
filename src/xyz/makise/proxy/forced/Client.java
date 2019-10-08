package xyz.makise.proxy.forced;

class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxy1 = new Proxy(realSubject);
        proxy1.request();
        realSubject.request();
        Subject proxy2 = realSubject.getProxy();
        proxy2.request();
//        这一行也执行了 但是没有代理的增强方法
        realSubject.request();
    }
}
