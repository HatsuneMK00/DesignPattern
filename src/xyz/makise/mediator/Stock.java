package xyz.makise.mediator;

//三个同事类(进存销类)之间两两相互依赖
class Stock {
    //    这里书上使用了静态变量 因为在书上的示例代码中 中介者对象里的Stock类对象和Client使用的Stock类对象不是同一个 因此必须要有一个类全局变量作为
//    成员变量
//    这里考虑将中介者中的对象和外界使用的对象进行统一 即让中介者成为外界使用的那个对象的中介与其他对象进行依赖关系（交互）
    private int stockNum = 0;
    private AbstractMediator mediator;

    public Stock(AbstractMediator mediator) {
        this.mediator = mediator;
        this.mediator.setStock(this);
    }

//    自身的业务逻辑
    public void increase(int number) {
        this.stockNum += number;
        System.out.println("stock: " + stockNum);
    }

    public void decrease(int number) {
        this.stockNum += number;
        System.out.println("stock: " + stockNum);
    }

    public int getStockNum() {
        return stockNum;
    }

//    该方法依赖于Sale类和Purchase类
//    需要通知它们快点卖以及不要买了
    public void clearStock(){
        System.out.println("clear stock: " + this.stockNum);
        mediator.execute("stock.clear");
    }
}
