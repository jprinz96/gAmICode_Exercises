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
        List<SortSnack> left = new ArrayList<>();
        List<SortSnack> right = new ArrayList<>();

        int middle = snacks.size() / 2;

        //linken werte speichern
        for (int i = 0; i < middle; i++) {
            left.add(snacks.get(i));
        }
        //rechte werte speichern
        for (int i = middle; i < snacks.size(); i++) {
            right.add(snacks.get(i));
        }
        TrackedSnackList leftSnacks = new TrackedSnackList(left);
        TrackedSnackList rightSnacks = new TrackedSnackList(right);

        mergeSort(leftSnacks);
        mergeSort(rightSnacks);
        merge(snacks, leftSnacks, rightSnacks);

    }

    private static void merge(TrackedSnackList snacks, TrackedSnackList left, TrackedSnackList right) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.size() && j < right.size()) {
            //snacks.compare(i, j);
            if (snacks.compareValues(left.get(i), right.get(j)) <= 0) {
                snacks.set(k, left.get(i));
                i++;
            } else {
                snacks.set(k, right.get(j));
                j++;
            }
            k++;
        }
        while (i < left.size()) {
            snacks.set(k, left.get(i));
            i++;
            k++;
        }
        while (j < right.size()) {
            snacks.set(k, right.get(j));
            j++;
            k++;
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
