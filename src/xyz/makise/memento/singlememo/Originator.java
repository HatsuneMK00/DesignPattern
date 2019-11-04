package xyz.makise.memento.singlememo;

/*
* 基于单一职责原则 认为创建备份与该类原本的业务逻辑属于两个功能 因此应该单独列出一个备份类Memento类
* 基于迪米特原则 又多出了一个备份的管理者用于管理备份
* 备份的管理完全独立与该业务类 所有和备份相关的功能都是通过扩展加上去的
* 这个模式里 Caretaker或者Memento中有一个类显得不必要 也就那么一个状态 让整个程序的结构很复杂
* */
class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

//    注意这里创建备份不能太频繁 否则创建出来的备份可能不会被垃圾回收器回收 导致内存泄漏
    public Memento createMemento(){
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento){
//        恢复前应该有空指针的断言
        this.state = memento.getState();
    }
}
