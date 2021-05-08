package Day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day14_1 {
    public static void main(String[] args) {


            File file = new File("test");

            try {
                Scanner scanner2 = new Scanner(file);
                String line = scanner2.nextLine();
                String[] numbers = line.split(" ");

                if (numbers.length != 10)
                    throw new IllegalAccessException();

                int sum = 0;
                for (String number : numbers)
                    sum += Integer.parseInt(number);

                System.out.println(sum);

            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден");
            } catch (IllegalAccessException e) {
                System.out.println("Некорректный входной файл");
            }


        }




}
