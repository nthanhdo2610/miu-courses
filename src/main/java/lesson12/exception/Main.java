package lesson12.exception;

public class Main {

    public static void main(String[] args){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.getProperty("user.dir"));
    }
}
