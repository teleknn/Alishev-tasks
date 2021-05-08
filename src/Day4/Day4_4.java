package Day4;

import java.util.Random;

public class Day4_4 {
    public static void main(String[] args) {
        int [] array = {1, 456, 1025, 65, 954, 2789, 4, 8742, 1040, 1};
        //int [] array = new int [100];

        Random random = new Random();
        //for (int i=0;i< array.length; i++){
          //  array[i]=random.nextInt(10000);


        //}
        int sumMax=0;
        int sumMaxInt = 0;
        for (int i=0;i< array.length - 2; i++){
            int sum = 0;
            for (int j=i; j < i+3; j++){
                sum = sum + array[j];
            }
            if (sum > sumMax) {
                sumMax = sum;
                sumMaxInt = i;
            }

            }
        System.out.println(sumMax);
        System.out.println(sumMaxInt);




    }
}
