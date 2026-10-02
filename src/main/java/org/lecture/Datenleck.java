package org.lecture;

/**
 * Benutzer-ID Zugriffe sind der Reihe nach in einem Array gespeichert.
 * Ein Datenleck liegt vor, wenn dieselbe Benutzer-ID min. 3x direkt hintereinander vorkommt.
 *
 * Finde die längste Folge identischer IDs und gib deren länge zurück.
 * Ist das Array leer oder null, gib 0 zurück.
 *
 */
public class Datenleck {

    static void main() {
        int[] zugriffe1 = {4, 7, 7, 7, 5, 9, 1};
        int[] zugriffe2 = {5, 5, 5, 5, 2, 3};
        int[] zugriffe3 = {1, 2, 3, 4};
        int[] zugriffe4 = {1, 2, 3, 3, 6};
        int[] zugriffe5 = {8};
        int[] zugriffe6 = {};

        System.out.println(validate(zugriffe1));
        System.out.println(validate(zugriffe2));
        System.out.println(validate(zugriffe3));
        System.out.println(validate(zugriffe4));
        System.out.println(validate(zugriffe5));
        System.out.println(validate(zugriffe6));
    }

    public static int validate(int[] zugriffe) {
        int rekord = 1;
        int count = 1;
        if (zugriffe == null || zugriffe.length == 0) {
            return 0;
        }
        if (zugriffe.length == 1) {
            return rekord;
        }
        for (int i = 0; i < zugriffe.length-1; i++) {
            if (zugriffe[i] == zugriffe[i + 1]) {
                count++;
            }
            if (zugriffe[i] != zugriffe[i + 1]) {
                count = 1;
            }
            if (count > rekord) {
                rekord = count;
            }
        }
        return rekord;
    }
}
