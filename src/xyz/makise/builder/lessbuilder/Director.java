package xyz.makise.builder.lessbuilder;

import java.util.ArrayList;

//这应该是一种简化的Builder模式
//这种模式是图解设计模式中的写法
//图解设计模式中的建造者模式没有结合模板方法模式 因此顺序在construct中确定

//当生产产品的时候有更多的需求时 就需要用回原本的建造者模式
//这种简化的模式对上述需求的扩展不是很友好
//尝试去掉建造者模式中间一层抽象
//Builder类实际上取代了Director类 而每一个具体Builder类都直接包含在Builder类中
class Director {
    private ArrayList<String> sequence = new ArrayList<>();

//    相当于一个construct函数
    Builder getATypeConcreteProduct1() {
//        使用的是类成员list 用之前清一下
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
