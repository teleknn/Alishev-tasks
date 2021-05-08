public class Constracter {
    public static void main(String[] args) {
        StringsBilder.HumanNew h1 = new StringsBilder.HumanNew("Bob", 30);
        StringsBilder.HumanNew h2 = new StringsBilder.HumanNew("Tom", 60);
        h1.getAllFilde();
        h2.getAllFilde();
        StringsBilder.HumanNew h3 = new StringsBilder.HumanNew("Test", 100);


        StringsBilder.HumanNew.discription = "2334";
        h1.getAllFilde();
        h2.getAllFilde();

        h1.printNubberofpuple();
        h2.printNubberofpuple();
        h3.printNubberofpuple();

        StringsBilder.HumanNew.getDiscription();


        //StringsBilder.HumanNew.discription = "BED";
        //System.out.println(StringsBilder.HumanNew.discription);
    }

}

class HumanNew {

    private String name;
    private int age;
    public static String discription;

    private static int countpuple;

    public HumanNew(String name, int age) {
        System.out.println("Hi from therd constructer");
        this.name = name;
        this.age = age;
        countpuple++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDiscription() {
        System.out.println(discription);
    }

    public void getAllFilde() {
        System.out.println(name + " , " + age + " , " + discription);
    }

    public void printNubberofpuple() {
        System.out.println("Numer puple " + countpuple);
    }
}