package xyz.makise.memento.clone;

/*
* 通过clone的方式实现备份 在较简单的备份模式下可以使用 将备份类 备份管理员类全部都整合到了一个类里面
* 通过clone的方式实现
* 这边其实不用clone 只要是简单的备份模式的话 都可以考虑直接在一个类里面实现 不考虑单一职责和迪米特之类的原则
* */
class Originator implements Cloneable{
    private String state;
//    在自己里面放一个自己的备份 取代了备份管理者的功能
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
