package xyz.makise.memento.multimemo;

import java.util.HashMap;

/*
* ͨ��һ��HashMap���������� key������ʱ�������������������ַ�������汾�ŵ�
* */
class Caretaker {
    private HashMap<String,Memento> memMap = new HashMap<>();

    public Memento getMemento(String index){
        return memMap.get(index);
    }

    public void setMemento(String index, Memento memento){
        this.memMap.put(index, memento);
    }
}
