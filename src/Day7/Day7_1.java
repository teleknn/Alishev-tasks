package Day7;


public class Day7_1 {
    public static void main(String[] args) {

        Airplain air1 = new Airplain("Boing", 2010, 30, 40000);
        Airplain air2 = new Airplain("IL", 2010, 50, 40000);

        Airplain.compareAirplanes(air1, air2);
    }
}
