public class Constructor {
    public static void main (String[] args){
        // Special method which is invoked automatically at the time of object creation.
       /*
       -Constructor have the same name as class or structure.
       -Constructors don't have a return type.(Not Even Void)
       -Constructor are only called once,at object creation.
       -Memory allocation happens when constructor is called.
       */
        Students s1 = new Students("Kushal");
        System.out.println(s1.name);
    }
}
class Students{
    String name;
    int roll;
    Students(String name){
        this.name = name;
    }
}
