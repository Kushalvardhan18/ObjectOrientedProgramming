public class OOPS {

    public static void main(String[] args) {
        Pen p1 = new Pen();  // Constructor -- created a pen object
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color ="Yellow";
        System.out.println(p1.color);
    }
}

class Pen {
    // pro and func
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Studnt{
    String name;
    int age;
    float percentage;


    void calcPercentage (int phy,int chem,int math){
        percentage =(phy+chem+math)/3;
    }
}
