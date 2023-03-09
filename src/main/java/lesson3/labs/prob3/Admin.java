package lesson3.labs.prob3;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    public static double computeTotalRent(Property[] properties) {
        double totalRent = 0;
        for (Property o : properties) {
            totalRent += o.computeRent();
        }
        return totalRent;
    }

    public static List<Property> getRentalByCity(Property[] properties, String city) {
        List<Property> list = new ArrayList<>();
        for (Property p : properties) {
            if (city.equals(p.getAddress().getCity())) {
                list.add(p);
            }
        }
        return list;
    }
}
