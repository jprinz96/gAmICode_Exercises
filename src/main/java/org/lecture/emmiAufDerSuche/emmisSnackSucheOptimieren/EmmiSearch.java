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
        int i = 1;
        while (i < archive.size() && archive.get(i).id() < targetId) {
            i *= 2;
        }
        return efficientSearch(archive, targetId, i / 2, Math.min(i, archive.size() - 1));
    }

    public static int efficientSearch(EmmiSnackArchive archive, int targetId, int low, int high) {
        if (archive.size() == 0) {
            return -1;
        }
        int left = low;
        int right = high;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int middleId = archive.get(middle).id();

            if (targetId == middleId) {
                return middle;
            }
            if (targetId < middleId) {
                right = middle - 1;
            }
            if (targetId > middleId) {
                left = middle + 1;
            }
        }

        return -1;
    }

}






