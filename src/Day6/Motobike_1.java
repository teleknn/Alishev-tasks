package Day6;

class Motobike_1 {
    private int age;
    private String model;
    private String color;

    public Motobike_1(int age, String color, String model){
        this.model = model;
        this.color = color;
        this.age = age;

    }
    public int getAge(){ return age; }
    public String getColor(){ return color; }
    public String getModel(){ return model; }

    public void info(){
        System.out.println("This Motobike"); }

    public int yearDif (int inputY){
        return Math.abs(inputY - age); }



}