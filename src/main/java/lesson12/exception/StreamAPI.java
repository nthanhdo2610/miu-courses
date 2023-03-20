package lesson12.exception;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class StreamAPI {

    public static void main(String[] args) {
        String [] dir = new String[]{
                System.getProperty("user.dir") + "/.." + "/.",
                System.getProperty("user.dir")
        };
        Arrays.stream(dir)
                .map(p-> getPath(p))
                .forEach(System.out::println);
    }
    static String getPath(String path) {
        try {
            return new File(path).getCanonicalPath();
        } catch (IOException e) {
            throw new RuntimeException();
//            throw e;
        }
    }
}
