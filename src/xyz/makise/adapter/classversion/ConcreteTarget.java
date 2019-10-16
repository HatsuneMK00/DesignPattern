package xyz.makise.adapter.classversion;

//这个就是在原有项目中使用的逻辑
class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("doing old stuff");
    }
}
