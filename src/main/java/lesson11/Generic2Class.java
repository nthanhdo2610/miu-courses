package lesson11;

public class Generic2Class <T,U>{
    private T i;
    private U j;

    public Generic2Class(T i, U j) {
        this.i = i;
        this.j = j;
    }

    public T getI() {
        return i;
    }

    public void setI(T i) {
        this.i = i;
    }

    public U getJ() {
        return j;
    }

    public void setJ(U j) {
        this.j = j;
    }
}
