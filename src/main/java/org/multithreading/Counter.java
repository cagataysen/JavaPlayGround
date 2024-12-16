package org.multithreading;

//RACE CONDITION EXAMPLE
public class Counter implements Runnable{
    @Override
    public void run(){
        increment();
        decrement();
    }

    int c = 0;

    //public synchronized void increment()          if we use like this, no race condition
    public void increment(){
        c++;
    }
    //public synchronized void decrement()          if we use like this, no race condition
    public void decrement(){
        c--;
    }

    public int value(){
        return c;
    }

}


class CounterTest{
    public static void main(String[] args){
        Counter counter = new Counter();

        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);

        t1.start();
        t2.start();

        System.out.println(counter.c);

    }
}
