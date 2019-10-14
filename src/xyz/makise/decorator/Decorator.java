package xyz.makise.decorator;

//这个抽象类暂时不清楚有什么价值
//感觉唯一的价值就是声明子类都有的component 提取重复代码
abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    abstract void decoratorMethod();

    @Override
    public void operate() {
//        这里的顺序可以通过传入参数的方法设定 也可以由实现类指定
        this.component.operate();
    }
}
