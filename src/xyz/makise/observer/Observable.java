package xyz.makise.observer;

interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
//    ��߿�����֪ͨ��ʱ�� ����һ��DTO��data transfer object���������ݴ��䣨��Ϣ���ݣ�
    void notifyObserver(String context);
}
