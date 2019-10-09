package xyz.makise.mediator;

//����ʹ��һ����桢���ۡ��ɹ��Ľ���������
//��ʾ�н���ģʽ�ڽ�������״����ת��Ϊ���������ĳ����µ�����
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

    //    �н���������Ҫ�ķ��� �¼����� ���ڴ����������Ĺ�ϵ
//    ����Ĵ�����ʵ��������˽�з���ʵ��
//    �����Object����Ϊ�����б�
    public abstract void execute(String str,Object...objects);
}
