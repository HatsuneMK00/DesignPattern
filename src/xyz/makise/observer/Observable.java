package xyz.makise.observer;

interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
//    这边可以在通知的时候 传入一个DTO（data transfer object）用于数据传输（消息传递）
    void notifyObserver(String context);
}
