package lesson3.labs.prob3;

public class House extends Property {

    private double lotSize;

    public House(Address address, double lotSize) {
        super(address);
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return 0.1 * lotSize;
    }

    public double getLotSize() {
        return lotSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "lotSize=" + lotSize +
                ", " + super.toString() +
                '}';
    }
}
