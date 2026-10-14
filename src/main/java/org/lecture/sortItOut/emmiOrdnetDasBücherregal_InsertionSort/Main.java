package org.lecture.sortItOut.emmiOrdnetDasBücherregal_InsertionSort;

public class Main {

    static void main(String[] args) {
        int[] values = {42, 17, 31, 8, 25};
        InsertionSort is = new InsertionSort();
        is.sort(values);
        for (int i : values) {
            System.out.print(i + " ");
        }
    }

}