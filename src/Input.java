import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter somthing ");
        String string = s.nextLine();
        System.out.println("You enter 1234" + string);

        System.out.println("Enter number ");
        int x = s.nextInt();
        System.out.println("You enter number " + x);

    }
}
