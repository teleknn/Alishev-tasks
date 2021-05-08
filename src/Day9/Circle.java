package Day9;

public class Circle extends Figure {
    private double rad = 0;

    public Circle(double rad, String color) {
        super(color);
        this.rad = rad;

    }


    @Override
    public double area() {
        return Math.PI * (rad * rad);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * rad;
    }
}

