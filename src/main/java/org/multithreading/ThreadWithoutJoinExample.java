package org.multithreading;

public class ThreadWithoutJoinExample implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " index:" + i);
        }
    }

    public static void main(String[] args){
        ThreadWithoutJoinExample runnable = new ThreadWithoutJoinExample();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.setName("myThread1");
        thread2.setName("myThread2");
        thread3.setName("myThread3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
