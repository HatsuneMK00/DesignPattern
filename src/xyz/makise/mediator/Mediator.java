package xyz.makise.mediator;

//������н���Ӧ��רע��ҵ���߼���ʵ��
//������������������ע����صĹ���
public class Mediator extends AbstractMediator {

//    �������case��ķ���Ӧ�ó�ȡ��˽�к���
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
