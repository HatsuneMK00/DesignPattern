package xyz.makise.strategy;

interface IStrategy {
//    当然可以接受参数 但是这个参数规定了整个策略（算法）家族接受的参数
//    可以有多个算法（方法）
    void exec();
}
