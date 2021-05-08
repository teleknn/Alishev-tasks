package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day16_2 {
    public static void main(String[] args) {

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        try {
            PrintWriter pw1 = new PrintWriter(file1);


            for (int i = 0; i < 1000; i++) {
                Random r = new Random();
                pw1.printf(r.nextInt(100) + 1 + " ");

            }

            pw1.close();


        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }

        try {
            Scanner scanner = new Scanner(file1);
            PrintWriter pw2 = new PrintWriter(file2);
            String line = scanner.nextLine();
            String[] arrays1 = line.split(" ");

            for (int i = 20; i < 1000; i = i + 20) {
                double sum = 0;
                double midl = 0;
                for (int j = i - 20; j < i; j++) {
                    sum = sum + Integer.parseInt(arrays1[j]);

                }
                midl = sum / 20;
                pw2.printf(midl + " ");
            }

            System.out.println();
            System.out.println(Arrays.toString(arrays1));

            scanner.close();
            pw2.close();

        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }

        printResult(file2);


    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String[] person = new String[1000];
            double summ = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                person = line.split(" ");

            }
            for (int i = 0; i < person.length; i++) {
                summ = (Double.parseDouble(person[i])) + summ;

            }

            scanner.close();

            System.out.printf("--> %.5f", summ);

        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }
    }

    }
