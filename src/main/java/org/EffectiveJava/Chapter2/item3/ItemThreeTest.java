package org.EffectiveJava.Chapter2.item3;

public class ItemThreeTest {
    public static void main(String[] args) {


        new Thread(new Runnable() {

            @Override
            public void run() {

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {

                }

                System.out.println("HashCode of LazyCache: " + LazyCache.getInstance());
                System.out.println("HashCode of EagerCache: " + EagerCache.getInstance());
                System.out.println("HashCode of CacheSingleton: " + CacheSingleton.INSTANCE.hashCode());

            }
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {


                System.out.println("HashCode of LazyCache: " + LazyCache.getInstance());
                System.out.println("HashCode of EagerCache: " + EagerCache.getInstance());
                System.out.println("HashCode of CacheSingleton: " + CacheSingleton.INSTANCE.hashCode());

            }
        }).start();
    }
}
