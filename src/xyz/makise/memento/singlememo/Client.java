package xyz.makise.memento.singlememo;

class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
//        创建一个备份管理者
        Caretaker caretaker = new Caretaker();
//        设置备份
        caretaker.setMemento(originator.createMemento());
//        业务逻辑需要的操作
        originator.setState("new state");
//        还原备份
        originator.restoreMemento(caretaker.getMemento());
    }
}
