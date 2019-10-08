package xyz.makise.proxy.standard;

public class RealSubject implements Subject{
    private String info;

//    @Override
//    public String getInfo() {
//        System.out.println("easy job being done by the proxy");
//        return this.info;
//    }
//
//    @Override
//    public void setInfo(String info) {
//        System.out.println("easy job being done by the proxy");
//        this.info = info;
//    }

    @Override
    public void heavyJob() {
        System.out.println("doing some heavy job by the real object");
    }
}
