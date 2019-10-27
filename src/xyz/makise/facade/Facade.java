package xyz.makise.facade;

//这个门面类可以将所有想要暴露出去的子系统方法都暴露出去
//同时也是高层调用模块能更加方便的使用子系统功能
class Facade {
    private ClassA classA = new ClassA();
    private ClassB classB = new ClassB();
    private ClassC classC = new ClassC();

    public void doSomethingA(){
        classA.doSomethingA();
    }

    public void doSomethingB(){
        classB.doSomethingB();
    }

    public void doSomethingC(){
        classC.doSomethingC();
    }

//    这种形式的书中说不被允许使用在门面类中
//    因为这个方法组合了两个子系统的类 相当于是在门面类里面写了业务逻辑 这样是不行的（书上严禁 但我觉得可以考虑这么使用）
//    而是需要另开一个封装类封装这个业务逻辑
    public void doSomethingD(){
        classA.doSomethingA();
        classC.doSomethingC();
    }
}
