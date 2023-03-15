package lesson8.labs.prob1;

import java.util.function.Supplier;

public class Solution {

    public static void main(String[] args) {
        Supplier<Double> prob1B = Math::random;
        System.out.println(prob1B.get());

        MyClass myClass = new MyClass();
        System.out.println(myClass.get());
    }

    static class MyClass implements Supplier<Double>{
        @Override
        public Double get() {
            return Math.random();
        }
    }
}
