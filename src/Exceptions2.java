import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws ScannerException {
        /*Scanner scanner = new Scanner(System.in);
        while (true) { //Бесконечный цикл
            int x = Integer.parseInt(scanner.nextLine()); // Считывание цифр через преобразование строки
            if(x !=0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.println("Введено все кроме 0");
                }
            }
        }
*/
        Scanner sc = new Scanner(System.in);
        while (true) { //Бесконечный цикл
            int y = Integer.parseInt(sc.nextLine());

            if (y != 0) {
                throw new ScannerException("Пользователь ввел что то кроме 0");
            }
        }


    }
}

class ScannerException extends Exception {
    public ScannerException(String description) {
        super(description);
    }

}
