package xyz.makise.memento.multimemo;

import java.util.HashMap;

/*
* ͨ��һ��HashMap���汸�ݶ����״̬ ����ͨ����
* */
class Memento {
    private HashMap<String,Object> stateMap;

//    HashMap�Ĵ��������ɸ��ӵײ��BeanUtils���
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
