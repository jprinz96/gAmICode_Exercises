package org.lecture.emmiAufDerSuche.emmisGroßerSnackAnsturm;

import java.util.List;

public class Main {
    static void main() {
        TrackedSnackList snacks =
                new TrackedSnackList(List.of(
                        new Snack(108, "Butter-Blitz"),
                        new Snack(103, "Joghurt-Jetpack"),
                        new Snack(111, "Käse-Komet"),
                        new Snack(101, "Pudding-Panik"),
                        new Snack(106, "Milchreis-Monster"),
                        new Snack(110, "Topfen-Tornado"),
                        new Snack(102, "Gouda-Galaxie"),
                        new Snack(107, "Mozzarella-Meteor"),
                        new Snack(105, "Keks-Komet"),
                        new Snack(104, "Topfen-Traum"),
                        new Snack(109, "Butter-Bombe"),
                        new Snack(100, "Snack-Stern")
                ));
        List<Integer> targetIds = List.of(109, 101, 999);

        System.out.println("Anzahl Snacks: " + snacks.size());

        System.out.println(EmmiSnackFinder.findSnacks(snacks, targetIds));
    }
}