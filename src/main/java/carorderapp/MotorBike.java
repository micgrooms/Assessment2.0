package carorderapp;

public class MotorBike extends Vehicle implements Driveable{

    //instance variable unique to motorbike
    private int numOfWheels;


    public MotorBike(String name, int qty, double price, Engine engine, int speed, int numOfWheels) {
        super(name, qty, price, engine, speed);
        this.numOfWheels = numOfWheels;
    }

    //getter for num of wheels
    public int getNumOfWheels() {
        return numOfWheels;
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
