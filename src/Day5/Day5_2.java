package Day5;

public class Day5_2 {
    public static void main(String[] args) {
        Motobike mot1 = new Motobike(130, "Whote", "IJHGF");
        System.out.println(mot1.getAge() + "\n" + mot1.getModel() + "\n" + mot1.getColor());


    }
}

class Motobike {
    private int age;
    private String model;
    private String color;

    public Motobike (int age, String color, String model){
        this.model = model;
        this.color = color;
        this.age = age;

    }
    public int getAge(){ return age; }
    public String getColor(){ return color; }
    public String getModel(){ return model; }



}