package io.github.bharatmane;

public class SampleThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread running, name of the thread is: " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
        System.out.println("Thread ended, name of the thread is: " + Thread.currentThread().getName());
    }
}
