package xyz.makise.builder;

//����ÿһ�������Ʒ�� ����Ӧ��һ�����彨������
//����������Director�����
class ConcreteBuilder1 extends Builder{
    @Override
    public Product getProduct() {
        Product product = new ConcreteProduct1();
        product.setSequence(super.sequence);
        return product;
    }
}
