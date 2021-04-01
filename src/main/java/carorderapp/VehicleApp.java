package carorderapp;

import java.util.ArrayList;
import java.util.Collections;
public class VehicleApp {



    public static void printVehicleNamesAndPrices(Vehicle[] vehicles){
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i].getName() + " " + vehicles[i].getPrice());
        }
    }

    public static void getSpeedOfDriveableVehicles(ArrayList<Vehicle> driveableArrayList) {
        for (Vehicle x: driveableArrayList) {
            System.out.println(x.getSpeed());
        }

    }

    public static void sortAndPrintDrivableVehiclesBySpeed(ArrayList<Vehicle> driveables) {
        driveables.sort(driveables, new VehicleComparator());
        for (Vehicle i: driveables) {
            System.out.println(i.getSpeed());
        }

    }
}
