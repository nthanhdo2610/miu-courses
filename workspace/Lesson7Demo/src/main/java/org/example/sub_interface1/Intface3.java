package org.example.sub_interface1;

public interface Intface3 extends Intface1, Intface2{
    //a
    @Override
    default void aMethod(int x) {
        System.out.println("Intface3 default");
    }
    //b
//    void aMethod(int x);
}
