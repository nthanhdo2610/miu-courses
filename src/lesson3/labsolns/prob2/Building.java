package lesson3.labsolns.prob2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Building {
    private String name;
    private float maintenanceCost;
    private List<Apartment> apartments;
    private LandlordInfo landlord;

    private static final DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    public Building(String name, float maintenanceCost, Map<String, Double> apts, LandlordInfo landlord) {

        if (apts.isEmpty() || landlord == null) {
            throw new RuntimeException("Invalid Building!");
        }
        this.name = name;
        this.maintenanceCost = maintenanceCost;
        this.landlord = landlord;
        List<Apartment> apartments = new ArrayList<>();
        for (String key : apts.keySet()) {
            if (apts.get(key) != null) {
                apartments.add(new Apartment(key, apts.get(key).floatValue(), this));
            }
        }
        this.apartments = apartments;
    }

    double getMonthlyProfit(Date date) {
        double profits = -1 * this.getMaintenanceCost();
        for (Apartment a : this.getApartments()) {
            if (sdf.format(date).equals(sdf.format(a.getRentDate()))) {
                profits = profits + a.getRentalFee();
            }
        }
        return profits;
    }

    public void addApartment(Apartment a) {
        apartments.add(a);
    }

    public String getName() {
        return name;
    }

    public float getMaintenanceCost() {
        return maintenanceCost;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public LandlordInfo getLandlord() {
        return landlord;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", maintenanceCost=" + maintenanceCost +
                ", apartments=" + apartments +
                ", landlord=" + landlord +
                '}';
    }
}
