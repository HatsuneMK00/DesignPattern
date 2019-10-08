package xyz.makise.builder.lessbuilder;

import java.util.ArrayList;

//��Ӧ����һ�ּ򻯵�Builderģʽ
//����ģʽ��ͼ�����ģʽ�е�д��
//ͼ�����ģʽ�еĽ�����ģʽû�н��ģ�巽��ģʽ ���˳����construct��ȷ��

//��������Ʒ��ʱ���и��������ʱ ����Ҫ�û�ԭ���Ľ�����ģʽ
//���ּ򻯵�ģʽ�������������չ���Ǻ��Ѻ�
//����ȥ��������ģʽ�м�һ�����
//Builder��ʵ����ȡ����Director�� ��ÿһ������Builder�඼ֱ�Ӱ�����Builder����
class Director {
    private ArrayList<String> sequence = new ArrayList<>();

//    �൱��һ��construct����
    Builder getATypeConcreteProduct1() {
//        ʹ�õ������Աlist ��֮ǰ��һ��
        this.sequence.clear();
        sequence.add("method1");
        sequence.add("method3");
        sequence.add("method4");
        ConcreteBuilder1 product = new ConcreteBuilder1();
        product.setSequence(this.sequence);
        return product;
    }

    Builder getBTypeConcreteProduct1() {
        this.sequence.clear();
        sequence.add("method2");
        sequence.add("method1");
        sequence.add("method3");
        sequence.add("method4");
        Builder builder = new ConcreteBuilder1();
        builder.setSequence(this.sequence);
        return builder;
    }

    Builder getBTypeConcreteProduct2() {
        this.sequence.clear();
        sequence.add("method1");
        sequence.add("method3");
        sequence.add("method2");
        sequence.add("method4");
        Builder builder = new ConcreteBuilder2();
        builder.setSequence(this.sequence);
        return builder;
    }

    Builder getATypeConcreteProduct2() {
        this.sequence.clear();
        sequence.add("method2");
        sequence.add("method4");
        sequence.add("method3");
        Builder builder = new ConcreteBuilder2();
        builder.setSequence(this.sequence);
        return builder;
    }
}
