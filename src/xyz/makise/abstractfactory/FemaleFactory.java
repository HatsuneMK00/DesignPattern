package xyz.makise.abstractfactory;

//只负责造女的
//有M个产品等级 就要有M个实现工厂类 每个实现工厂里实现不同产品族的生产
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
