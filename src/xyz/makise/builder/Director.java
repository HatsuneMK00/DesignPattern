package xyz.makise.builder;

import java.util.ArrayList;

//建造者模式结合模板方法模式
//Director对Builder组装的顺序再进行一层封装
//为每个顺序取了一个名字标识 Client使用的时候直接调用方法 隐藏了sequence数组
//在有了这一层封装之后 还需要上一层Builder的封装吗
//不可以由Director直接对产品类进行操作吗
class Director {
    //    Director中需要有顺序和所有的有必要的建造者
    private ArrayList<String> sequence = new ArrayList<>();
    private Builder builder1 = new ConcreteBuilder1();
    private Builder builder2 = new ConcreteBuilder2();

    Product getATypeConcreteProduct1() {
//        使用的是类成员list 用之前清一下
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
