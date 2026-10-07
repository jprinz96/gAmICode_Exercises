package org.lecture.challenge.emmisLogdatei;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] fehlercodes = {4, 2, 7, 4, 3, 2, 4, 7, 4}; // -> 4
        int[] fehlercodes1 = {5, 2, 5, 2, 9}; // -> 2
        int[] fehlercodes2 =  {-3, -3, 2, 2, 7}; // -> -3


        System.out.println(Logdatei.haeufigsterFehler(fehlercodes));
        System.out.println(Logdatei.haeufigsterFehler(fehlercodes1));
        System.out.println(Logdatei.haeufigsterFehler(fehlercodes2));
    }
}

class Logdatei {
    public static int haeufigsterFehler(int[] fehlercodes) {
        if (fehlercodes == null || fehlercodes.length == 0) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int fehlercode : fehlercodes){
            map.put(fehlercode, map.getOrDefault(fehlercode, 0) + 1);
        }

        int rekordCode = 0;
        int rekord = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > rekord){
                rekordCode = key;
                rekord = value;
            }
            if (value == map.get(rekordCode)){
                if( key < rekordCode){
                    rekordCode = key;
                    rekord = value;
                }
            }

        }
        return rekordCode;
    }
}