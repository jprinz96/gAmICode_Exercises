## Task 1/2
Ein Teil von Emmis Bücherregal ist bereits nach Signaturnummern sortiert. Nun kommt ein weiteres Buch hinzu, das noch an der richtigen Stelle eingeordnet werden muss.

Implementiere die Methode: 
```java
public void insertNext(int[] values, int index)
```
Das Buch an der Position index soll so in den bereits sortierten Bereich davor eingeordnet werden, dass dieser anschließend wieder vollständig sortiert ist.
```text
Vorher: [12, 25, 37, 18, 50] --> Nachher: [12, 18, 25, 37, 50]
```
In diesem Beispiel befindet sich das neu einzuordnende Buch an Position 3.
(max. 34 Punkte)
## Task 2/2
Die einzelnen Bücher kann Emmi nun richtig einordnen. Jetzt wartet ein ganzes unsortiertes Bücherregal auf sie. <br>
Implementiere die Methode: 
```java
public void sort(int[] values)
```
Sortiere alle Signaturnummern aufsteigend mit Insertion Sort. Verwende dafür deine bereits implementierte Methode insertNext(...). <br>
Beispiel: 
```text
Vorher: [42, 17, 31, 8, 25] --> Nachher: [8, 17, 25, 31, 42]
```
Fertige Sortierfunktionen der Java-Standardbibliothek dürfen nicht verwendet werden. (max. 34 Punkte)
