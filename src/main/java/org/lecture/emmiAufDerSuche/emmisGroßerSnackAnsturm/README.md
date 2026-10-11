🐄 EMMIS SNACK-HOTLINE

Für diese Challenge steht euch eine Liste mit Snacks zur Verfügung. <br>
Ein Snack besitzt:
```
snack.id();
snack.name();
```
## ZUGRIFF AUF DIE LISTE
Anzahl der Snacks:
```
snacks.size();
```
Snack an einer Position lesen:
```
snacks.get(index);
```
Snack an einer Position speichern:
```
snacks.set(index, snack);
```
Zwei Positionen vertauschen:
```
snacks.swap(i, j);
```
## VERGLEICHE
Zwei Snacks an ihren Positionen vergleichen:
```
snacks.compare(i, j);
```
Zwei bereits geladene Snacks vergleichen:
```
snacks.compareValues(snackA, snackB);
```
Einen Snack mit einer gesuchten ID vergleichen:
```
snacks.compareValueToId(snack, targetId);
```
## WICHTIG
Lesezugriffe, Vergleiche, Schreibzugriffe und Vertauschungen werden gezählt. <br>
Verwendet für eure Lösung die in diesem Kurs behandelten Algorithmen. <br>
Fertige Sortier-, Such- oder Lookup-Funktionen bzw. Maps/Sets sind nicht vorgesehen. <br>

## AUSPROBIEREN
In Main.java findet ihr kleine Beispieldaten, mit denen ihr eure Lösung testen könnt. <br>
Die tatsächlichen Tests verwenden andere und deutlich größere Datenmengen. <br>