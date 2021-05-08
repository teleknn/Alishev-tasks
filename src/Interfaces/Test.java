package Interfaces;

public class Test {
    public static void main(String[] args) {
        Info a1 = new Animal(1);
        Info p1 = new Persen("Bob");
        a1.showInfo();
        p1.showInfo();

        Animal a2 = new Animal(100);
        Persen p2 = new Persen("Roma");
        outputInfo(a2);
        outputInfo(p2);

    }
    public static void outputInfo (Info info){
        info.showInfo();
    }
}
