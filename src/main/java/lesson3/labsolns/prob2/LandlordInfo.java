package lesson3.labsolns.prob2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class LandlordInfo {

    private List<Building> buildings;

    LandlordInfo() {
        this.buildings = new ArrayList<>();
    }

    public static LandlordInfo rental(Map<String, Double> apts, String bldgName, float maintenanceCost) {
        Building building = new Building(bldgName, maintenanceCost, apts, new LandlordInfo());
        return building.getLandlord();
    }

    public void addBuilding(Building b) {
        this.buildings.add(b);

    }

    public double calcProfits() {
        double profits = 0;
        for (Building b : buildings) {
            profits = profits - b.getMaintenanceCost();
            for (Apartment a : b.getApartments()) {
                profits = profits + a.getRentalFee();
            }
        }
        return profits;
    }

    public double getMonthlyProfit(String bldgName, Date date) {
        for (Building b : this.getBuildings()) {
            if (b.getName().equals(bldgName)) {
                return b.getMonthlyProfit(date);
            }
        }
        return 0;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    @Override
    public String toString() {
        return "LandlordInfo{" +
                "buildings=" + buildings +
                '}';
    }
}
