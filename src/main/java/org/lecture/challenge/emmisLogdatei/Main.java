package org.lecture.challenge.emmisLogdatei;

public class Main {
    static void main() {
        int[] fehlercodes = {4, 2, 7, 4, 3, 2, 4, 7, 4};
        int[] fehlercodes2 = {5, 2, 5, 2, 9};
        int[] fehlercodes3 = {-3, -3, 2, 2, 7};

        System.out.println(Logdatei.haufigsteFehler(fehlercodes));
        System.out.println(Logdatei.haufigsteFehler(fehlercodes2));
        System.out.println(Logdatei.haufigsteFehler(fehlercodes3));

    }
}
