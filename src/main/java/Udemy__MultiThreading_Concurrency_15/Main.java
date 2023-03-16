package Udemy__MultiThreading_Concurrency_15;

import static Udemy__MultiThreading_Concurrency_15.ThreadColor.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(ANSI_PURPLE + "Hello from the main thread");


        Thread anotherThread = new AnotherThread();
        anotherThread.setName("====Another Thread====");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_CYAN + "Hello from the anonymous class");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println("Another thread terminated, so am running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all, i was interrupted");
                }
            }
        });

        myRunnableThread.start();
        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE +  "Hello again from the main Thread");
    }
}
