public class MethodOverRiding {
    public static void main(String[] args){
Deer d = new Deer();
d.eat();
    }
}
class Animals{
    void eat(){
        System.out.println("Eats anything");
    }
}
class Deer extends Animals{
    void eat(){
        System.out.println("Eat grass");
    }
}