package xyz.makise.mediator;

import java.util.Random;

class Sale {
    //    Sale��Ĵ󲿷ֲ�����������Stock�����
    private AbstractMediator mediator;
    private int saleNum = 0;

    public Sale(AbstractMediator mediator) {
        this.mediator = mediator;
        this.mediator.setSale(this);
    }

    public int getSaleNum() {
        return saleNum;
    }

    //    ����һ��0-100��ֵ��ʾ����״̬ Purchase��Ҫ�����������
    public int getSaleStatus() {
        Random random = new Random();
        return random.nextInt(100);
    }

    //    ������ ֪ͨStock������
    public void offSale() {
        mediator.execute("sale.offsale");
    }

    public void sell(int num) {
        saleNum += num;
        mediator.execute("sale.sell", num);
    }
}
