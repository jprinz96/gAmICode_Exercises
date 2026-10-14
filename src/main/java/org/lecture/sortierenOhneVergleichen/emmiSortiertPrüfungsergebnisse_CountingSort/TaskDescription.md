## Task 1/2
Emmi möchte zunächst wissen, wie häufig jede Punktezahl vorkommt. <br>
Implementiere: 
```java
public int[] countValues(int[] values, int min, int max)
```
Das Ergebnis enthält die Häufigkeiten aller Werte von min bis max.<br>
Beispiel:
```text
values = [2, 5, 2, 3, 5] --> min = 2 und max = 5
Ergebnis: [2, 1, 0, 2]
```
(max. 51 Punkte)
## Task 2/2
Emmi kennt nun die Häufigkeiten der einzelnen Punktewerte. <br>
Implementiere: 
```java
public void sort(int[] values)
```
Sortiere das Array aufsteigend mit Counting Sort. Verwende dafür``countValues(...)``. <br>
Beispiel:
```text
Vorher: [72, 91, 55, 72, 100, 60]
Nachher: [55, 60, 72, 72, 91, 100]
```
(max. 51 Punkte)
