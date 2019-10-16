package xyz.makise.adapter.objectversion;

class Client {
    public static void main(String[] args) {
//        原来的业务逻辑
        ConcreteTarget concreteTarget = new ConcreteTarget();
        concreteTarget.request();
//        新的业务逻辑 通过参数传入依赖的实现类
//        这些新的实现类肯定是知道的 但是直接使用他们会导致项目原有代码的大更改 所以使用适配器模式
        Target adapter = new Adapter(new ConcreteOrigin1(),new ConcreteOrigin2(),new ConcreteOrigin3());
        adapter.request();
    }
}
