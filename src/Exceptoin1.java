import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptoin1 {
    public static void main(String[] args) {

       File file = new File("test");
        try {
            Scanner scanner = new Scanner(file);//Это исключение выкинет ОШИБКУ throws FileNotFoundException
            System.out.println("Внутри блоки try если нет ошики");
        } catch (FileNotFoundException e) {       //Лучше использовать try /catch
            System.out.println("Файл не найден");
        }
        System.out.println("После блока try catch все продолжает работать");

        // Можно обрабатыать ошики из метода


        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методи main");
        }

    }

        public static void readFile() throws FileNotFoundException {
            File file2 = new File("test4");
            Scanner scanner2 = new Scanner(file2);
        }


    }

