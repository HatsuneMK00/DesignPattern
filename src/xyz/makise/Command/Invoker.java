package xyz.makise.Command;

//这个类封装了一层Command类的调用
//由它接受用户的请求 让Command类执行 即调用Command的execute方法
//因此它要依赖Command对象 但是与Receiver完全解耦
class Invoker {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

//    这个函数专门执行execute函数
    public void action(){
        try{
            command.execute();
        }catch (NullPointerException e){
            e.printStackTrace();
        }

    }
}
