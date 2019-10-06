package xyz.makise.abstractfactory;

//工厂分两个 一个造男的 一个造女的 每个都实现三个方法
//即产品有2个维度的参数 工厂生产和产品抽象分别以不同的维度优先
//变为2*3（在这里是工厂）与3*2（在这里是产品）的结构
//并非是每一个产品都对应一个工厂的多工厂方法模式
//有n个产品族 就有n个生产方法
//不同产品族的产品有相同特征的 成为一个抽象产品下的产品
public interface HumanFactory {
    Human createYellowHuman();
    Human createWhiteHuman();
    Human createBlackHuman();
}
