package xyz.makise.mediator;

//这里使用一个库存、销售、采购的进存销场景
//演示中介者模式在将复杂网状依赖转化为星型依赖的场景下的作用
abstract class AbstractMediator {
    protected Stock stock;
    protected Purchase purchase;
    protected Sale sale;

    public AbstractMediator() {
        this.stock = new Stock(this);
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    //    中介者中最重要的方法 事件方法 用于处理多个对象间的关系
//    具体的处理都在实现类中用私有方法实现
//    后面的Object数组为参数列表
    public abstract void execute(String str,Object...objects);
}
