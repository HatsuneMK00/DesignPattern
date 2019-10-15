package xyz.makise.strategy;

//这个类是一个对Strategy类族的封装类
//用于将高层调用模块和算法模块隔离
//封装了整个Strategy类 封装了Strategy里可能的变化
//并且这种做法是符合面向接口的（基本上就是在面向接口 只是多了一个封装类）
//和代理模式里的代理类很像
class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void exec(){
        strategy.exec();
    }
}
