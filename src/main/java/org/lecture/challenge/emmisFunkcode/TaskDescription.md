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
### Task 2/2
Emmi empfängt nun auch Zahlen und Sonderzeichen. Damit die einzelnen Blöcke weiterhin eindeutig erkennbar sind, werden sie mit ``|`` getrennt.

Aus 111AAA!!!?? wird 13|A3|!3|?2.

Beispiele:
```text
"111AAA!!!??" -> "13|A3|!3|?2"

"AA11BB" -> "A2|12|B2"

"AAAAAAAAAAAA" -> "A12"

"111111111111" -> "112"
```
Die Nachricht kann 
- Buchstaben, 
- Zahlen, 
- Leerzeichen und 
- Sonderzeichen enthalten.

Das Zeichen ``|`` kommt in den Nachrichten nicht vor. <br>
Ist der übergebene Text leer oder null, gib einen leeren String zurück. <br>
(max. 118.75 Punkte)