package xyz.makise.proxy.forced;

interface Subject {
    void request();
    Subject getProxy();
}
