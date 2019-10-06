package xyz.makise.factorymethod.simple;

//�򵥹���ģʽ�� ����Factory��ȡ���󹤳��� ʹ�������� ����ʹ��չ����
public class ConcreteFactory {
//    ��������������Ϊ��̬�� ����Ҫʵ����factory�������ʹ��
//    ע���������������ķ���ֵ ���ص���Product������� why��
//    ���յ�ʱ�����ýӿ�����յ� ֱ�ӷ���Product������
    public static <T extends Product> T createProduct(Class<T> c){
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
