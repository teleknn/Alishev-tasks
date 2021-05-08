package Day2;

import java.util.Scanner;

public class Day2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = a +1;
        while (t < b) {
            if (t % 5 == 0 && t % 10 != 0) {
                System.out.print(t + " ");
            }
            t++;
        }

                if (a >= b) {
        System.out.println("Ошика ввода");

    }



    }
}
