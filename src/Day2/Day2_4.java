package Day2;

import javax.swing.*;
import java.util.Scanner;

public class Day2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x");
        double x = scanner.nextDouble();
        double y;
        if (x >=5) {
            y = (Math.pow(x,2)-10)/(x+7);
        } else if (x > -3 && x < 5 ) {
            y = (x+3)*(Math.pow(x,2)-2);
        } else {
            y =420;
        }
        System.out.println(y);
    }
}
