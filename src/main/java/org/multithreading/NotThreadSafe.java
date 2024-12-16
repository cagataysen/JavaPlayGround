package org.multithreading;

public class NotThreadSafe{
    StringBuilder builder = new StringBuilder();

    public static void main(String[] args){
        NotThreadSafe sharedInstance = new NotThreadSafe();


        //More than 1 thread is calling the same object
        new Thread(new MyRunnable(sharedInstance)).start();
        new Thread(new MyRunnable(sharedInstance)).start();

        /*
        This part is thread safe version, because we are using different objects.
        *
        NotThreadSafe sharedInstance1 = new NotThreadSafe();
        NotThreadSafe sharedInstance2 = new NotThreadSafe();

        new Thread(new MyRunnable(sharedInstance1)).start();
        new Thread(new MyRunnable(sharedInstance2)).start();
        *
        * */

    }
    public void add(String text){
        this.builder.append(text);
    }


}



class MyRunnable implements Runnable{
    NotThreadSafe instance = null;

    public MyRunnable(NotThreadSafe instance){
        this.instance = instance;
    }

    public void run(){
        this.instance.add("some text");
    }
}
