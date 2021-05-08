import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions3 {
    public static void main(String[] args) {
        // Checked Exceptions провернный или проверяемый исключения которые появляються во время компеляции
        // Unchecked Exceptions - возникают во время выплнения программ ОШИБКА!

        //ЧАСТО ВСТРЕЧАЕМЫЕ второй тип
        //1
        // int a= 1/0; // второй тип выскачет тогда когда запустим
       //2
        //2 String name = null;
       // name.length();
//3
        //int[] arr = new int[2];
        //System.out.println(arr[2]);

        File file = new File("test34");
        try {
            Scanner sc = new Scanner(file); //Checked Exceptions
        } catch (FileNotFoundException e) {
            System.out.println("Erorr");
        }





    }
}
