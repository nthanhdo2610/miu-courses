package lesson12.multithreading;

public class Main {

    public static void main(String[] args) {
//        System.out.println("main thread");
//        Thread main = Thread.currentThread();
//        System.out.println(main.getPriority());
//        main.setPriority(6);
//        System.out.println(main.getPriority());
//        System.out.println(main.getName());
//        main.setName("Main Thread");
//        System.out.println(main.getName());
//        System.out.println("=========");
//        System.out.println(main);

        // create the first thread
        MyThread t1 = new MyThread(); // the new thread was born
        // change thr born state to Ready to Run
        t1.start();
        MyThread t2 = new MyThread();
        t2.start();

    }
}
