package org.lecture.challenge.emmisDefekterTemperatursensor;

import java.util.Arrays;

public class Main {
    public static int findeFehler(int[] messwerte) {

        int[] messwerteSortiert = Arrays.stream(messwerte)
                .sorted()
                .toArray();

        int gapStart = messwerteSortiert[1] - messwerteSortiert[0];
        int gapEnd = messwerteSortiert[messwerteSortiert.length - 1] - messwerteSortiert[messwerteSortiert.length - 2];

        if (gapStart > gapEnd) {
            return messwerteSortiert[0];
        } else return messwerteSortiert[messwerteSortiert.length - 1];
    }

    public static void main(String[] args) {

        int[] messwerte1 = {21, 22, 20, 21, 23, 22, 21, 20, 22, 57, 21, 23, 20, 22, 21, 21, 22, 20, 23, 21}; // --> 57
        int[] messwerte2 = {36, 35, 37, 36, 34, 35, 36, 37, 35, 36, 34, 35, -12, 36, 37, 35, 34, 36, 35, 37}; // --> -12
        int[] messwerte3 = {71, 72, 70, 71, 73, 72, 71, 70, 72, 71, 73, 70, 71, 72, 73, 71, 70, 72, 71, 78, 72, 70, 73, 71, 72, 70, 71, 73, 72, 71}; // --> 78

        System.out.println(findeFehler(messwerte1));
        System.out.println(findeFehler(messwerte2));
        System.out.println(findeFehler(messwerte3));
    }
}
