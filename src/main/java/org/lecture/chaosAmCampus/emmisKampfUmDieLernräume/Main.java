package org.lecture.chaosAmCampus.emmisKampfUmDieLernräume;

public class Main {

    public static void main(String[] args) {

        int[] bookings = {
                204, 101, 204, 305, 101,
                204, 402, 305, 101, 204
        };

        RoomAnalytics analytics = new RoomAnalytics();

        System.out.println(
                analytics.countBookings(bookings, 204)
        ); // 4
        /*
        Buchungen: [204, 101, 204, 305, 101, 204, 305] --> Ergebnis: 204

        Bei Gleichstand: [305, 101, 305, 101] --> Ergebnis: 101
         */

        int[] bookings2 = {
                204, 101, 204, 305, 101,
                204, 402, 305
        };

        int[] bookings3 = {
                305, 101, 305, 101
        };
        System.out.println(
                analytics.findMostPopularRoom(bookings2)
        ); // 204
        System.out.println(
                analytics.findMostPopularRoom(bookings3)
        ); // 101


    }
}

class RoomAnalytics {
    public int countBookings(int[] bookings, int roomNumber) {
        int count = 0;
        for (int i = 0; i < bookings.length; i++) {
            if (bookings[i] == roomNumber) {
                count++;
            }
        }
        return count;
    }

    public int findMostPopularRoom(int[] bookings) {
        if (bookings == null || bookings.length == 0) {
            return -1;
        }
        int[] frequencies = new int[bookings.length];

        for (int i = 0; i < bookings.length; i++) {
            frequencies[i] = countBookings(bookings, bookings[i]);
        }
        int bestIndex = 0;

        for (int i = 1; i < bookings.length; i++) {
            if (frequencies[i] > frequencies[bestIndex] || (frequencies[i] == frequencies[bestIndex]
                    && bookings[i] < bookings[bestIndex])) {
                bestIndex = i;
            }
        }

        return bookings[bestIndex];
    }
}