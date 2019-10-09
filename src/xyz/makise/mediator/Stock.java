package xyz.makise.mediator;

//����ͬ����(��������)֮�������໥����
class Stock {
    //    ��������ʹ���˾�̬���� ��Ϊ�����ϵ�ʾ�������� �н��߶������Stock������Clientʹ�õ�Stock�������ͬһ�� ��˱���Ҫ��һ����ȫ�ֱ�����Ϊ
//    ��Ա����
//    ���￼�ǽ��н����еĶ�������ʹ�õĶ������ͳһ �����н��߳�Ϊ���ʹ�õ��Ǹ�������н��������������������ϵ��������
    private int stockNum = 0;
    private AbstractMediator mediator;

    public Stock(AbstractMediator mediator) {
        this.mediator = mediator;
        this.mediator.setStock(this);
    }

//    �����ҵ���߼�
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

//    �÷���������Sale���Purchase��
//    ��Ҫ֪ͨ���ǿ�����Լ���Ҫ����
    public void clearStock(){
        System.out.println("clear stock: " + this.stockNum);
        mediator.execute("stock.clear");
    }
}
