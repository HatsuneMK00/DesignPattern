package xyz.makise.builder;

//����ÿһ�������Ʒ�� ����Ӧ��һ�����彨������
//����������Director�����
class ConcreteBuilder2 extends Builder{
    @Override
    public Product getProduct() {
        Product product = new ConcreteProduct2();
        product.setSequence(super.sequence);
        return product;
    }
}
