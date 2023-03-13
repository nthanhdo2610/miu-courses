package org.example.sub_interface1;

public interface Intface1 {
    default void aMethod(int x) {
        System.out.println("Default in Intface1");
    }
}
