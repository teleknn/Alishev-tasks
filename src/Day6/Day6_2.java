package Day6;

public class Day6_2 {
    public static void main(String[] args) {
    Airplain air1 = new Airplain("Boing", 2010, 30, 40000);
    air1.setYear(2011);
    air1.setLongg(120);

    air1.fullUp(1000);
    air1.fullUp(5000);

    air1.info();

    }
}
