### Task 1/2
Emmi empfängt Nachrichten aus einem alten Funksystem. Gleiche Buchstaben hintereinander werden zusammengefasst.
```text
Aus AAABBCCCCDAA wird A3B2C4D1A2.
```


Die Nachrichten enthalten ausschließlich die Buchstaben A bis Z. <br> 
Ist der übergebene Text leer oder null, gib einen leeren String zurück. <br>
Kann der übergebene Text nicht verarbeitet werden, gib den String "UNGUELTIG" zurück. 
Beispiel:
```text
"AAABBCCCCDAA" -> "A3B2C4D1A2"
"A"            -> "A1"
"ABAB"         -> "A1B1A1B1"
""             -> ""
```
(max. 118.75 Punkte)
