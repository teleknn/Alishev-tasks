package Day4;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day4_1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        int x = scaner.nextInt();
        int[] xa = new int[x];
        Random random = new Random();

        for (int i = 0; i < xa.length; i++) {
            xa[i] = random.nextInt(10);
        }
        System.out.println("Введено число " + x);

        System.out.println(Arrays.toString(xa));

        System.out.println("Информация о массиве:");
        System.out.println("Длинна массива: " + x);

        int c = 0;
        int v = 0;
        int b = 0;
        int m = 0;
        int n = 0;
        for (int i = 0; i < xa.length; i++) {
            if (xa[i] > 8) {
                c++;
            }
            if (xa[i] == 1) {
                v++;
            }
            if ((xa[i] % 2) ==0){
               b++;
            }
            m = m + xa[i];

            if ((xa[i] % 2) !=0){
                n++;
            }

        }
            System.out.println("Количество чисел больше 8: " + c);
            System.out.println("Количество чисел равных 1: " + v);
        System.out.println("Количество четных чисел: " + b);
        System.out.println("Количество НЕчетных чисел: " + n);
        System.out.println("Сумма всех элементов массива: " + m);



    }
}