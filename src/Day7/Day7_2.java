package Day7;

public class Day7_2 {
    public static void main(String[] args) {

        Player p1 = new Player(90);
        Player p2 = new Player(95);
        Player p3 = new Player(91);
        Player.info();
        Player p4 = new Player(93);
        Player p5 = new Player(100);
        Player p6 = new Player(98);

        Player.info();

        Player p7 = new Player(100);

        Player.info();
        for (int i = 0; i < 99; i++) {
            p3.run();
        }
        Player.info();
    }
}
