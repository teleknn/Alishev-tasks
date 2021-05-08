public class ClassecAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameandAge("Roma", 45);
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        person2.speak();
        System.out.println();
        person1.canculateAge();
        person2.canculateAge();
        System.out.println();

        int year1 = person1.culculateNewAge();
        int year2 = person2.culculateNewAge();
        System.out.println("For pensia 1 " + year1);
        System.out.println("For pensia 2 " + year2);

        person1.speak();


    }
}

class Person {
    String name;
    int age;

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
