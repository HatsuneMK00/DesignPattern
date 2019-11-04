package xyz.makise.memento.singlememo;

/*
* ���ڵ�һְ��ԭ�� ��Ϊ�������������ԭ����ҵ���߼������������� ���Ӧ�õ����г�һ��������Memento��
* ���ڵ�����ԭ�� �ֶ����һ�����ݵĹ��������ڹ�����
* ���ݵĹ�����ȫ�������ҵ���� ���кͱ�����صĹ��ܶ���ͨ����չ����ȥ��
* ���ģʽ�� Caretaker����Memento����һ�����Եò���Ҫ Ҳ����ôһ��״̬ ����������Ľṹ�ܸ���
* */
class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

//    ע�����ﴴ�����ݲ���̫Ƶ�� ���򴴽������ı��ݿ��ܲ��ᱻ�������������� �����ڴ�й©
    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento){
//        �ָ�ǰӦ���п�ָ��Ķ���
        this.state = memento.getState();
    }
}
