
package AbstractClass;

public class Rectangle extends Shape {

    //Properties

    private double length;
    private double width;

    //Constructor

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //Getter and Setter Methods


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Override perimeter method
    @Override
    public double Perimeter() {
        return 2 * (length + width);
    }

    //Override Area method
    @Override
    public double Area() {
        return (length * width);
    }
}
