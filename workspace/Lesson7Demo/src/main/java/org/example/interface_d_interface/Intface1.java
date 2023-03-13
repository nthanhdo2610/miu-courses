package org.example.interface_d_interface;

public interface Intface1 {
    default void aMethod(int x) {
        System.out.println("Default in Intface1");
    }
}
