package Udemy__MultiThreading_Concurrency_15;

import static Udemy__MultiThreading_Concurrency_15.ThreadColor.ANSI_RED;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from the Runnable class");
    }
}
