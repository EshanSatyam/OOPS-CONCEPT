package AbstractClass;

public class Circle extends Shape{

    //Properties
    private double radius;


    //Constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //Getter and Setter Method

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    //Override for Perimeter
    @Override
    public double Perimeter() {
        return (2 * Math.PI * radius);
    }

    //Override for Area
    @Override
    public double Area() {
        return (Math.PI * radius * radius);
    }
}
