public class StringsBilder {
    public static void main(String[] args) {
        String x = "hello";
        String x2 = " my";
        String x3 = " frend";
        String xAll = x + x2 + x3;
        System.out.println(xAll);
        //Так создаеться НОВАЯ строка и остаться старая! Это не выгодно сточки зрения памяти

        //Надо использовать StringBulder!
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        sb.append(" my").append(" frend2");
        System.out.println(sb);
        System.out.println();

        //Форматирование строк System.out.printf;
        System.out.printf("Hello, %s", "Supper \n"); // %s добавляет строку
        System.out.printf("Hello, %d \n", 100); //%d добавляет цифру
        System.out.printf("Hello, %f \n", 10.56); //%f дробное число
        System.out.printf("Hello, %.4f \n", 10.5653365); //%f дробное число, .4 символов после запятой
        System.out.printf("Hello, %10d \n", 10000); //%10d добавляет пробелы причем
        System.out.printf("Hello, %-10d \n", 10000); //-10 форматирование по другой стороне
        System.out.printf("Hello, %10d \n", 10000);


    }

    static class HumanNew {

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
}
