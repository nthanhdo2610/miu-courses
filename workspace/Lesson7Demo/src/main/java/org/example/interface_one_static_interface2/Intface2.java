package org.example.interface_one_static_interface2;

public interface Intface2 {
    default void aMethod(int x) {
        System.out.println("default Intface2");
    }
}
