package xyz.makise.builder.lessbuilder;

import java.util.ArrayList;

//这应该是一种简化的Builder模式
//当生产产品的时候有更多的需求时 就需要用回原本的建造者模式
//这种简化的模式对上述需求的扩展不是很友好
//尝试去掉建造者模式中间一层抽象
//Builder类实际上取代了Director类 而每一个具体Builder类都直接包含在Builder类中
class Builder {
    private ArrayList<String> sequence = new ArrayList<>();

    Product getATypeConcreteProduct1() {
//        使用的是类成员list 用之前清一下
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
