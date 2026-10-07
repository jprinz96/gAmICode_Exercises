package org.lecture.challenge.emmisDatenleck;

public class Main {
    static void main() {
        int[] zugriffe = {4, 7, 7, 7, 2, 2, 9};

        System.out.println(Datenleck.laengsteZugriffsserie(zugriffe));

        int[] zugriffe2 = {5, 5, 5, 5, 2, 3};// -> 4
        int[] zugriffe3 = {1, 2, 3, 4}; // -> 1
        int[] zugriffe4 = {8}; // -> 1
        int[] zugriffe5 = {};  // -> 0

        System.out.println(Datenleck.laengsteZugriffsserie(zugriffe2));
        System.out.println(Datenleck.laengsteZugriffsserie(zugriffe3));
        System.out.println(Datenleck.laengsteZugriffsserie(zugriffe4));
        System.out.println(Datenleck.laengsteZugriffsserie(zugriffe5));
    }
}

class Datenleck {
    public static int laengsteZugriffsserie(int[] zugriffe) {
        if (zugriffe == null || zugriffe.length == 0) {
            return 0;
        }
        int counter = 1;
        int highest = 1;
        for (int i = 0; i < zugriffe.length - 1; i++) {
            if (zugriffe[i + 1] == zugriffe[i]) {
                counter++;
            }
            if (counter > highest) {
                highest = counter;
            }
            if (zugriffe[i + 1] != zugriffe[i]) {
                counter = 1;

            }
        }
        return highest;

    }
}

