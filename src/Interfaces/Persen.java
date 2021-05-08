package Interfaces;

public class Persen implements Info{
    String name;

    public Persen(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    public void showInfo(){
        System.out.println("Is name "+ this.name);
    }
}
