public class StaticKeyword {
    public static void main(String[] args){
//        To make something(Properties,functions,blocks,Nested Classes) static for all the Objects
        Student_X s1 =new Student_X();
        s1.schoolName ="JMV";
        Student_X s2 = new Student_X();
        System.out.println(s2.schoolName);
    }
}

class Student_X{
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name = name;
    }String getName(){
        return this.name ;
    }
}