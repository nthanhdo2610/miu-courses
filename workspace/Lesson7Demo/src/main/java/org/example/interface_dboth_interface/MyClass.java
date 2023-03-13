package org.example.interface_dboth_interface;

public class MyClass implements Intface1, Intface2 {

    public static void main(String[] args) {
        new MyClass().aMethod(10);
    }

    @Override
    public void aMethod(int x) {
        Intface1.super.aMethod(x);
        Intface2.super.aMethod(x);
    }
}
