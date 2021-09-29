package io.github.bharatmane;

public class SampleThread implements Runnable{

    String name;

    public SampleThread(String name)
    {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Inside run method Thread Name: " + name);
    }
}
