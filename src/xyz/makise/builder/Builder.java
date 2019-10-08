package xyz.makise.builder;

import java.util.ArrayList;

//Builder对Product产品的组装进行一层封装
//封装了对产品类的直接操作
//这里是不是用了工厂方法模式里的多工厂模式呢
class Builder {
    ArrayList<String> sequence;

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

    public Product getProduct(){
        return null;
    }
}
