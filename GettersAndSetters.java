public class GettersAndSetters {
    public static void main(String[] args){
      
        Pen p1 = new Pen();  // Constructor -- created a pen object
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}
class Pen {
      // Get : to return the value.
        // Set : to return the value.
    // pro and func
    private String color;
    private int tip;
    String getColor (){
        
        return this.color;  // this keyword is used to refer to the current object.
    }
    int getTip (){
        return this.tip;  // this keyword is used to refer to the current object.
    }
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}
