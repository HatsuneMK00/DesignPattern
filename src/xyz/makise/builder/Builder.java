package xyz.makise.builder;

import java.util.ArrayList;

//Builder��Product��Ʒ����װ����һ���װ
//��װ�˶Բ�Ʒ���ֱ�Ӳ���
//�����ǲ������˹�������ģʽ��Ķ๤��ģʽ��
class Builder {
    ArrayList<String> sequence;

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

    public Product getProduct(){
        return null;
    }
}
