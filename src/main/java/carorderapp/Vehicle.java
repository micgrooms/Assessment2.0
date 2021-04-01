package carorderapp;

public abstract class Vehicle extends Product{

    //Instance variables all vehicles must have these things
    private int qty;
    private double price;
    private Engine engine;
    private int speed;
    private static final double TAX = 0.15;

    public Vehicle(String name, int qty, double price, Engine engine, int speed) {
        super(name);
        this.qty = qty;
        this.price = price;
        this.engine = engine;
        this.speed = speed;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getSpeed() {
        return speed;
    }

    public double getTAX() {
        return TAX;
    }

    //Method creation
    public double totalBeforeTax(Vehicle vehicle){
        return price * qty;
    }

    public double calcTax(Vehicle vehicle){
        return ((qty * price) * TAX) +price;
    }

    public abstract void totalAfterTax(Vehicle vehicle);



}
