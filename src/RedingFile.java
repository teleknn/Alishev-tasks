import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class RedingFile {
    public static void main(String[] args) throws FileNotFoundException {
       File file = new File("test");
       //Можно задать путь
        // String path = "/User/admin/Desctop/test";
        //File file = new File(path);
        Scanner scanner = new Scanner(file); //Добавить ИСКЛЮЧЕНИЕ throws FileNotFoundException
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();

        //Считывание и перевод в int

        File file2 = new File("test2");

        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine(); // считали строку
        String[] numbersString = line.split(" "); //Этот метод разделяет строку по " "
        int[] numbers = new int[3];
        int counter = 0;

        for (String number : numbersString ){
            numbers[counter++] = Integer.parseInt(number);
        }

        System.out.println(Arrays.toString(numbers));


        scanner2.close();





    }
}
