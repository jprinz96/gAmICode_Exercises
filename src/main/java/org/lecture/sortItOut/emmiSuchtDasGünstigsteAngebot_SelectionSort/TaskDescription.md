## Task 1/2
Emmi vergleicht die Preise verschiedener Angebote. Für ihre weitere Verarbeitung benötigt sie die Position des günstigsten Angebots innerhalb eines bestimmten Bereichs.<br>
Implementiere die Methode 
```java
public int findMinIndex(int[] values, int fromIndex)
```
so, dass sie den für Selection Sort benötigten Index bestimmt. <br>
Beispiel: 
```text
int[] values = {8, 5, 12, 3, 9}; --> findMinIndex(values, 1); --> liefert: 3
```
Halte dich an die vorgegebene Methodensignatur. <br>
Hinweis: Überlege dir, welche Rolle die Suceh innerhalb von Selection Sort spielt. (max. 33 Punkte)
## Task 2/2
Emmi kann nun das günstigste noch nicht einsortierte Angebot finden. Jetzt soll die gesamte Preisliste sortiert werden.

Implementiere die Methode 
```java
public void sort(int[] values) 
```
und sortiere das übergebene Array aufsteigend mit Selection Sort.<br>
Verwende dafür die bereits implementierte Methode 
```java 
findMinIndex(...)
```

Beispiel: 
```text
Aus [8, 5, 12, 3, 9] wird [3, 5, 8, 9, 12]
```
Fertige Sortierfunktionen der Java-Standardbibliothek dürfen nicht verwendet werden.
(max. 33 Punkte)