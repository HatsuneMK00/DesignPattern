package xyz.makise.builder;

//对于每一个具体产品类 都对应有一个具体建造者类
//建造者类由Director类管理
class ConcreteBuilder1 extends Builder{
    @Override
    public Product getProduct() {
        Product product = new ConcreteProduct1();
        product.setSequence(super.sequence);
        return product;
    }
}
