package org.lecture.emmiAufDerSuche.emmiRäumtAuf;

import java.util.ArrayList;
import java.util.List;

public class TrackedSnackList {

    private final List<SortSnack> snacks;

    public TrackedSnackList(List<SortSnack> snacks) {
        this.snacks = new ArrayList<>(snacks);
    }

    public int size() {
        return snacks.size();
    }

    public SortSnack get(int index) {
        return snacks.get(index);
    }

    public void set(int index, SortSnack snack) {
        snacks.set(index, snack);
    }

    public int compare(int i, int j) {
        return compareValues(snacks.get(i), snacks.get(j));
    }

    public int compareValues(SortSnack snackA, SortSnack snackB) {
        return Integer.compare(snackA.priority(), snackB.priority());
    }

    public void swap(int i, int j) {
        SortSnack temp = snacks.get(i);
        snacks.set(i, snacks.get(j));
        snacks.set(j, temp);
    }
}