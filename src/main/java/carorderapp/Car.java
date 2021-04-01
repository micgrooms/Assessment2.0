package carorderapp;

public class Car extends Vehicle implements Driveable{


    public Car(String name, int qty, double price, Engine engine, int speed) {
        super(name, qty, price, engine, speed);
    }


    @Override
    public void totalAfterTax(Vehicle vehicle) {
        double total = getPrice() * getTAX();
        total = total + getPrice() * getQty();
        System.out.println(total);

    }

    @Override
    public int milesPerHour(){
        return milesPerHour();
    }
}
