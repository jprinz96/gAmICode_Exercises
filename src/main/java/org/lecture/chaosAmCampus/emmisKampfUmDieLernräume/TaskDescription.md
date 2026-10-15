## Task 1/3
Emmi möchte zunächst wissen, wie häufig ein bestimmter Lernraum gebucht wurde. <br>
Implementiere eine Methode ``countBookings``, die ein Array mit Buchungen und eine Raumnummer entgegennimmt.

Gib zurück, wie oft die gesuchte Raumnummer im Array vorkommt. Wurde der Raum kein einziges Mal gebucht, gib 0 zurück.

Beispiel: 
```text
Buchungen: [204, 101, 204, 305, 101, 204] --> Gesuchter Raum: 204 --> Ergebnis: 3 
```
(max. 42.5 Punkte)
## Task 2/3
Emmi möchte nun wissen, welcher Lernraum insgesamt am häufigsten gebucht wurde.<br>
Implementiere zusätzlich eine Methode ``findMostPopularRoom``, die ein Array mit Buchungen entgegennimmt und die Raumnummer mit den meisten Buchungen zurückgibt.

Sind mehrere Räume gleich häufig gebucht, gib die kleinere Raumnummer zurück.

Ist das Array leer, gib -1 zurück.

Beispiel:
```text
Buchungen: [204, 101, 204, 305, 101, 204, 305] --> Ergebnis: 204

Bei Gleichstand: [305, 101, 305, 101] --> Ergebnis: 101 
```
(max. 41.25 Punkte)
## Task 3/3
Jetzt wird es etwas anspruchsvoller: Emmi möchte nicht nur den beliebtesten Lernraum kennen, sondern eine Rangliste der drei beliebtesten Räume erstellen.<br>
Implementiere zusätzlich eine Methode ``findTopThreeRooms``, die ein Array mit Buchungen entgegennimmt und ein Array mit den drei meistgebuchten unterschiedlichen Raumnummern zurückgibt.

- Die Räume werden nach der Anzahl ihrer Buchungen absteigend gereiht. 
- Haben zwei Räume gleich viele Buchungen, kommt die kleinere Raumnummer zuerst.
- Gibt es weniger als drei unterschiedliche Räume, enthält das Ergebnis entsprechend weniger Einträge.

Beispiel:
```text
Buchungen: [204, 101, 204, 305, 101, 204, 402, 305, 204]

Häufigkeiten: 204 -> 4, 101 -> 2, 305 -> 2, 402 -> 1

Ergebnis: [204, 101, 305] --> 101 und 305 wurden beide zweimal gebucht. Wegen der kleineren Raumnummer kommt 101 zuerst.
```
(max. 41.25 Punkte)