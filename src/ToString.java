public class ToString {
    public static void main(String[] args) {

        HumanNew h1 = new HumanNew("Hello",40);
        System.out.println(h1); //Чтобы вывест надо переопредлить метод ToString строка 39

    }

    static class HumanNew {

        private String name;
        private int age;
        public static String discription;

        private static int countpuple;

        public HumanNew(String name, int age){
            this.name = name;
            this.age = age;
            countpuple++;
        }

        public void setName (String name) { this.name = name;}

        public void setAge (int age) {this.age = age;}

        public static void getDiscription (){
            System.out.println(discription);
        }

        public void getAllFilde(){
            System.out.println(name + " , " + age + " , " + discription);
        }

        public void printNubberofpuple(){
            System.out.println("Numer puple "+countpuple);
        }
        public String toString(){
            return name + " , "+age;
        }
    }
}


