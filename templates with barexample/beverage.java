abstract class beverage {
    
    protected void pour() {
        System.out.println("Pour into a glass");
    }

    
    protected abstract void addcondiment(int qty);

    protected void stir() {} 

    protected void serve() {
        System.out.println("Served by waiter");
    }

   
    public void template(int qty) {
        pour();
        addcondiment(qty);
        stir();
        serve();
    }
}
