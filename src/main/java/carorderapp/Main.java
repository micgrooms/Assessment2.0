package carorderapp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Engine carEngine = new Engine(6);
        Engine bikeEngine = new Engine(4);
        Engine truckEngine = new Engine(8);

        Car car = new Car("Honda Accord", 5, 50.0, carEngine, 100);
        Truck truck = new Truck("GM Truck", 5, 100.0, truckEngine, 75);
        MotorBike motorBike = new MotorBike("Suzuki Bike", 5, 75.00, bikeEngine, 50, 2);

        Vehicle[] lot1 = {car, truck, motorBike};

        VehicleApp.printVehicleNamesAndPrices(lot1);

        System.out.println("==========");

        ArrayList<Vehicle> driveableArrayList = new ArrayList<>();
        driveableArrayList.add(car);
        driveableArrayList.add(truck);
        //driveableArrayList.add(motorBike);

        VehicleApp.getSpeedOfDriveableVehicles(driveableArrayList);
        System.out.println("Before tax");
        System.out.println(truck.totalBeforeTax(truck));
        System.out.println("After tax");
        truck.totalAfterTax(truck);

        VehicleApp.sortAndPrintDrivableVehiclesBySpeed(driveableArrayList);


    }
}
