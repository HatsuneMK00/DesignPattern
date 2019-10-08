package xyz.makise.builder.lessbuilder;

import java.util.ArrayList;

//��Ӧ����һ�ּ򻯵�Builderģʽ
//��������Ʒ��ʱ���и��������ʱ ����Ҫ�û�ԭ���Ľ�����ģʽ
//���ּ򻯵�ģʽ�������������չ���Ǻ��Ѻ�
//����ȥ��������ģʽ�м�һ�����
//Builder��ʵ����ȡ����Director�� ��ÿһ������Builder�඼ֱ�Ӱ�����Builder����
class Builder {
    private ArrayList<String> sequence = new ArrayList<>();

    Product getATypeConcreteProduct1() {
//        ʹ�õ������Աlist ��֮ǰ��һ��
        this.sequence.clear();
        sequence.add("method1");
        sequence.add("method3");
        sequence.add("method4");
        ConcreteProduct1 product = new ConcreteProduct1();
        product.setSequence(this.sequence);
        return product;
    }

    Product getBTypeConcreteProduct1() {
        this.sequence.clear();
        sequence.add("method2");
        sequence.add("method1");
        sequence.add("method3");
        sequence.add("method4");
        Product product = new ConcreteProduct1();
        product.setSequence(this.sequence);
        return product;
    }

    Product getBTypeConcreteProduct2() {
        this.sequence.clear();
        sequence.add("method1");
        sequence.add("method3");
        sequence.add("method2");
        sequence.add("method4");
        Product product = new ConcreteProduct2();
        product.setSequence(this.sequence);
        return product;
    }

    Product getATypeConcreteProduct2() {
        this.sequence.clear();
        sequence.add("method2");
        sequence.add("method4");
        sequence.add("method3");
        Product product = new ConcreteProduct2();
        product.setSequence(this.sequence);
        return product;
    }
}
