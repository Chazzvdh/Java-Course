package OOP2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        genreCreator technoCreator = new genreCreator("Juan Atkins", 1962);
        genreCreator hardstyleCreator = new genreCreator("DJ Zany", 1974);
        genreCreator kpopCreator = new genreCreator("Lee Soo-man", 1949);
        genreCreator techHouseCreator = new genreCreator("Larry Levan", 1954);

        Muziek m1 = new Muziek("Techno", 1980, 128, technoCreator);
        Muziek m2 = new Muziek("Hardstyle", 1980, 155, hardstyleCreator);
        Muziek m3 = new Muziek("K-Pop", 1950, 128, kpopCreator);
        Muziek m4 = new Muziek("Tech-House", 1960, 124, techHouseCreator);

        ArrayList<Muziek> muziek = new ArrayList<Muziek>();
        muziek.add(m1);
        muziek.add(m2);
        muziek.add(m3);
        muziek.add(m4);

        for (Muziek i : muziek) {
            System.out.println(i);
        }


    }
}
