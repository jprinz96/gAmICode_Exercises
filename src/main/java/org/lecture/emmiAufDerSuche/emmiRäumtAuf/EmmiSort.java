package org.lecture.emmiAufDerSuche.emmiRäumtAuf;

import java.util.ArrayList;
import java.util.List;


public class EmmiSort {
    public static void bubbleSort(TrackedSnackList snacks) {
        int size = snacks.size();
        while (size > 1) {
            for (int i = 0; i < size - 1; i++) {
                if (snacks.get(i).priority() > snacks.get(i + 1).priority()) {
                    snacks.swap(i, i + 1);
                }
            }
            size -= 1;
        }

    }

    public static void mergeSort(TrackedSnackList snacks) {
        if (snacks.size() <= 1) {
            return;
        }
        int middle = snacks.size() / 2;
        List<SortSnack> snacksLeft = new ArrayList<>();
        List<SortSnack> snacksRight = new ArrayList<>();

        for (int i = 0; i < middle; i++) {
            snacksLeft.add(snacks.get(i));
        }
        for (int i = middle; i < snacks.size(); i++) {
            snacksRight.add(snacks.get(i));
        }
        TrackedSnackList left = new TrackedSnackList(snacksLeft);
        TrackedSnackList right = new TrackedSnackList(snacksRight);

        mergeSort(left);
        mergeSort(right);

        merge(snacks, left, right);
    }

    private static void merge(TrackedSnackList snacks, TrackedSnackList left, TrackedSnackList right) {
        int indexL = 0;
        int indexR = 0;
        int indexNew = 0;

        while (indexL < left.size() && indexR < right.size()) {
            if (snacks.compareValues(left.get(indexL), right.get(indexR)) <= 0) {
                snacks.set(indexNew, left.get(indexL));
                indexL++;
                indexNew++;

            } else {
                snacks.set(indexNew, right.get(indexR));
                indexR++;
                indexNew++;

            }
        }
        while (indexL < left.size()) {
            snacks.set(indexNew, left.get(indexL));
            indexL++;
            indexNew++;
        }
        while (indexR < right.size()) {
            snacks.set(indexNew, right.get(indexR));
            indexNew++;
            indexR++;
        }

    }

    public static void quickSort(TrackedSnackList snacks) {
        quickSort(snacks, 0, snacks.size() - 1);

    }

    private static void quickSort(TrackedSnackList snacks, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        SortSnack pivot = snacks.get(highIndex);
        int left = lowIndex;

        for (int i = lowIndex; i < highIndex; i++) {
            if (snacks.compareValues(snacks.get(i), pivot) <= 0) {
                snacks.swap(left, i);
                left++;
            }
        }

        // Pivot an seinen endgültigen Platz setzen
        snacks.swap(left, highIndex);

        // Die Bereiche links und rechts vom Pivot sortieren
        quickSort(snacks, lowIndex, left - 1);
        quickSort(snacks, left + 1, highIndex);
    }
}
