package xyz.makise.templatemethod;

//模板方法是一种父类依赖子类的体现 子类的不同实现会对父类的方法运行结果产生影响
//许多的框架里就会写一个抽象类 然后实现许多它的子类
//当需要定制功能时 可以自行实现抽象类 或是继承其子类 覆写方法后就可以达到扩展功能的作用
abstract class AbstractClass {
//    基本方法声明为protected 符合迪米特法则
    protected abstract void doA();
    protected abstract void doB();
    protected abstract void doC();
    protected abstract void doD();
//    钩子方法 是模板方法模式中重要的一环
//
//    子类可以通过覆写该方法 设置不同的返回值 使模板方法的执行结果不同
//    适合用于应对需求扩展
    protected boolean isSomeStatus(){
        return true;
    }
//    为了避免修改 可以将模板方法声明为final的
    final void templateMethod(){
        doB();
        doA();
        doC();
//        满足条件时再执行D
        if (isSomeStatus()) {
            doD();
        }
    }
}
