package xyz.makise.adapter.objectversion;

//这边是新的类
//这很符合单一职责原则的要求 一堆的实现类都需要适配
//或者是适配器还需要依赖其他的类的情况下 都可以使用更加灵活的对象适配器
interface IOrigin1 {
    void request1();
}
