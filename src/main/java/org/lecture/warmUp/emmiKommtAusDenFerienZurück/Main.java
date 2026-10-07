package org.lecture.warmUp.emmiKommtAusDenFerienZurück;

public class Main {
    public static void main(String[] args) {
        // Dein Code hier
        System.out.println(kannStarten(35)); //true
        System.out.println(berechneCode(10)); //2 + 4 + 6 + 8 + 10 = 30

    }

    // oder hier
    /*
      Task 1/5 - Emmi ist zurück aus den Sommerferien und möchte GamiCode starten. Doch zuerst muss sie prüfen, ob ihr Akku noch ausreichend geladen ist.
      Emmi kann starten, wenn ihr Akku mindestens 20 % geladen ist.

     Implementiere die Methode kannStarten.
     Beispiel: kannStarten(35)
     */
    public static boolean kannStarten (int akku){
        return akku >=20;
    }

    /*
    Task 2/5 - Emmi steht vor der Tür zum GamiCode-Labor. Leider hat sie ihren Zugangscode vergessen.
    Zum Glück erinnert sie sich an die Regel:

    Der Zugangscode ist die Summe aller geraden Zahlen von 1 bis einschließlich n.

    Implementiere die Methode berechneCode(n).
     */
    public static int berechneCode(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum+=i;
            }
        }
        return sum;
    }


    /*
    Task 3/5 - Emmi hat nach den Sommerferien ein kleines Problem: Im System liegen viele Dateien herum und jede Datei besitzt eine numerische ID.
    Emmi sucht die Datei mit der größten ID.

    Implementiere die Methode findeGroessteId.
    BSP:
    IDs:
    {4, 7, 2, 9, 3} --> 9

    {4, -7, 2, 9, 3} --> 9

    Du kannst davon ausgehen, dass das Array mindestens einen Wert enthält.
    (max. 190 Punkte)
    */
}
