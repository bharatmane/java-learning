package io.github.bharatmane;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SampleThread(),"Thread 1");
        Thread thread2 = new Thread(new SampleThread(),"Thread 2");
        Thread thread3 = new Thread(new SampleThread(),"Thread 3");

        thread1.start();

        try{
            thread1.join();
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }

        thread2.start();

        try{
            thread2.join();
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }

        thread3.start();

        try{
            thread3.join();
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }

        System.out.println("All thread have completed their execution");
    }
}
