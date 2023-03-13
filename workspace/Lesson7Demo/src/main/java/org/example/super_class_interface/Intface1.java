package org.example.super_class_interface;

public interface Intface1 {
    default void aMethod(int x) {
        System.out.println("Intface default aMethod");
    }
}
