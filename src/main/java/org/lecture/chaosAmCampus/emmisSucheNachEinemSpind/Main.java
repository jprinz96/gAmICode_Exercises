package org.lecture.chaosAmCampus.emmisSucheNachEinemSpind;

public class Main {

    public static void main(String[] args) {

        // Auf dem Campus gibt es Spinde mit den Nummern 1 bis 1000.
        // Emmi möchte herausfinden, ob ein bestimmter Spind
        // bereits vergeben ist.

        LockerSearch lockerSearch = new LockerSearch();

        int[] occupiedLockers = {
                42, 17, 305, 91, 120, 8
        };

        int[] occupiedLockers2 = {8, 17, 42, 91, 120, 305};

        int[] occupiedLockers3 = {10, 11, 12, 13, 20};

        int[] occupiedLockers4 = {100, 101, 102};

        System.out.println(
                lockerSearch.findLocker(occupiedLockers, 305)
        ); // 2

        System.out.println(
                lockerSearch.findLocker(occupiedLockers, 50)
        ); // -1

        System.out.println(
                lockerSearch.findLockerFast(occupiedLockers2, 91)
        ); // 3

        System.out.println(
                lockerSearch.findLockerFast(occupiedLockers2, 3)
        ); // -1

        System.out.println(
                lockerSearch.findClosestFreeLocker(occupiedLockers3, 12)
        ); // 14
        System.out.println(
                lockerSearch.findClosestFreeLocker(occupiedLockers4, 101)
        ); // 99
    }
}

class LockerSearch {
    public int findLocker(int[] occupiedLockers, int wantedLocker) {
        if (occupiedLockers == null || occupiedLockers.length == 0) {
            return -1;
        }
        for (int i = 0; i < occupiedLockers.length; i++) {
            if (occupiedLockers[i] == wantedLocker) {
                return i;
            }
        }
        return -1;
    }

    public int findLockerFast(int[] occupiedLockers, int wantedLocker) {
        if (occupiedLockers == null) {
            return -1;
        }

        int left = 0;
        int right = occupiedLockers.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (occupiedLockers[middle] == wantedLocker) {
                return middle;
            }
            if (occupiedLockers[middle] < wantedLocker) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public int findClosestFreeLocker(int[] occupiedLockers, int wantedLocker){
        if (occupiedLockers == null || wantedLocker < 1 || wantedLocker > 1000){
            throw new IllegalArgumentException("Ungültige Eingabe");
        }
        if (findLockerFast(occupiedLockers, wantedLocker) == -1){
            return wantedLocker;
        }
        for (int distance = 1; distance < 1000; distance++){
            int smaller = wantedLocker - distance;
            int larger = wantedLocker + distance;
            if (findLockerFast(occupiedLockers, smaller) == -1){
                return smaller;
            }
            if (findLockerFast(occupiedLockers, larger) == -1){
                return larger;
            }
        }
        return -1;
    }

}