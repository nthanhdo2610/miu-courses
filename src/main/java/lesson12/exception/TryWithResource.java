package lesson12.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class TryWithResource {

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("/Users/edgar.nguyen/Desktop/git-repo/mpp/src/main/java/lesson12/Calculator.java"));
                PrintWriter pw = new PrintWriter(new PrintWriter("/Users/edgar.nguyen/Desktop/git-repo/mpp/src/main/java/lesson12/Output.java"))

        ) {
            System.out.println("!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
