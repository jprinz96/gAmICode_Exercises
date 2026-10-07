package org.lecture.emmiAufDerSuche.emmisSnackSucheOptimieren;
import java.util.List;

public class EmmiSnackArchive {

    private final List<Snack> snacks;

    public EmmiSnackArchive(List<Snack> snacks) {
        this.snacks = List.copyOf(snacks);
    }

    public int size() {
        return snacks.size();
    }

    public Snack get(int index) {
        return snacks.get(index);
    }
}