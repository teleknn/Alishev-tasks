package Day2;

import java.util.Scanner;

public class Day2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Колличество этажей в здании ");
        int numberHous = scanner.nextInt();
        if (numberHous >= 1 && numberHous <= 4) {
            System.out.println("Малоэтажный дом");
        }
        else if (numberHous >= 5 && numberHous <= 8) {
            System.out.println("Среднеэтажный дом");
        }
        else if (numberHous >= 9) {
            System.out.println("Многоэтажный дом");
        }
        else {
            System.out.println("Ошибка ввода");
        }
    }
}
