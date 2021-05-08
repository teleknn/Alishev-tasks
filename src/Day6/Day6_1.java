package Day6;

public class Day6_1 {
    public static void main(String[] args) {
    Car_1 car_1 = new Car_1();
    car_1.setYearsMade(1890);
        Motobike_1 mot1 = new Motobike_1(1300, "Whote", "IJHGF");

    car_1.info();
    mot1.info();

        System.out.println(car_1.yearDif(1000));
        System.out.println(mot1.yearDif(1000));






    }
}
