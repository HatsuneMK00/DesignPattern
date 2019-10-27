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
}
