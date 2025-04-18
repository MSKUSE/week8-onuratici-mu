public class TestShapes {
    public static void main(String[] args) {

        /*Shape rect1 = new Shape();
        rect1.describe(4,5);

        Shape circ1 = new Shape();
        circ1.describe(5.0);*/

        /*Shape shape = new Shape();
        shape.describe();*/

        Rectangle r = new Rectangle("white",3,4);
        Rectangle r2 = new Rectangle("blue",3,4);
        System.out.println(r.equals(r2));
    }
}