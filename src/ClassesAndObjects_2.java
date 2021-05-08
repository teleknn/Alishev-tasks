public class ClassesAndObjects_2 {

    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.setName("");
        person1.setAge(-3);
        System.out.println("Out jhjhhj v main metod " + person1.getName());
        System.out.println("Out jhjhhj v main metod " + person1.getAge());
        Person2 person2 = new Person2();


        //System.out.println();
        //person1.canculateAge();
        //person2.canculateAge();
        //System.out.println();

        //int year1 = person1.culculateNewAge();
        //int year2 = person2.culculateNewAge();
        //System.out.println("For pensia 1 " +year1);
        //System.out.println("For pensia 2 " +year2);

        // person1.speak();


    }
}

class Person2 {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("You enter empty name!");
        } else {
            name = userName;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Age to be pluse!");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }


    void canculateAge() {
        int years = 65 - age;
        System.out.println("volume for age old " + years);
    }

    int culculateNewAge() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name " + name + ", " + "me " + age + " years.");
        }

    }

    void sayHello() {
        System.out.println("Hello");
    }

    void setNameandAge(String username, int userage) {
        name = username;
        age = userage;
    }
}

