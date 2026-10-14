package org.lecture.sortItOut.emmiSuchtDasGünstigsteAngebot_SelectionSort;

public class SelectionSort {

    /**
     * Sucht ab fromIndex nach dem kleinsten Wert
     * und gibt dessen Index zurück.
     */
    public int findMinIndex(int[] values, int fromIndex) {
        int minIndex = fromIndex;
        for (int i = fromIndex + 1; i < values.length; i++) {
            if (values[i] < values[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * Sortiert das Array mit Selection Sort aufsteigend.
     */
    public void sort(int[] values) {
        for(int i = 0; i < values.length-1; i++){
            int minIndex = findMinIndex(values, i);

            if (minIndex != i) {
                int temp = values[i];
                values[i] = values[minIndex];
                values[minIndex] = temp;
            }
        }
    }
}