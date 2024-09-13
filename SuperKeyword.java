public class SuperKeyword {
    public static void main(String[] args){
        Horse_X h = new Horse_X();
        System.out.println(h.color);

    }
}

class Animal_X{
    String color;
    Animal_X(){
        System.out.println("Animal constructor is called");
    }
}

class Horse_X extends Animal_X{
    Horse_X(){
        super.color ="brown";  // refer immediate parent class
        System.out.println("horse constructor is called");
    }
}