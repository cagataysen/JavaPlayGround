package org.multithreading;

public class MyRunnableThread implements Runnable{
    @Override
    public void run(){
        System.out.println("This is Runnable run method");
    }
}

class RunnableTest{
    public static void main(String[] args){

        //Runnable --> Job   and    Thread --> Worker.        We need worker for the job.
        MyRunnableThread myRunnable = new MyRunnableThread();
        Thread t = new Thread(myRunnable);
        t.start();

    }

}
