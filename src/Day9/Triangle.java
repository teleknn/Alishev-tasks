package Day9;

public class Triangle extends Figure {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;

    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    @Override
    public double perimeter() {
        return a + b + c;
    }


}
