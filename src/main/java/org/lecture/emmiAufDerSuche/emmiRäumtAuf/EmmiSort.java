package org.lecture.emmiAufDerSuche.emmiRäumtAuf;

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
}
