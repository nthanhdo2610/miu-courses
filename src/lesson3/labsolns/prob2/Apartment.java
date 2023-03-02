package lesson3.labsolns.prob2;

import java.util.Date;

public class Apartment {

    private String name;
    private float rentalFee;
    private Date rentDate = new Date();
    private Building building;

    public Apartment(String name, float rentalFee, Building building) {
        if (building == null) {
            throw new RuntimeException("Invalid Building!");
        }
        this.name = name;
        this.rentalFee = rentalFee;
        this.building = building;
    }

    public String getName() {
        return name;
    }

    public float getRentalFee() {
        return rentalFee;
    }

    public Date getRentDate() {
        return rentDate;
    }

    public Building getBuilding() {
        return building;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "name='" + name + '\'' +
                ", rentalFee=" + rentalFee +
                ", rentDate=" + rentDate +
                ", building=" + building +
                '}';
    }
}
