package xyz.makise.memento.singlememo;

/*
*  ���ǵ�һ״̬ ��һ���ݵ�����µı���¼ģʽ������ģʽ��
*  ������൱��һ��JavaBean
* */
class Memento {
//    ֮�������һ�ֲ��������κ�����ʵķ�ʽ �ǽ�Memento��ʵ��Ϊ�ڲ��� ˽�����еĲ��� ���ǲ��ṩ����������
//    ���񲻶� ������Ҫ��������ȡ״̬
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

//    ����������Բ��ṩ��
//    public void setState(String state) {
//        this.state = state;
//    }
}
