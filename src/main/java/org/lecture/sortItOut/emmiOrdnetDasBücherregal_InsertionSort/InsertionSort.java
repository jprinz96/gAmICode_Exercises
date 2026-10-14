package org.lecture.sortItOut.emmiOrdnetDasBücherregal_InsertionSort;

public class InsertionSort {

    /**
     * Fügt das Element an Position index in den bereits
     * sortierten Bereich [0, index) ein.
     */
    public void insertNext(int[] values, int index) {
        int current = values[index];

        int j = index - 1;
        while (j >= 0 && values[j] > current) {
            values[j + 1] = values[j];
            j--;
        }
        values[j + 1] = current;
    }

    public void sort(int[] values) {
        for (int i = 1; i < values.length; i++) {
            insertNext(values, i);
        }
    }
}
