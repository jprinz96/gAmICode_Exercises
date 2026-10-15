## Task 1/3
Emmi möchte herausfinden, an welcher Position sich ein bestimmter belegter Spind in ihrer Liste befindet.<br>
Implementiere eine Methode ``findLocker``, die ein Array mit belegten Spindnummern und die gesuchte Spindnummer entgegennimmt.<br>
Gib den **Index** der gesuchten Spindnummer zurück. Kommt die Spindnummer nicht im Array vor, gib -1 zurück.

Beispiel:
```text
Belegte Spinde: [42, 17, 305, 91]
Gesuchter Spind: 305
Ergebnis: 2
```
Die Reihenfolge der Spindnummern im Array ist nicht vorgegeben.

## Task 2/3
Emmi bekommt die Liste der belegten Spinde nun aufsteigend sortiert. Dadurch kann sie die Suche deutlich effizienter gestalten. <br>
Implementiere zusätzlich eine Methode ``findLockerFast``, die ein sortiertes Array mit belegten Spindnummern und die gesuchte Spindnummer entgegennimmt.<br>
Nutze die Sortierung der Daten, um den Suchbereich bei jedem Schritt zu verkleinern.

Gib wieder den **Index** der gesuchten Spindnummer zurück. Ist sie nicht enthalten, gib -1 zurück.
```text
Belegte Spinde: [8, 17, 42, 91, 120, 305]
Gesuchter Spind: 91
Ergebnis: 3
```
(max. 41.25 Punkte)

## Task 3/3
Ein Studierender möchte einen bestimmten Spind. Ist dieser bereits belegt, soll Emmi den nächstgelegenen freien Spind finden. <br>
Implementiere zusätzlich eine Methode ``findClosestFreeLocker``, die ein aufsteigend sortiertes Array der belegten Spinde und die gewünschte Spindnummer entgegennimmt. <br>
Es gibt Spinde mit den Nummern 1 bis 1000.

Dabei gilt:
- Ist der gewünschte Spind frei, gib ihn direkt zurück.
- Ist er belegt, suche den freien Spind mit dem kleinsten Abstand.
- Sind zwei freie Spinde gleich weit entfernt, gib die kleinere Spindnummer zurück.
- Sind alle Spinde belegt, gib -1 zurück.

Beispiele:
```text
Belegt: [10, 11, 12, 13, 20] --> Wunsch: 12 --> Ergebnis: 14
Belegt: [100, 101, 102] --> Wunsch: 101 --> Ergebnis: 99
```

(max. 41.25 Punkte)