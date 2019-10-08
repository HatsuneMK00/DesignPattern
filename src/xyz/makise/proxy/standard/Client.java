package xyz.makise.proxy.standard;

public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();

        Proxy proxy = new Proxy(realSubject);
        proxy.heavyJob();
    }
}
