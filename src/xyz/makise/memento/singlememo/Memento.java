package xyz.makise.memento.singlememo;

/*
*  这是单一状态 单一备份的情况下的备忘录模式（备份模式）
*  这个类相当于一个JavaBean
* */
class Memento {
//    之后介绍了一种不让其他任何类访问的方式 是将Memento类实现为内部类 私有所有的操作 但是不提供不就行了吗
//    好像不对 备份需要被用来读取状态
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

//    这个方法可以不提供吗
//    public void setState(String state) {
//        this.state = state;
//    }
}
