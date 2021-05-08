package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day16_1 {
    public static void main(String[] args) {

        File file = new File("test");
        printResult(file);
    }


    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] person = new String[100];
            double summ = 0;
            double midl = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0) {
                    throw new IllegalArgumentException();
                }
            }
            for (int i = 0; i < person.length; i++) {
                summ = (Integer.parseInt(person[i])) + summ;

            }
            midl = summ / (person.length);

            System.out.println(Arrays.toString(person));
            scanner.close();

            System.out.printf(midl + "--> %.3f",midl);



        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Неккорректный входгой файл");
        }

    }
}
