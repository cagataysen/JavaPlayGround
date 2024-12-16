package org.multithreading;

public class CoolThread extends Thread{

    @Override
    public void run(){
        System.out.println("The job is starting");
    }

    public static void main(String[] args){
        CoolThread t = new CoolThread();
        Thread t2 = new Thread(new CoolThread());
    }


}
