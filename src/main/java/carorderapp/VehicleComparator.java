package carorderapp;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class VehicleComparator implements Comparator<Driveable>{


    @Override
    public int compare(Driveable driveable1, Driveable driveable2) {
        if (driveable1.milesPerHour() > driveable2.milesPerHour()){
            return 1;
        }
        return -1;
    }



}
