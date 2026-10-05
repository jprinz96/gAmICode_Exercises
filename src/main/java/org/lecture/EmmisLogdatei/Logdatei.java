package org.lecture.EmmisLogdatei;

import java.util.HashMap;
import java.util.Map;

/**
 * Emmi analysiert die Logdatein des gAmIcode-Labors.
 * Die Fehlercodes sind in einem Array gespeichert.
 * <p>
 * Finde den am häufigste vorkommenden Fehlercode.
 * Kommen mehrere Fehlercodes gleich häufig vor, gib den kleineren Fehlercode zurück.
 * <p>
 * Beispiele:
 * {4, 2, 7, 4, 3, 2, 4, 7, 4} -> 4
 * {5, 2, 5, 2, 9} -> 2
 * {-3, -3, 2, 2, 7} -> -3
 */
public class Logdatei {
    public static int haufigsteFehler(int[] fehlercodes) {
        if (fehlercodes == null || fehlercodes.length == 0) {
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();

        for (int key : fehlercodes) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int mostCommonMistake = 0;
        int record = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int fehlercode = entry.getKey();
            int haufigkeit = entry.getValue();

            if (haufigkeit > record || haufigkeit == record && fehlercode < mostCommonMistake) {
                record = haufigkeit;
                mostCommonMistake = fehlercode;
            }

        }


        return mostCommonMistake;
    }
}
