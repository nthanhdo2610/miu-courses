package org.example.enumdemo;


public class Main {
    public static void main(String[] args) {
        Fruits fruits = Fruits.Apple;
        fruits.setQuantity(4);
        System.out.println(fruits.getQuantity());
        fruits = Fruits.Mango;
        System.out.println(fruits.getQuantity());

    }
}


enum Fruits {
   Apple(2), Mango(3),
   PineApple(4) {
       
   };
    private final int quantity;

    Fruits(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
//        this.quantity = quantity;
    }
}
