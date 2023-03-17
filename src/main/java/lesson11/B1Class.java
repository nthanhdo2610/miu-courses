package lesson11;

public class B1Class extends AClass{

    private Float j;

    public B1Class(Float i) {
        super(i);
    }

    public B1Class(Integer i, Float j) {
        super(i);
        this.j = j;
    }

    public Float getJ() {
        return j;
    }

    public void setJ(Float j) {
        this.j = j;
    }
}
