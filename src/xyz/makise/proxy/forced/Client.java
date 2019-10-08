package xyz.makise.proxy.forced;

class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxy1 = new Proxy(realSubject);
        proxy1.request();
        realSubject.request();
        Subject proxy2 = realSubject.getProxy();
        proxy2.request();
//        ��һ��Ҳִ���� ����û�д������ǿ����
        realSubject.request();
    }
}
