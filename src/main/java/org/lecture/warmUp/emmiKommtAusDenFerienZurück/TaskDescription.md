### Task 1/5
Emmi ist zurück aus den Sommerferien und möchte GamiCode starten. Doch zuerst muss sie prüfen, ob ihr Akku noch ausreichend geladen ist.
Emmi kann starten, wenn ihr Akku mindestens 20 % geladen ist.

Implementiere die Methode kannStarten.
Beispiel: ``kannStarten(35)``

### Task 2/5
Emmi steht vor der Tür zum GamiCode-Labor. Leider hat sie ihren Zugangscode vergessen.
Zum Glück erinnert sie sich an die Regel:

Der Zugangscode ist die Summe aller geraden Zahlen von 1 bis einschließlich n.

Implementiere die Methode ``berechneCode(n)``.

### Task 3/5
Emmi hat nach den Sommerferien ein kleines Problem: Im System liegen viele Dateien herum und jede Datei besitzt eine numerische ID.
    Emmi sucht die Datei mit der größten ID.

Implementiere die Methode ``findeGroessteId``. <br>
Beispiel:
```text 
    IDs:
    {4, 7, 2, 9, 3} --> 9

    {4, -7, 2, 9, 3} --> 9
```
Du kannst davon ausgehen, dass das Array mindestens einen Wert enthält. 

### Task 4/5
Emmi hat auf dem Weg durch das GamiCode-Labor mehrere Energiekristalle gefunden.
Jeder Kristall besitzt einen Energiewert. <br>
Allerdings kann Emmi nur Kristalle verwenden, deren Energiewert positiv und gerade ist.

Berechne die gesamte nutzbare Energie.

Beispiel:
```text
Kristalle:
{4, -2, 7, -5, 3, 8}

Nutzbar sind: 4 und 8

Gesamtenergie: 12
```
Implementiere die Methode ``berechneEnergie``.

### Task 5/5
Emmi hat es fast geschafft. Doch um das GamiCode-System vollständig zu starten, benötigt sie einen letzten Rettungscode.

Dafür bekommt sie eine Liste mit Zahlen. <br>
Der Rettungscode wird nach folgenden Regeln berechnet:

- Berücksichtige nur positive Zahlen.
- Berücksichtige davon nur die geraden Zahlen.
- Von diesen Zahlen benötigt Emmi die größte.

Gibt es keine passende Zahl, lautet der Rettungscode -1.

Beispiele:
```text
{3, 8, -4, 12, 7} --> 12

{1, 3, 5} --> -1

{-2, -8, 7} --> -1

{4, 18, 6, 10} --> 18
```
Implementiere die Methode ``findeRettungscode``. 

