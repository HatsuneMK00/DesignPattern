package xyz.makise.builder;

import java.util.ArrayList;

//������ģʽ���ģ�巽��ģʽ
//Director��Builder��װ��˳���ٽ���һ���װ
//Ϊÿ��˳��ȡ��һ�����ֱ�ʶ Clientʹ�õ�ʱ��ֱ�ӵ��÷��� ������sequence����
//��������һ���װ֮�� ����Ҫ��һ��Builder�ķ�װ��
//��������Directorֱ�ӶԲ�Ʒ����в�����
class Director {
    //    Director����Ҫ��˳������е��б�Ҫ�Ľ�����
    private ArrayList<String> sequence = new ArrayList<>();
    private Builder builder1 = new ConcreteBuilder1();
    private Builder builder2 = new ConcreteBuilder2();

    Product getATypeConcreteProduct1() {
//        ʹ�õ������Աlist ��֮ǰ��һ��
        this.sequence.clear();
        sequence.add("method1");
        sequence.add("method3");
        sequence.add("method4");
        builder1.setSequence(this.sequence);
        return builder1.getProduct();
    }

    Product getBTypeConcreteProduct1() {
        this.sequence.clear();
        sequence.add("method2");
        sequence.add("method1");
        sequence.add("method3");
        sequence.add("method4");
        builder1.setSequence(this.sequence);
        return builder1.getProduct();
    }

    Product getBTypeConcreteProduct2() {
        this.sequence.clear();
        sequence.add("method1");
        sequence.add("method3");
        sequence.add("method2");
        sequence.add("method4");
        builder2.setSequence(this.sequence);
        return builder2.getProduct();
    }

    Product getATypeConcreteProduct2() {
        this.sequence.clear();
        sequence.add("method2");
        sequence.add("method4");
        sequence.add("method3");
        builder2.setSequence(this.sequence);
        return builder2.getProduct();
    }
}
