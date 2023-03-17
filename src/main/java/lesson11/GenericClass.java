package lesson11;

public class GenericClass<T> {

    private T data; // data can take any type

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
