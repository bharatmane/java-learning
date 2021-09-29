package io.github.bharatmane;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SampleThread(),"Thread 1");
        Thread thread2 = new Thread(new SampleThread(),"Thread 2");
        Thread thread3 = new Thread(new SampleThread(),"Thread 3");

        thread1.start();

        thread2.start();

        thread3.start();
        System.out.println("All thread have completed their execution");
    }
}
