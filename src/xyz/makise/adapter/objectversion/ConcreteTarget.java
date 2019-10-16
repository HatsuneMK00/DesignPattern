package xyz.makise.adapter.objectversion;

class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("handling old request");
    }
}
