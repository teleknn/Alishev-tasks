package Enum;

public class Test {
    public static void main(String[] args) {
        Animal a1 = Animal.CAT;

        switch (a1) {
            case CAT:
                System.out.println("Its a CAT");
                break;
            case DOG:
                System.out.printf("Its a DOG");
                break;
        }
        Seasons season = Seasons.SUMMER;
        switch (season) {
            case SUMMER:
                System.out.println("Its warm outside");
                break;
            case WINTER:
                System.out.println("Its cold outside");
                break;
        }
        System.out.println(season instanceof Enum);
        System.out.println(season.getClass());
        System.out.println();

        System.out.println(a1);

        Seasons s1 = Seasons.WINTER;
        System.out.println(s1.getTemperatura());

        Seasons s2 = Seasons.AUTOM;
        System.out.println(s2.name());

        Animal c3 = Animal.CAT;
        System.out.println(c3.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Seasons w = Seasons.WINTER;
        System.out.println(w.ordinal());

    }
}
