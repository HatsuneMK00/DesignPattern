package xyz.makise.decorator;

//所有Component的实现类都可以被装饰 不管是兄弟类还是继承类
class ConcreteComponent implements Component{
    @Override
//    接口方法默认是public
    public void operate() {
        System.out.println("do something");
    }
}
