package Day3;

import java.lang.invoke.SwitchPoint;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Day3_1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        while (true){
        System.out.println("Введите город ");
        String city = scaner.nextLine();
        if (city.equals("Stop"))
            break;

        switch (city) {
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Россия");
                break;

            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Италия");
                break;

            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Англия");
                break;

            case "Берлин":
            case "Мюнхен":
            case "Кёльн":
                System.out.println("Англия");
                break;
            default:
                System.out.println("Неизвестная страна");
        }

        }
    }
}
