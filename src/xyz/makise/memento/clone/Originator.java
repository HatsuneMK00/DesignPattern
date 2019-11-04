package xyz.makise.memento.clone;

/*
* ͨ��clone�ķ�ʽʵ�ֱ��� �ڽϼ򵥵ı���ģʽ�¿���ʹ�� �������� ���ݹ���Ա��ȫ�������ϵ���һ��������
* ͨ��clone�ķ�ʽʵ��
* �����ʵ����clone ֻҪ�Ǽ򵥵ı���ģʽ�Ļ� �����Կ���ֱ����һ��������ʵ�� �����ǵ�һְ��͵�����֮���ԭ��
* */
class Originator implements Cloneable{
    private String state;
//    ���Լ������һ���Լ��ı��� ȡ���˱��ݹ����ߵĹ���
    private Originator backup;

    public void createMemento(){
        this.backup = this.clone();
    }

    void restoreMemento(){
        this.setState(backup.getState());
    }

    String getState() {
        return state;
    }

    void setState(String state) {
        this.state = state;
    }

    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
