package org.lecture.emmiAufDerSuche.emmisGroßerSnackAnsturm;

import java.util.ArrayList;
import java.util.List;

public class TrackedSnackList {

    private final List<Snack> snacks;

    private int reads;
    private int comparisons;
    private int writes;
    private int swaps;

    public TrackedSnackList(List<Snack> snacks) {
        this.snacks = new ArrayList<>(snacks);
    }

    public int size() {
        return snacks.size();
    }

    public Snack get(int index) {
        reads++;
        return snacks.get(index);
    }

    public void set(int index, Snack snack) {
        writes++;
        snacks.set(index, snack);
    }

    public void swap(int i, int j) {
        swaps++;

        Snack temp = snacks.get(i);
        snacks.set(i, snacks.get(j));
        snacks.set(j, temp);
    }

    public int compare(int i, int j) {
        comparisons++;
        return Integer.compare(
                snacks.get(i).id(),
                snacks.get(j).id()
        );
    }

    public int compareValues(Snack snackA, Snack snackB) {
        comparisons++;
        return Integer.compare(snackA.id(), snackB.id());
    }

    public int compareValueToId(Snack snack, int targetId) {
        comparisons++;
        return Integer.compare(snack.id(), targetId);
    }

    public int getTotalOperations() {
        return reads + comparisons + writes + swaps;
    }

    public void resetCounters() {
        reads = 0;
        comparisons = 0;
        writes = 0;
        swaps = 0;
    }
}
