package org.example.interface_d_interface;

public class MyClass implements Intface1, Intface2{
    @Override
    public void aMethod(int x) {
//        Intface1.super.aMethod(x);    //Default in Intface1
        System.out.println("implemented aMethod");
    }

    public static void main(String[] args) {
        new MyClass().aMethod(10);
    }
}
