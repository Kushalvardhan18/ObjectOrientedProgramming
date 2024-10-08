public class Inheritance {
    public static void main(String[] args){
        Fish shark = new Fish();
        shark.eat();

        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}

// Base Class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//Hybrid Inheritance
//Hierachical Inheritance
// Multi-Level Inheritance
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String bread;
}

// Derived class
// Single level Inheritance
 class Fish extends Animal{
    int fins ;
    void swim(){
        System.out.println("Swims in water");
    }
 }

