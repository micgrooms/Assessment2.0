package carorderapp;

public class Truck extends Vehicle implements Driveable{


     public static final double TAX = 0.20;


    public Truck(String name, int qty, double price, Engine engine, int speed) {
        super(name, qty, price, engine, speed);
    }

    //getters
    public double getTAX() {
        return TAX;
    }


    @Override
    public int milesPerHour() {
        return milesPerHour();
    }

    @Override
    public void totalAfterTax(Vehicle vehicle) {
        double total = getPrice() * getTAX();
        total = total + getPrice() * getQty();
        System.out.println(total);
    }
}

