package lesson11;

public class AClass <T>{
    private T i;

    public AClass(T i) {
        this.i = i;
    }

    public T getI() {
        return i;
    }

    public void setI(T i) {
        this.i = i;
    }
}
