public class CopyConstructor {
    public static void main(String[] args){
        StudentNew s1 = new StudentNew();
        s1.name ="Kushal";
        s1.roll =25;
        s1.password ="abcd";
        s1.marks[0] =100;
        s1.marks[1] =90;
        s1.marks[2] =80;

        StudentNew s2 = new StudentNew(s1); // copy
        s2.password ="xyz";
        s1.marks[2] =100;
        for(int i =0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }}
    class StudentNew{
        String name;
        int roll;
        String password;
        int marks[];
        
        StudentNew() {
            marks = new int[3]; // Initialize the marks array
        }

        //Shallow Copy Constructor
//        StudentNew(StudentNew s1){
//            marks= new int[3];
//            this.name= s1.name;
//            this.roll = s1.roll;
//            this.marks =s1.marks;
//        }

        // Deep Copy Contructor
        StudentNew (StudentNew s1){
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i =0;i<3;i++){
                this.marks[i] = s1.marks[i];
            }
        }

    }

