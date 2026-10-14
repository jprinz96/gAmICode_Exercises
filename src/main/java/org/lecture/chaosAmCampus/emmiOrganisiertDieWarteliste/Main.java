package org.lecture.chaosAmCampus.emmiOrganisiertDieWarteliste;

public class Main {
    public static void main(String[] args) {

        WaitingList waitingList = new WaitingList();

        // Eine Studierenden-ID ist genau 10 Stellen lang.
        // Beispiele für gültige IDs:
        // 1234567890
        // 5839201746
        // 9999999999
        long[] ids ={1234, 5839201746L};

        System.out.println(waitingList.isValidWaitingList(ids));
    }
}

class WaitingList {
    public boolean isValidId(long id) {
        if ((id >= 1000000000L) && (id <= 9999999999L)) {
            return true;
        }
        return false;
    }

    public boolean isValidWaitingList(long[] ids) {
        if (ids == null) {
            return false;
        }
        for (int i = 0; i < ids.length; i++) {
            for (int j = i+1; j < ids.length; j++) {
                if (ids[i] == ids[j]){
                   return false;
                }
            }
        }
        for (long id: ids){
            if(!isValidId(id)){
                return false;
            }
        }

        return true;
    }
}