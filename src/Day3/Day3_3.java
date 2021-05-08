package Day3;

import java.util.Scanner;

public class Day3_3 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            double a = scaner.nextDouble();
            double b = scaner.nextDouble();
            if (b==0) {
                System.out.println("Деление на 0");
                continue;
            }
                double c = a / b;
                System.out.println(c);




        }
    }
}
