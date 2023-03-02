package lesson3.labs.prob3;

public class Property {

    private Address address;

    public Property(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    public double computeRent(){
        return 0;
    }

    @Override
    public String toString() {
        return "{" +
                "address=" + address +
                '}';
    }
}
