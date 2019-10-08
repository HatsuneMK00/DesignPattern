package xyz.makise.builder;

import java.util.ArrayList;

//在建造者模式里面 抽象产品类与具体产品类之间一般会结合模板方法模式
//起到装配顺序不同，效果不同的作用
abstract class Product {
    private ArrayList<String> sequence = null;

    abstract void method1();

    abstract void method2();

    abstract void method3();

    abstract void method4();

    void templateMethod() {
        for (String step : sequence
        ) {
            switch (step) {
                case "method1": {
                    method1();
                    break;
                }
                case "method2": {
                    method2();
                    break;
                }
                case "method3": {
                    method3();
                    break;
                }
                case "method4": {
                    method4();
                    break;
                }
            }
        }
    }

    void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
