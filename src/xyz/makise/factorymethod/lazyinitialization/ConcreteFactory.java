package xyz.makise.factorymethod.lazyinitialization;

import java.util.HashMap;
import java.util.Map;

//    �����������������Ĳ�Ʒ
//    ���ݿ����ӳؿ���ʹ�����ֱ��ֵĹ�������ģʽ
class ConcreteFactory {
    static final Map<String,Product>productMap = new HashMap<>();
//    ������Ҫע���̰߳�ȫ����
    synchronized Product createProduct(String type){
        Product product = null;
        if(productMap.containsKey(type)){
            product = productMap.get(type);
        }else {
            if(type.equals("ConcreteProduct1")){
                product = new ConcreteProduct1();
            }else {
                product = new ConcreteProduct2();
            }
            productMap.put(type,product);
        }
        return product;
    }
}
