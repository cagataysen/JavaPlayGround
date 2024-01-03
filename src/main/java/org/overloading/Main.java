public class Main {

    public static void main(String[] args) {

        Dog doggy = new Dog();
        System.out.println(doggy.hareket());
        Snake snake = new Snake();
        System.out.println(snake.hareket());
    }


    //Overloading -- Aynı isim, farklı tur ve parametrede
    public static int toplama(int a, int b) {
        return a+b;
    }

    public static int toplama(int a, int b, int c) {
        return a+b+c;
    }

    public static int toplama(String x, int y) {
        return 0;
    }
}

//Overriding -- Aynı isimde ve turde, aynı sayidaki parametrede iki method, farkli ozellik
class Animal{
    public String hareket() {
        return "hareket ederim.";
    }
}

class Dog extends Animal{
    public String hareket() {
        return "kosarim.";
    }
}

class Snake extends Animal{

}

//Override Runtime da polymorphism sagliyor
//Overloading Compile time da, yani compile ederken java uyari verir hata varsa.
