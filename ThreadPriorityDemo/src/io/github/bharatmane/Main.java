package io.github.bharatmane;

public class Main {

    public static void main(String[] args) {
	    Thread thread1 = new Thread(new SampleThread("Thread 1"));
        Thread thread2 = new Thread(new SampleThread("Thread 2"));
        Thread thread3 = new Thread(new SampleThread("Thread 3"));

        System.out.println("Thread1 Priority : " + thread1.getPriority());
        System.out.println("Thread2 Priority : " + thread2.getPriority());
        System.out.println("Thread3 Priority : " + thread3.getPriority());

        thread1.setPriority(9);
        thread2.setPriority(4);
        thread3.setPriority(9);

        System.out.println("New Thread1 Priority : " + thread1.getPriority());
        System.out.println("New Thread2 Priority : " + thread2.getPriority());
        System.out.println("New Thread3 Priority : " + thread3.getPriority());

        thread1.setDaemon(true);

        thread1.start();
        thread2.start();
        thread3.start();


        System.out.println("New Thread1 Priority : " + thread1.getPriority());

    }
}

