package Day6;

class Car_1 {
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

    public void info(){
    System.out.println("This car");
}

    public int yearDif (int inputY){
        return Math.abs(inputY - yearsMade);
    }

}