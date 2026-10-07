package org.lecture.warmUp.emmiKommtAusDenFerienZurück;

public class Main {
    public static void main(String[] args) {
        // Dein Code hier
        //Task 1
        System.out.println(kannStarten(35)); //true
        //Task 2
        System.out.println(berechneCode(10)); //2 + 4 + 6 + 8 + 10 = 30
        //Task 3
        int[] ids1 = {4, 7, 2, 9, 3}; // --> 9
        int[] ids2 = {4, -7, 2, 9, 3}; //--> 9

        System.out.println(findeGroessteId(ids1));
        System.out.println(findeGroessteId(ids2));

        //Task 4
        int[] kristalle = {4, -2, 7, -5, 3, 8}; // 4 + 8 = 12
        System.out.println(berechneEnergie(kristalle));

        //Task 5
        int[] codes1 = {3, 8, -4, 12, 7}; // --> 12
        int[] codes2 = {1, 3, 5}; // --> -1
        int[] codes3 = {-2, -8, 7}; // --> -1
        int[] codes4 = {4, 18, 6, 10}; // --> 18
        System.out.println(findeRettungscode(codes1));
        System.out.println(findeRettungscode(codes2));
        System.out.println(findeRettungscode(codes3));
        System.out.println(findeRettungscode(codes4));
    }

    public static boolean kannStarten(int akku) {
        return akku >= 20;
    }

    public static int berechneCode(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int findeGroessteId(int[] ids) {
        int largestID = ids[0];
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] > largestID) {
                largestID = ids[i];
            }
        }
        return largestID;
    }

    public static int berechneEnergie(int[] kristalle) {
        int sum = 0;
        for (int i = 0; i < kristalle.length; i++) {
            if (kristalle[i] > 0 && kristalle[i] % 2 == 0) {
                sum += kristalle[i];
            }
        }
        return sum;
    }

    public static int findeRettungscode(int[] codes) {
        int largestCode = -1;

        for (int i = 0; i < codes.length; i++) {
            if (codes[i] > 0 && codes[i] % 2 == 0 && codes[i] > largestCode) {
                largestCode = codes[i];
            }
        }
        return largestCode;
    }


}
