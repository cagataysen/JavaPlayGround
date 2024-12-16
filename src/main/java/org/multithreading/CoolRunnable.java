package org.multithreading;

public class CoolRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("The job is starting");
    }

    public static void main(String[] args){
        CoolRunnable coolRunnable = new CoolRunnable();
        Thread t = new Thread(coolRunnable);
        Thread t2 = new Thread(coolRunnable);
        Thread t3 = new Thread(coolRunnable);

    }
}
