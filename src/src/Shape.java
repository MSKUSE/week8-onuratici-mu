

public class Shape {
    private String color = "white";

    public Shape(){

    }
    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*public void describe(int sideA, int sideB){
        System.out.println("Side A is " + sideA
        + " Side B is "+ sideB);
    }

    public void describe(int sideA){
        System.out.println("Side A is " + sideA);
    }

    public void describe(double radius){
        System.out.println("Radius is " + radius + "\nArea is "+ radius*radius*Math.PI);

    }*/

    public void describe(){
        System.out.println("This is a shape and its color is "+this.color);
    }
}
