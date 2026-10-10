### Task 1/3
Emmis Snacks sind völlig durcheinander. Zeit für etwas Ordnung! <br>
Erstellt in EmmiSort eine Methode
```java
public static void bubbleSort(TrackedSnackList snacks)
```
Sortiert die Snacks mit Bubble Sort aufsteigend nach ihrer Priorität. <br>
Achtet bei eurer Implementierung darauf, dass Bubble Sort stabil ist. (max. 112.2 Punkte)
### Task 2/3
Bubble Sort funktioniert – aber Emmis Snack-Sammlung wächst. 🐄📦 <br>
Implementiert jetzt Merge Sort und sortiert die Snacks aufsteigend nach ihrer Priorität.

Erstellt in EmmiSort die Methode
```java
public static void mergeSort(TrackedSnackList snacks)
```
Teilt die Liste rekursiv in kleinere Teilbereiche, sortiert diese und führt sie anschließend wieder korrekt zusammen.<br>
Achtet bei eurer Implementierung darauf, dass Merge Sort stabil ist. (max. 108.9 Punkte)
### Task 3/3
Emmi möchte noch eine zweite schnelle Sortierstrategie ausprobieren: **Quick Sort. 🚀** <br>
Erstellt in EmmiSort die Methode
```java
public static void quickSort(TrackedSnackList snacks)
```
Verwendet dabei das letzte Element eines Bereichs als Pivot und partitioniert die übrigen Elemente entsprechend ihrer Priorität.

Im Gegensatz zu Bubble Sort und Merge Sort muss die Reihenfolge von Snacks mit gleicher Priorität nicht erhalten bleiben. (max. 108.9 Punkte)