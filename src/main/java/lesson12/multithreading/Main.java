package lesson12.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {


    // use it for small task
    static ExecutorService executorService = Executors.newCachedThreadPool();

    //use it for heavy task
    static ExecutorService service = Executors.newFixedThreadPool(5);


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            createAndStartThreads();
//            System.out.println(MySingleton.getCounter());
        }
        service.shutdown();
    }
    private static void createAndStartThreads(){
        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(() -> MySingleton.getInstance());
//            thread.start();
            service.execute(()-> MySingleton.getInstance());

            System.out.println("Task# " + ((ThreadPoolExecutor)service).getTaskCount());
            System.out.println("Active# " + ((ThreadPoolExecutor)service).getActiveCount());
        }
    }
}
