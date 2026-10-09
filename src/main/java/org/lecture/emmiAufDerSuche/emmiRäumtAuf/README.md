# EMMIS SORTIERWERKZEUGE

Für eure Sortieralgorithmen steht euch eine vorbereitete Snack-Liste zur Verfügung.

Um die Verwaltung der Daten müsst ihr euch nicht kümmern.

## ZUGRIFF AUF DIE LISTE

Anzahl der Snacks:

```
snacks.size();
```

Snack an einer bestimmten Position:

```
SortSnack snack = snacks.get(index);
```

Snack an einer Position ersetzen:

```
snacks.set(index, snack);
```

Zwei Snacks an ihren Positionen vergleichen:

```
snacks.compare(i, j);
```

Die Methode liefert:

```
< 0    wenn der linke Snack eine kleinere Priorität hat
  0    wenn beide die gleiche Priorität haben
> 0    wenn der linke Snack eine größere Priorität hat
```

Zwei bereits geladene Snacks vergleichen:

```
snacks.compareValues(snackA, snackB);
```

Auch hier erfolgt der Vergleich anhand der Priorität.

## SNACKS VERTAUSCHEN

Zwei Snacks können ihre Position tauschen:

```
snacks.swap(i, j);
```

## EIN SNACK

Ein Snack besitzt einen Namen, eine Priorität und seine ursprüngliche Position:

```
snack.name();
snack.priority();
snack.arrivalOrder();
```

Sortiert wird in dieser Challenge nach der Priorität.

## EURE AUFGABE

Eure Sortieralgorithmen implementiert ihr in EmmiSort.java.

Welche Sortierstrategie ihr verwenden müsst und welche Anforderungen sie erfüllen soll, erfahrt ihr in den jeweiligen Tasks.

Viel Erfolg beim Aufräumen! 
