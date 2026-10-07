# EMMIS SNACK-ARCHIV

Für eure Suchalgorithmen steht euch ein vorbereitetes Snack-Archiv zur Verfügung.
Um das Einlesen der Daten müsst ihr euch nicht kümmern.

## ZUGRIFF AUF DAS ARCHIV

Anzahl der gespeicherten Snacks:

```
archive.size();
```

Zugriff auf einen Snack:

```
Snack snack = archive.get(index);
```

WICHTIG:
Jeder Aufruf von archive.get(...) zählt als EIN Zugriff auf das Archiv.

## EIN SNACK

Jeder Snack besitzt eine ID und einen Namen:

```
snack.id();
snack.name();
```

Beispiel:

```
Snack snack = archive.get(5);

System.out.println(snack.id());
System.out.println(snack.name());
```

## EURE AUFGABE

Eure Suchalgorithmen implementiert ihr in EmmiSearch.java.

Welche Anforderungen eure Suche erfüllen muss, erfahrt ihr in den jeweiligen Tasks.

Viel Erfolg bei der Suche! 
