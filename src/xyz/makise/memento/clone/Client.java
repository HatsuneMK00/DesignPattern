package xyz.makise.memento.clone;

/*
* 可以看到这个备份模式相当的简单 所有的备份工作全部都在Originator一个类中实现
* 通过clone实现
* */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
//        创建备份
        originator.createMemento();
//        恢复备份
        originator.restoreMemento();
    }
}
