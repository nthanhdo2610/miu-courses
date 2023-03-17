package lesson11;

public class B2Class<T, U> extends AClass<T>{

    private U j;

    public B2Class(T i) {
        super(i);
    }

    public B2Class(T i, U j) {
        super(i);
        this.j = j;
    }

    public U getJ() {
        return j;
    }

    public void setJ(U j) {
        this.j = j;
    }
}
