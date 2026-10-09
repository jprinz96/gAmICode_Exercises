package org.lecture.emmiAufDerSuche.emmisSnackSucheOptimieren;

public class EmmiSearch {
    //Task 1
    public static int sequentialSearch(EmmiSnackArchive archive, int targetId) {

        for (int i = 0; i < archive.size(); i++) {
            Snack snack = archive.get(i);

            if (snack.id() == targetId) {
                return i;
            }
        }
        return -1;
    }

    // Task 2
    public static int efficientSearch(EmmiSnackArchive archive, int targetId) {//10020
        int left = 0;
        int right = archive.size() - 1; //7

        Snack snack = archive.get(left);

        while (left <= right) {
            int middle = left + (right - left) / 2;

            snack = archive.get(middle);


            if (snack.id() == targetId) {
                return middle;
            } else if (snack.id() > targetId) { //nach links
                right = middle - 1;
            } else {
                left = middle + 1; //5

            }
        }
        return -1;

    }

    //Task 3
    public static int exponentialSearch(EmmiSnackArchive archive, int targetId) {
        if (archive.size() == 0) {
            return -1;
        }

        if (archive.get(0).id() == targetId) {
            return 0;
        }


        int suchIndex = 1;

        for (; suchIndex < archive.size()
                && archive.get(suchIndex).id() < targetId; suchIndex *= 2) {

        }

        int left = suchIndex / 2;
        int right = Math.min(suchIndex, archive.size() - 1);


        while (left <= right) {
            int mid = left + (right - left) / 2;
            int currentId = archive.get(mid).id();

            if (currentId == targetId) {
                return mid;
            } else if (currentId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }


}



