package xyz.makise.memento.singlememo;

class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
//        ����һ�����ݹ�����
        Caretaker caretaker = new Caretaker();
//        ���ñ���
        caretaker.setMemento(originator.createMemento());
//        ҵ���߼���Ҫ�Ĳ���
        originator.setState("new state");
//        ��ԭ����
        originator.restoreMemento(caretaker.getMemento());
    }
}
