package AbstractClass;

public class Main {
    public static void main(String[] args) {

        //Display for Rectangle
        Rectangle rectangle = new Rectangle(9, 17);
        System.out.println("Perimeter Of Rectangle is: " + rectangle.Perimeter());
        System.out.println("Area Of Rectangle is: " + rectangle.Area());

        //Display for Circle
        Circle circle = new Circle(7);
        System.out.println("Perimeter Of Circle is: " + circle.Perimeter());
        System.out.println("Area Of Circle: " + circle.Area());

    }
}
