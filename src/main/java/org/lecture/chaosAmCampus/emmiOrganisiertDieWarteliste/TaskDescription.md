## Task 1/3
Eine gültige Studierenden-ID besteht aus genau 10 Ziffern.

Implementiere eine Methode ``isValidId``, die eine Studierenden-ID entgegennimmt und zurückgibt, ob sie gültig ist.

Beachte, dass jede mögliche gültige Studierenden-ID verarbeitet werden können muss.

Eine Umwandlung in String ist nicht vorgesehen. (max. 42.5 Punkte)

## Task 2/3
Emmi kann einzelne Studierenden-IDs bereits prüfen. Nun soll sie eine gesamte Warteliste kontrollieren.

Implementiere zusätzlich eine Methode ``isValidWaitingList``, die eine Warteliste als Array entgegennimmt und überprüft.

Eine Warteliste ist gültig, wenn alle enthaltenen Studierenden-IDs gültig sind und keine Studierenden-ID doppelt vorkommt.

Eine leere Warteliste ist gültig. null ist keine gültige Warteliste.

Verwende für die Prüfung einzelner IDs deine bereits implementierte Methode isValidId (max. 41.25 Punkte)

## Task 3/3
Implementiere zusätzlich eine Methode ``organizeWaitingList``, die eine gültige Warteliste als Array entgegennimmt und die Studierenden-IDs aufsteigend sortiert zurückgibt.

Die übergebene Warteliste darf dabei nicht verändert werden.

Verwende einen selbst implementierten Sortieralgorithmus. (max. 41.25 Punkte)
