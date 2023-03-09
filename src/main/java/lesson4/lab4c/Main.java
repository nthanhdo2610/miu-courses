package lesson4.lab4c;

public class Main {
    public static void main(String[] args) {
        Employee commissioned = new Commissioned("11110030", 0.20f, 12000.00);
        System.out.println(commissioned.print(1, 2023));
    }
}
