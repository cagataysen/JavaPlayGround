package org.multithreading;

public class ThreadSleepTest implements Runnable{
    public static void main(String[] args){

        ThreadSleepTest sleepTest = new ThreadSleepTest();
        Thread t1 = new Thread(sleepTest);
        Thread t2 = new Thread(sleepTest);
        Thread t3 = new Thread(sleepTest);

        t1.setName("First");
        t2.setName("Second");
        t3.setName("Third");

        t1.start();
        t2.start();
        t3.start();

    }

    @Override
    public void run(){
        for(int i = 0; i < 10; i++) {
            System.out.println("Thread name:" + Thread.currentThread().getName() + " index:" + i);
            try {
                //1000 millisecond is 1 second.
                //1 millisecond is 10^6 nanosecond.
                Thread.sleep(500);
                //sleep() method will be making the state of the running thread = TIMED_WAITING for 0.5 seconds.
                //check Thread -> enum State class in it for status of the thread.
            }
            catch (InterruptedException e){
                System.out.println("exception handled");
            }
        }
    }
}
