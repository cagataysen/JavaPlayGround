package org.CoreJavaPlayGround;

public class Animal {
    Integer weight = 20;
    Integer height = 10;

    public static void main(String[] args){
        Animal animal = new Animal();
        System.out.println(animal);
    }
/* org.CoreJavaPlayGround.Animal@4dd8dc3
*
* Eğer toString override edilmezse output yukarıdaki gibi olacaktır çünkü Object.toString() methodunu incelediğimizde
*  return getClass().getName() + "@" + Integer.toHexString(hashCode());
*
*
* */
    @Override
    public String toString(){
        return "Animal [weight= " + weight + ", height= " + height + "]";
    }


}
