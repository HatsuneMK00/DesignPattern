package xyz.makise.observer;

import java.util.Observable;
import java.util.Observer;

//jdk������ʵ�ֺ���Observable���һЩ��������������ֻ��Ҫʵ�־���ı��۲��ߵ�ҵ���߼����� ʮ�ַ���
//�������ֳ���ģ�巽��ģʽ�ĺã�Ӧ���ǣ�
//��������ʵ�����̰߳�ȫ��
class ConcreteSubject extends Observable {
//    ������ֻҪдҵ���߼����ɣ�
    void doSomething(){
        System.out.println("Observable changed!");
//        ���ﲻ��Ҫʵ�ֿղ�����update�����Ϳ���ʹ�����notify
//        ��Ϊ�������Ҳ��ʹ�����вε�notifyObservers()��ʵ�ֵģ������argsΪnull
//        �ɱ��۲��ߵľ��巽�������Ƿ���Ҫ֪ͨ���й۲���
//        ֻ��������change�ĲŻ����֪ͨ ���򲻻����֪ͨ
//        �����ڲ���Ҫ��ʱ�򲻽��и��� �������Ч��
//        ע�����change��һ����Ա���� ����Ǳ����з������е� �ڷ�������Ҫ��ʽ���������ֵ��ʵ�ֿ����͹ر�֪ͨ
        this.setChanged();
//        ˳���ǲ����˳����
        this.notifyObservers();
    }
}
