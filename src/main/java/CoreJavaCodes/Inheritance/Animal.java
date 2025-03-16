package CoreJavaCodes.Inheritance;

public class Animal {
    public void eat(){}
    public void sleep(){}
}
class Bird extends Animal{
    void fly(){}

}
class InMain
{
    public static void main(String[] args) {
        Animal a1=new Bird();
       // a1.fly();
/* Explanation :
    1. compilation error because the reference a1 is of type Animal,
    and fly() is a method specific to the Bird class.
    Although the object being referred to at runtime is a Bird,
    the compiler only knows that it's of type Animal.
    To fix, we need to cast a1 to Bird before calling fly().
    ((Bird) a1).fly(); */


       // Bird a2=new Animal();
       // a2.eat();
/* Explanation :
    Comilation error because you're trying
    to assign a superclass instance (Animal) to a subclass reference (Bird).
    This violates the "is-a" relationship. You can't treat an Animal as a Bird.*/

        Bird a3=(Bird)new Animal();
        a3.fly();
/*Explanation :
    This will compile but will throw a ClassCastException at runtime
    because you're trying to cast an Animal instance to a Bird,
    which is not possible.
    Even though the reference is of type Bird,
    the actual object being referred to (new Animal()) is not a Bird object. */
        Bird a4=new Bird();
        a4.eat();
/*Explanation :
    This will compile and run successfully.
    Since Bird extends Animal,
    it inherits the eat() method from the Animal class.
    So, a4.eat() will call the eat() method defined in the Animal class.




 */


    }
}
