package xyz.makise.factorymethod.standard;

public class ConcreteFactory extends Factory {

    @Override
//    ���Ҳ����ѡ��һ��ָʾ�ַ��� ����ͬ��Ч����ָ��������ʹ����һ��Product��ʵ�������������
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try{
//            ͨ��������ƴ�������
            product = (Product) Class.forName(c.getName()).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return (T) product;
    }
}
