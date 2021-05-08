package Day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Day12_3 {
    public static void main(String[] args) {
        MusicBand mb1 = new MusicBand("Boniem", 1970);
        MusicBand mb2 = new MusicBand("Metalika", 1990);
        MusicBand mb3 = new MusicBand("Uragan", 1930);
        MusicBand mb4 = new MusicBand("Chig", 2000);
        MusicBand mb5 = new MusicBand("Zivert", 2004);
        MusicBand mb6 = new MusicBand("Rfrchay Rfchay", 2016);
        MusicBand mb7 = new MusicBand("Pink Floyd", 1971);
        MusicBand mb8 = new MusicBand("Ebnutie", 2021);
        MusicBand mb9 = new MusicBand("PPP", 1913);
        MusicBand mb10 = new MusicBand("TTT", 2001);

        List<MusicBand> musicBands= new ArrayList<>();
        musicBands.add(mb1);
        musicBands.add(mb2);
        musicBands.add(mb3);
        musicBands.add(mb4);
        musicBands.add(mb5);
        musicBands.add(mb6);
        musicBands.add(mb7);
        musicBands.add(mb8);
        musicBands.add(mb9);
        musicBands.add(mb10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);

        System.out.println(musicBands);

        List<MusicBand> after2000 = new ArrayList<>();

        for (MusicBand band : musicBands){
            if (band.getYear() > 2000) {
                after2000.add(band);
            }
        }
        System.out.println(after2000);


    }

}
