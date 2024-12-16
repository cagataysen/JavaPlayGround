package org.multithreading;

public class RunnableMoreThread implements Runnable{
    @Override
    public void run(){
        System.out.println("run method()");
        for(int i = 0; i < 10; i++){
            String name = Thread.currentThread().getName();
            long id = Thread.currentThread().threadId();
            System.out.println("index:" + i + " " + name + " " + id);
        }
    }
}

class RunnableMoreThreadTest{
    public static void main(String[] args){

        //Runnable --> Job   and    Thread --> Worker.        We need worker for the job.
        RunnableMoreThread myRunnable = new RunnableMoreThread();
        Thread t1 = new Thread(myRunnable);
        Thread t2 = new Thread(myRunnable);
        Thread t3 = new Thread(myRunnable);
        t1.setName("First");
        t2.setName("Second");
        t3.setName("Third");

        /* if we use start(), there is no output order guarantee, we dont know how it will be executed, thread can start without waiting other thread to finish
        t1.start();
        t2.start();
        t3.start();
           if we use run(), we know in what order it will be executed, so every thread will be waiting to start for the previous thread to finish*/
        t1.run();
        t2.run();
        t3.run();
    }

}