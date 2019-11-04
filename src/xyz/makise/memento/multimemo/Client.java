package xyz.makise.memento.multimemo;

class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
//        ����һ�����ݹ����� ������ݹ������о���������һ����ڵļ�ֵ
        Caretaker caretaker = new Caretaker();
        originator.setState1("1");
        originator.setState2("2");
        originator.setState3("3");
//        ����һ������
        caretaker.setMemento("001",originator.createMemento());
        originator.setState1("10");
        originator.setState2("20");
        originator.setState3("30");
        System.out.println(originator);
//        ����һ������
        caretaker.setMemento("002",originator.createMemento());
//        ��ԭһ������
        originator.restoreMemento(caretaker.getMemento("001"));
        System.out.println(originator);
        originator.restoreMemento(caretaker.getMemento("002"));
        System.out.println(originator);
    }
}
