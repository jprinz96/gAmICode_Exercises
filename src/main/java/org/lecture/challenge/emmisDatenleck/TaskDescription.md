### Task 1/1
Emmi entdeckt verdächtige Zugriffe im System. <br> 
Die Benutzer-IDs der Zugriffe sind der Reihe nach in einem Array gespeichert.

Ein Datenleck liegt vor, wenn dieselbe Benutzer-ID mindestens dreimal direkt hintereinander auftaucht.

Finde die längste Folge identischer IDs und gib deren Länge zurück.
Ist das Array leer oder null, gib 0 zurück. <br>
Beispiel:
```text   
{4, 7, 7, 7, 2, 2, 9}       -> 3
{5, 5, 5, 5, 2, 3}          -> 4
{1, 2, 3, 4}                -> 1
{8}                         -> 1
{}                          -> 0

Wichtig:
Es zählen nur direkt aufeinanderfolgende
gleiche Benutzer-IDs.
```
(max. 237.5 Punkte)