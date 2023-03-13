package org.example.interface_one_static_interface;

public class MyClass implements Intface1, Intface2 {
    @Override
    public void aMethod(int x) {
        System.out.println("override is must in MyClass");
    }
}
