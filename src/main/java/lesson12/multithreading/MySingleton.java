package lesson12.multithreading;

public class MySingleton {
    private static MySingleton instance = null;
    private static int counter;

    private MySingleton() {
        counter++;
    }

    public synchronized static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton(); // counter increments
        }
        return instance;
    }

    public static int getCounter() {
        return counter;
    }
}
