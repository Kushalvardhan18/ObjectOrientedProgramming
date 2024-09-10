public class AbstractClass {
    public static void main(String[] args){
     Horse h = new Horse();
     h.eat();
     h.walk();
        System.out.println(h.color);

     Chicken c = new Chicken();
     c.eat();
     c.walk();

     Mustang myHorse = new Mustang();
     // NewAnimal ---> Horse ----> Mustang

    }
}

abstract class NewAnimal{
    String color;
    NewAnimal(){
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();  // Abstract methods does not have its implementation
}

class Horse extends NewAnimal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color="dark brown";
    }
    void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends NewAnimal{
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Constructor called");
    }
}