package xyz.makise.memento.multimemo;

import java.util.HashMap;

/*
* 通过一个HashMap来存备份对象的状态 有了通用性
* */
class Memento {
    private HashMap<String,Object> stateMap;

//    HashMap的创建工作由更加底层的BeanUtils完成
    public Memento(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
