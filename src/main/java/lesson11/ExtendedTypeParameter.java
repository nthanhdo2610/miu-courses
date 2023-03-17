package lesson11;

public class ExtendedTypeParameter <T>{
    private T t;

    public ExtendedTypeParameter(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static <U extends Number> void fun(U t){
        System.out.println(t.intValue());
    }
}
