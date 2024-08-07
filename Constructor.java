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
        Students s2 = new Students();
        System.out.println(s1.name);
    }
}
class Students{
    String name;
    int roll;

    // Paramterized Constructor
    Students(String name){
        this.name = name;
    }

    // Non - Parameterized Constructor
    Students(){
        System.out.println("Constructor is called...");
    }
}
// Types of Constructor:
 /*     1. Non-parameterized
        2. Parameterized
        3. Copy Constructor
 */