package org.example.exercise7_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Constants.COMPANY.getCompanyName());
        System.out.println(Constants.SALESTARGET.getTarget());
        System.out.println(Arrays.toString(Constants.values()));
    }
}

class A {

    int i;
    public A(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public static void main(String[] args) {
        System.out.println(Fruit.Orange.getA().getI());
    }
}
enum Fruit {
    Mango(new A(10)), Orange(new A(5));
    A a;

    Fruit(A a) {
        this.a = a;
    }

    public A getA() {
        return a;
    }
}