import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age ");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("You burn");
                break;
            case 7:
                System.out.println("You scool");
                break;
            case 18:
                System.out.println("You finish scool");
                break;
            default:
                System.out.println("Not not");
        }
    }
}
