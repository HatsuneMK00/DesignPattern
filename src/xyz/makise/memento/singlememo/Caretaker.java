package xyz.makise.memento.singlememo;

/*
* ������Ǳ��ݵĹ����� �����ǵ�һ���ݵ����
* */
class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
