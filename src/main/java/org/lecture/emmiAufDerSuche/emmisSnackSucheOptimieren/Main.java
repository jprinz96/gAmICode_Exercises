package org.lecture.emmiAufDerSuche.emmisSnackSucheOptimieren;

import java.util.List;

public class Main {
    static void main() {
        EmmiSnackArchive archive =
                new EmmiSnackArchive(List.of(
                        new Snack(10010, "Käse-Komet"),
                        new Snack(10020, "Pudding-Panik"),
                        new Snack(10030, "Milchreis-Monster"),
                        new Snack(10040, "Gouda-Galaxie"),
                        new Snack(10050, "Joghurt-Jetpack"),
                        new Snack(10060, "Mozzarella-Meteor"),
                        new Snack(10070, "Topfen-Tornado")
                ));


        EmmiSearch emmisearch = new EmmiSearch();
        int ergebnis = emmisearch.sequentialSearch(archive, 10030);
        System.out.println("Sequential Search: " + ergebnis);

        ergebnis = emmisearch.efficientSearch(archive, 10060);
        System.out.println("Binär Search: " + ergebnis);
    }
}
