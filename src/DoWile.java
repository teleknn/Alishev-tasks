import java.util.Scanner;

public class DoWile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volue;
        do {
            System.out.println("Enter 5 ");
            volue = scanner.nextInt();
        }
        while (volue != 5);

        System.out.println("You Enter 5");


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 "); // Эта и ниже строчка дублируеться
        int volue = scanner.nextInt();
        while (volue!=5) {
            System.out.println("Enter 5 "); // Вот этот дубль!
            volue = scanner.nextInt();
        }
        System.out.println("You Enter 5");*/
    }
}
