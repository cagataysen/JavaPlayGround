package org.multithreading;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("The job is starting");
    }

    public static void main(String[] args){
        MyThread thread = new MyThread();

        thread.start();

        thread.run();

        thread.run();

        // thread.start(); IllegalThreadStateException   We cant start the thread 2 times

    }
}
