package xyz.makise.mediator;

//具体的中介类应当专注于业务逻辑的实现
//抽象类中做好了依赖注入相关的工作
public class Mediator extends AbstractMediator {

//    这边所有case里的方法应该抽取成私有函数
    @Override
    public void execute(String str, Object... objects) {
        switch (str) {
            case "sale.sell": {
                int num = (int) objects[0];
                if (num > stock.getStockNum()){
                    purchase.buy(num);
                }
                stock.decrease(num);
                break;
            }
            case "sale.offsale": {
                System.out.println("off sale: " + stock.getStockNum());
                break;
            }
            case "purchase.buy": {
                stock.increase((Integer) objects[0]);
            }
            case "stock.clear": {
                sale.offSale();
                purchase.stopBuy();
            }
        }
    }
}
