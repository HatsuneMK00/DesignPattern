package xyz.makise.prototype;

//使用邮件发送的场景编写原型模式
//可以体现出原型模式的一个作用 多线程时的线程安全解决方案之一（每次new一个新对象就是线程安全的了 但是是靠clone方法）
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
