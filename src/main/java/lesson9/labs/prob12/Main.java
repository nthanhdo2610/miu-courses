package lesson9.labs.prob12;

public class Main {
    public static void main(String[] args) {
        MySingletonLazy mySingletonLazy = MySingletonLazy.getInstance();
        System.out.println(mySingletonLazy);
    }
}