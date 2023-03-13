package org.example.interface_dboth_interface;

public interface Intface2 {
    default void aMethod(int x) {
        System.out.println("Default in Intface2");
    }
}
