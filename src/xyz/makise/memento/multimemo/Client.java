package xyz.makise.memento.multimemo;

class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
//        创建一个备份管理器 这个备份管理器感觉终于有了一点存在的价值
        Caretaker caretaker = new Caretaker();
        originator.setState1("1");
        originator.setState2("2");
        originator.setState3("3");
//        创建一个备份
        caretaker.setMemento("001",originator.createMemento());
        originator.setState1("10");
        originator.setState2("20");
        originator.setState3("30");
        System.out.println(originator);
//        创建一个备份
        caretaker.setMemento("002",originator.createMemento());
//        还原一个备份
        originator.restoreMemento(caretaker.getMemento("001"));
        System.out.println(originator);
        originator.restoreMemento(caretaker.getMemento("002"));
        System.out.println(originator);
    }
}
