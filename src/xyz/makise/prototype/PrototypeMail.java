package xyz.makise.prototype;

//ʹ���ʼ����͵ĳ�����дԭ��ģʽ
//�������ֳ�ԭ��ģʽ��һ������ ���߳�ʱ���̰߳�ȫ�������֮һ��ÿ��newһ���¶�������̰߳�ȫ���� �����ǿ�clone������
class PrototypeMail implements Cloneable{
    private String receiver;
    private String sender;
    private String context;
    private String otherFixedThing;
    @Override
    protected PrototypeMail clone() throws CloneNotSupportedException {
        return (PrototypeMail) super.clone();
    }

    public PrototypeMail(String context, String otherFixedThing) {
        this.context = context;
        this.otherFixedThing = otherFixedThing;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getOtherFixedThing() {
        return otherFixedThing;
    }

    public void setOtherFixedThing(String otherFixedThing) {
        this.otherFixedThing = otherFixedThing;
    }
}
