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
            //System.out.println(" left: " + left + " | right: " + right + " |middle id: " + middle);

            if (snack.id() == targetId) {
                return middle;
            } else if (snack.id() > targetId) { //nach links
                right = middle - 1;
                //System.out.println("id > target: " + middle);
            } else {
                left = middle + 1; //5
                //System.out.println("id < target: " + middle);
            }
        }
        return -1;

    }

    //Task 3



}



