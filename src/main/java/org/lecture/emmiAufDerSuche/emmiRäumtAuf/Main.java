package org.lecture.emmiAufDerSuche.emmiRäumtAuf;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        TrackedSnackList snacks =
                new TrackedSnackList(List.of(
                        new SortSnack("Pudding", 2, 0),
                        new SortSnack("Käse", 1, 1),
                        new SortSnack("Joghurt", 2, 2),
                        new SortSnack("Banane", 4, 3),
                        new SortSnack("Apfel", 5, 4),
                        new SortSnack("Milchreis", 3, 5)
                ));

        System.out.println("Anzahl Snacks: " + snacks.size());
    }

}
