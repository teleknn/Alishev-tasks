package Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {

        File file = new File("botinki.csv");
        File fileOut = new File("result.txt");



        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(fileOut);

            while (scanner.hasNextLine()) {
               String [] line = scanner.nextLine().split(";");
                if (Integer.parseInt(line[2]) == 0) {
                    pw.println(line[0] + ", " + line[1] + ", " + line[2]);
                }

            }
            pw.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("файл не найден");
        }



    }
}
