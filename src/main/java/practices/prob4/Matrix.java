package practices.prob4;

import java.lang.reflect.Array;

public class Matrix <T>{

    private T [][] values;
    private int cols;
    private int rows;

    // 4.	Solve the given problem using generics.
    public Matrix(int cols, int rows, T t) {
        this.cols = cols;
        this.rows = rows;
        this.values = (T[][]) Array.newInstance(t.getClass(), rows, cols);
        this.values = (T[][]) new Object[rows][cols];
    }

    public T[][] getValues() {
        return values;
    }

    public void setValues(T[][] values) {
        this.values = values;
    }
}