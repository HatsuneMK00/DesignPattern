package xyz.makise.memento.singlememo;

/*
* 这个类是备份的管理者 这里是单一备份的情况
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
