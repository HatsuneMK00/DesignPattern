package xyz.makise.adapter.classversion;

class Client {
    public static void main(String[] args) {
//        原有的业务逻辑
        Target concreteTarget = new ConcreteTarget();
        concreteTarget.request();
//        现在的业务逻辑
        Target adapter = new Adapter();
        adapter.request();
    }
}
