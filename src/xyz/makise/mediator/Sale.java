package xyz.makise.mediator;

import java.util.Random;

class Sale {
    //    Sale类的大部分操作都依赖于Stock库存类
    private AbstractMediator mediator;
    private int saleNum = 0;

    public Sale(AbstractMediator mediator) {
        this.mediator = mediator;
        this.mediator.setSale(this);
    }

    public int getSaleNum() {
        return saleNum;
    }

    //    返回一个0-100的值表示销售状态 Purchase需要依赖这个函数
    public int getSaleStatus() {
        Random random = new Random();
        return random.nextInt(100);
    }

    //    清理存货 通知Stock清理存货
    public void offSale() {
        mediator.execute("sale.offsale");
    }

    public void sell(int num) {
        saleNum += num;
        mediator.execute("sale.sell", num);
    }
}
