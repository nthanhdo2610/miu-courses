package practices.prob4;

public class Matrix <T>{

    private T [][] values;
    private int cols;
    private int rows;

    public Matrix(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.values = (T[][]) new Object[rows][cols];
    }

    public T[][] getValues() {
        return values;
    }

    public void setValues(T[][] values) {
        this.values = values;
    }
}