package xyz.makise.adapter.objectversion;

public class Adapter implements Target {
//    通过组合的方式依赖实现类
    private IOrigin1 origin1;
    private IOrigin2 origin2;
    private IOrigin3 origin3;

    public Adapter(IOrigin1 origin1, IOrigin2 origin2, IOrigin3 origin3) {
        this.origin1 = origin1;
        this.origin2 = origin2;
        this.origin3 = origin3;
    }

    //    这边还可以依赖其他的对象
    @Override
    public void request() {
        origin1.request1();
        origin2.request2();
        origin3.request3();
    }
}
