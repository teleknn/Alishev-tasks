package Day9;

public class Rectangle extends Figure {
    private double a = 0;
    private double b = 0;

    public Rectangle(double a, double b, String color) {
        super(color);
        this.a = a;
        this.b = b;

    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a * 2) + (b * 2);
    }


}
