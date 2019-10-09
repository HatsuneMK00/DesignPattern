package xyz.makise.mediator;

class Purchase {
    private AbstractMediator mediator;

    public Purchase(AbstractMediator mediator) {
        this.mediator = mediator;
        this.mediator.setPurchase(this);
    }

    public void buy(int num){
        System.out.println("buy: " + num);
        mediator.execute("purchase.buy",num);
    }

    public void stopBuy(){
        System.out.println("stop buying");
    }
}
