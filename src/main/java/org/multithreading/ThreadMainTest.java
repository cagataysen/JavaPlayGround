package org.multithreading;

public class ThreadMainTest {
    public static void main(String[] args){
        System.out.println("Before calling sleep");

        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("After calling sleep");

    }
}
