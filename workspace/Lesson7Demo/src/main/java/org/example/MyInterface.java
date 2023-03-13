package org.example;

public interface MyInterface {
    void print();
    static String getMyName() {
        return "Name";
    }
    default String getMyDefaultData() {
        return "default";
    }
}
