package xyz.makise.facade;

//子系统相关的类
//通过门面模式 可以在不让子系统与高层调用模块产生依赖的前提下
//将想要暴露出去的方法都暴露出去
class ClassC {
    public void doSomethingC(){
        System.out.println("doSomethingC");
    }
}
