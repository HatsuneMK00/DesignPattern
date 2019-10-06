package xyz.makise.factorymethod.multifactory;

//为每一个具体产品 都要有一个具体工厂
//符合单一接口原则 但是代码更复杂
// 横向扩展性低 每增加一种新的具体产品 都要有一个新的具体工厂
abstract class Factory {
//    不需要参数了 因为每一个具体产品类 都由对应的工厂类生产
    abstract Product createProduct();
}
