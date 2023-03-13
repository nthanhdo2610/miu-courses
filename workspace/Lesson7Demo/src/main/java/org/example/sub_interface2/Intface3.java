package org.example.sub_interface2;

public interface Intface3 extends Intface1, Intface2 {
    //a
    @Override
    default void aMethod(int x) {
        System.out.println("default in Intface3");
    }
    //b
//    void aMethod(int a);
    //or

}
