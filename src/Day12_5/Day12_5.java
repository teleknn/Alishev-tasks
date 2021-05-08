package Day12_5;

import javax.script.AbstractScriptEngine;
import java.util.ArrayList;
import java.util.List;

public class Day12_5 {
    public static void main(String[] args) {

        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Test50", 50));
        members1.add(new MusicArtist("Test35", 35));
        members1.add(new MusicArtist("Test15", 15));
        members1.add(new MusicArtist("Test65", 65));
        members1.add(new MusicArtist("Test23", 23));
        members1.add(new MusicArtist("Test80", 80));

        MusicBand band1 = new MusicBand("Fossss", 1965, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Aura50", 50));
        members2.add(new MusicArtist("Aura35", 35));
        members2.add(new MusicArtist("Aura15", 15));


        MusicBand band2 = new MusicBand("Auritti", 1980, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMemders(band1, band2);

        band1.printMembers();
        band2.printMembers();


    }
}
