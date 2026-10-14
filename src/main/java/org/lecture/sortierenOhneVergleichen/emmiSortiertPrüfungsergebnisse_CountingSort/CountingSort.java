package org.lecture.sortierenOhneVergleichen.emmiSortiertPrüfungsergebnisse_CountingSort;

public class CountingSort {

    public int[] countValues(int[] values, int min, int max) {
        int[] result = new int[max - min + 1];

        for (int i = min; i <= max; i++) {
            int count = 0;

            for (int j = 0; j < values.length; j++) {
                if (values[j] == i) {
                    count++;
                }
            }

            result[i - min] = count;
        }

        return result;
    }


    public void sort(int[] values) {
        if (values.length <= 1) {
            return;
        }

        int min = values[0];
        int max = values[0];

        for (int value : values) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        int[] counts = countValues(values, min, max);

        int index = 0;

        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                values[index] = i + min;
                index++;
            }
        }
    }
}
