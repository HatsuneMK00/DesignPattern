package xyz.makise.abstractfactory;

//ֻ������Ů��
//��M����Ʒ�ȼ� ��Ҫ��M��ʵ�ֹ����� ÿ��ʵ�ֹ�����ʵ�ֲ�ͬ��Ʒ�������
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
