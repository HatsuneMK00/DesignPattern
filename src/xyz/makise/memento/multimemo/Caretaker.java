package xyz.makise.memento.multimemo;

import java.util.HashMap;

/*
* 通过一个HashMap保存多个备份 key可以是时间戳或是其他有意义的字符串比如版本号等
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
