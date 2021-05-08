package Day12_4;

import java.util.ArrayList;
import java.util.List;

public class Day12_4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Test1");
        members1.add("Test2");
        members1.add("Test3");
        members1.add("Test4");
        members1.add("Test5");
        members1.add("Test6");

        MusicBand band1 = new MusicBand("Janifer", 1965, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Test111");
        members2.add("Test222");
        members2.add("Test333");
        members2.add("Test444");

        MusicBand band2 = new MusicBand("Upiter", 1980, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMemders(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}
