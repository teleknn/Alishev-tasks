package Day5;

public class Day5_1 {
    public static void main(String[] args) {
    Car car1Model= new Car();
    car1Model.setModel("Giguli");
    car1Model.setColor("White");
    car1Model.setYearsMade(1980);

        System.out.println(car1Model.getColor());
        System.out.println(car1Model.getModel());
        System.out.println(car1Model.getYearsMade());

        Car1 car2 = new Car1();
        car2.setColor("Black");
        car2.setModel("Shkoda");
        car2.setYearsMade(1984);

        System.out.println(car2.getColor());
        System.out.println(car2.getModel());
        System.out.println(car2.getYearsMade());

    }
}
class Car {
    private int yearsMade;
    private String color;
    private String model;

    public void setYearsMade (int carYearsMade){
        yearsMade = carYearsMade;
    }
    public int getYearsMade(){
        return yearsMade;
    }

    public void setColor (String carColor){
        color = carColor;
    }
    public String getColor(){
        return color;
    }

    public void setModel (String carModel){
        model = carModel;
    }
    public String getModel(){
        return model;
    }


}

class Car1 {
    private int yearsMade;
    private String color;
    private String model;

    public void setYearsMade (int carYearsMade){
        yearsMade = carYearsMade;
    }
    public int getYearsMade(){
        return yearsMade;
    }

    public void setColor (String carColor){
        color = carColor;
    }
    public String getColor(){
        return color;
    }

    public void setModel (String carModel){
        model = carModel;
    }
    public String getModel(){
        return model;
    }


}