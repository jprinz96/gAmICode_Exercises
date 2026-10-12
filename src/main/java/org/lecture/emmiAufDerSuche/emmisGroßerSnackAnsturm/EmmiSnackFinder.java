package org.lecture.emmiAufDerSuche.emmisGroßerSnackAnsturm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmmiSnackFinder {

    public static List<Snack> findSnacks(
            TrackedSnackList snacks, List<Integer> targetIds) {

        List<Snack> result = new ArrayList<>();

        if (targetIds.isEmpty()) {
            return result;
        }

        Snack[] helper = new Snack[snacks.size()];
        mergeSort(snacks, helper, 0, snacks.size() - 1);

        for (int id : targetIds) {
            result.add(binarySearch(snacks, id));
        }

        return result;
    }

    private static Snack binarySearch(
            TrackedSnackList snacks, int targetId) {

        int left = 0;
        int right = snacks.size() - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            Snack snack = snacks.get(middle);

            int comparison = snacks.compareValueToId(snack, targetId);

            if (comparison == 0) {
                return snack;
            } else if (comparison < 0) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return null;
    }

    private static void mergeSort(
            TrackedSnackList snacks, Snack[] helper,
            int left, int right) {

        if (left >= right) {
            return;
        }

        int middle = left + (right - left) / 2;

        mergeSort(snacks, helper, left, middle);
        mergeSort(snacks, helper, middle + 1, right);

        merge(snacks, helper, left, middle, right);
    }

    private static void merge(
            TrackedSnackList snacks, Snack[] helper,
            int left, int middle, int right) {

        // Aktuellen Bereich in das Hilfsarray kopieren.
        for (int i = left; i <= right; i++) {
            helper[i] = snacks.get(i);
        }

        int indexL = left;
        int indexR = middle + 1;
        int indexNew = left;

        // Jeweils den kleineren Snack zurückschreiben.
        while (indexL <= middle && indexR <= right) {
            if (snacks.compareValues(
                    helper[indexL], helper[indexR]) <= 0) {

                snacks.set(indexNew, helper[indexL]);
                indexL++;
            } else {
                snacks.set(indexNew, helper[indexR]);
                indexR++;
            }

            indexNew++;
        }

        // Übrige Snacks der linken Hälfte übernehmen.
        while (indexL <= middle) {
            snacks.set(indexNew, helper[indexL]);
            indexL++;
            indexNew++;
        }

        // Übrige Snacks der rechten Hälfte übernehmen.
        while (indexR <= right) {
            snacks.set(indexNew, helper[indexR]);
            indexR++;
            indexNew++;
        }
    }
}
