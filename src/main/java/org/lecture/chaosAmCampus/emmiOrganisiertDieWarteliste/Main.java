package org.lecture.chaosAmCampus.emmiOrganisiertDieWarteliste;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        WaitingList waitingList = new WaitingList();

        // Eine Studierenden-ID ist genau 10 Stellen lang.
        // Beispiele für gültige IDs:
        // 1234567890
        // 5839201746
        // 9999999999

        System.out.println(
                waitingList.isValidId(5839201746L)
        ); // false
        long[] ids ={1234567890L, 5839201746L, 9999999999L};

        System.out.println(waitingList.isValidWaitingList(ids));
    }
}
