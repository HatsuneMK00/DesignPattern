package xyz.makise.abstractfactory;

//���������� һ�����е� һ����Ů�� ÿ����ʵ����������
//����Ʒ��2��ά�ȵĲ��� ���������Ͳ�Ʒ����ֱ��Բ�ͬ��ά������
//��Ϊ2*3���������ǹ�������3*2���������ǲ�Ʒ���Ľṹ
//������ÿһ����Ʒ����Ӧһ�������Ķ๤������ģʽ
//��n����Ʒ�� ����n����������
//��ͬ��Ʒ��Ĳ�Ʒ����ͬ������ ��Ϊһ�������Ʒ�µĲ�Ʒ
public interface HumanFactory {
    Human createYellowHuman();
    Human createWhiteHuman();
    Human createBlackHuman();
}
