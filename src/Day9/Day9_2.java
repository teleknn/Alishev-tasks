package Day9;

public class Day9_2 {
    public static void main(String[] args) {
        /*Circle c1 = new Circle(30, "Red");
        Rectangle r1 = new Rectangle(10, 20, "Blue");
        Triangle t1 = new Triangle(4, 10, 12, "Orange");

        System.out.println(t1.color);
        System.out.println(t1.a + " " + t1.b + " " + t1.c);
        System.out.println(t1.area());
        System.out.println(t1.perimeter()); */

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));


    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double allp = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor() == "Red") {
                allp = figures[i].perimeter() + allp;
            }
        }
        return allp;
    }
    public static double calculateRedArea(Figure[] figures) {
        double alla = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor() == "Red") {
                alla = figures[i].area() + alla;
            }
        }
        return alla;
    }

}
