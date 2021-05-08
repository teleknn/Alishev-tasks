package Day4;

import java.util.Random;

public class Day4_2 {
    public static void main(String[] args) {
        int[] xa = new int[100];
        Random random = new Random();

        for (int i = 0; i < xa.length; i++) {
            xa[i] = random.nextInt(10000);
            System.out.print(xa[i] + ", ");
        }
        System.out.println();

        int max = 0;
        for (int x : xa) {
            if (x > max)
                max = x;
            // System.out.print(x + ", ");

        }
        System.out.println(max);
        int min = 10000;
        for (int x : xa) {
            if (x < min)
                min = x;
        }
        System.out.println(min);

        int con = 0;
        for (int x : xa) {
            if (x % 10 == 0)
                con++;
        }
        System.out.println(con);
        int summ = 0;
        for (int x : xa) {
            if (x % 10 == 0)
                summ = summ+x;
        }
        System.out.println(summ);
    }
}
