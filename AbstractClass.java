public class AbstractClass {
    public static void main(String[] args){
     Horse h = new Horse();
     h.eat();
     h.walk();

     Chicken c = new Chicken();
     c.eat();
     c.walk();
    }
}

abstract class NewAnimal{
    void eat(){
        System.out.println("Animal Eats");
    }
    abstract void walk();  // Abstract methods does not have its implementation
}

class Horse extends NewAnimal{
    void walk() {
        System.out.println("Walks on four legs");
    }
}

class Chicken extends NewAnimal{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}