package Day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayrs;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayrs < 6) {
            countPlayrs++;
        }
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina == 0) {
            countPlayrs--;
        }
    }

    public static void info() {
        if (countPlayrs < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayrs) + "свободных мест");
        } else {
            System.out.println("Мест в командах олльше нет");
        }
    }
}
