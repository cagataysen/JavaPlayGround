package org.multithreading;

public class ThreadJoinExample implements Runnable{
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() + " index:" + i);
        }
    }


    //If you are using join(), you need to put method signature InterruptedException
    public static void main(String[] args) throws InterruptedException {
        ThreadJoinExample runnable = new ThreadJoinExample();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.setName("myThread1");
        thread2.setName("myThread2");
        thread3.setName("myThread3");

        //until thread1 will be over, there is NO other thread will start working
        thread1.start();
        thread1.join();

        //until thread2 will be over, there is NO other thread will start working
        thread2.start();
        thread2.join();

        //until thread3 will be over, there is NO other thread will start working
        thread3.start();
        thread3.join();

    }
}
