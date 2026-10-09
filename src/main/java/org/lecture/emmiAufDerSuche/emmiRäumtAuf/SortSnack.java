package org.lecture.emmiAufDerSuche.emmiRäumtAuf;

public record SortSnack(String name, int priority, int arrivalOrder
) {
}

/*
    So wird ein Snack dargestellt:
    new SortSnack("Pudding", 2, 0);
    new SortSnack("Käse", 1, 1);
    new SortSnack("Joghurt", 2, 2);
    d.h: arrivalOrder ist aufsteigend!
*/
