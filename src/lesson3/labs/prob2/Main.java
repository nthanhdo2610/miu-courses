package lesson3.labs.prob2;

import lesson3.labsolns.prob2.Building;
import lesson3.labsolns.prob2.LandlordInfo;

import java.util.Map;

/**
 * Main class is for testing your code; you can uncomment
 * the code here once you have implemented classes.
 * <p>
 * However, the way
 * data has been populated into the LandlordInfo and Building
 * objects violates the design indicated in the UML diagram for
 * this problem. Refactor the code in the main method so that
 * data is loaded in a correct manner; you can verify that you
 * have done this successfully by moving the Main class into a
 * different package.
 */
public class Main {

    public static void main(String[] args) {
        LandlordInfo landlord = LandlordInfo.rental(Map.of("apt01", 600.00, "apt02", 700.00), "bldg0", 400);
        landlord.addBuilding(new Building("bldg1", 900, Map.of("apt11", 500.00, "apt12", 450.00), landlord));
        landlord.addBuilding(new Building("bldg2", 300, Map.of("apt21", 1100.00, "apt22", 650.00), landlord));
        landlord.addBuilding(new Building("bldg3", 775, Map.of("apt31", 6750.00, "apt32", 945.00), landlord));
        System.out.println(landlord.calcProfits());
    }

}


