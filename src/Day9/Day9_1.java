package Day9;

public class Day9_1 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob");

        Student s1 = new Student("Vasiy", "Gegrafia");
        System.out.println(s1.getGrupeName());
        s1.printInfo();

        Teacher t1 = new Teacher("Roman Anreevach", "Math");
        System.out.println(t1.getSubjectName());
        t1.printInfo();

    }

}

class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Этот Человек с именем - " + name);

    }
}


class Student extends Human {
    private String grupeName;

    public Student(String name, String grupeName) {
        super(name);
        this.grupeName = grupeName;
    }

    public String getGrupeName() {
        return grupeName;
    }

    public void setGrupeName(String grupeName) {
        this.grupeName = grupeName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот Студент с именем - " + name);

    }

}

class Teacher extends Human {
    private String subjectName;

    public Teacher(String name) {
        super(name);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public void printInfo (){
        super.printInfo();
        System.out.println("Этот преподаватель с именем - " + name);

    }
}


