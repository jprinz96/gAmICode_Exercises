### Task 1/3
Emmi verwaltet ihr geheimes Snack-Archiv über die neue MooCloud™ Snack API.

Noch ist jeder Zugriff kostenlos.

Implementiere die statische Methode sequentialSearch(EmmiSnackArchive archive, int targetId) und suche nach einer bestimmten Snack-ID im Archive.

Die Suche muss **sequentiel**l von vorne nach hinten erfolgen.

Das bedeutet: Index 0 Index 1 Index 2 Index 3 ...

Die Methode soll den Index des gefundenen Snacks zurückgeben.

Falls die ID nicht existiert, soll -1 zurückgegeben werden.

### Task 2/3
Schlechte Nachrichten: Die MooCloud™ verrechnet Emmi ab sofort jeden Zugriff auf ihr Snack-Archiv. 💸

Erstellt in ``EmmiSearch`` eine neue Methode
```java
public static int efficientSearch(EmmiSnackArchive archive, int targetId)
```

Findet den gesuchten Snack mit maximal 30 Zugriffen auf ``archive.get(...)``.

Welche Suchstrategie ihr dafür verwendet, bleibt euch überlassen.

Gebt den Index des Snacks zurück.

Falls der Snack nicht gefunden wird, gebt -1 zurück.
### Task 3/3
Emmi möchte noch eine weitere Suchstrategie ausprobieren: **Exponential Search**.

Erstellt in ``EmmiSearch`` eine neue Methode
```java
public static int exponentialSearch(EmmiSnackArchive archive, int targetId)
```
Grenzt den möglichen Suchbereich zunächst mit exponentiell wachsenden Schritten ein:

1, 2, 4, 8, 16, 32, ...

Sobald der passende Bereich gefunden wurde, führt ihr innerhalb dieses Bereichs eine binäre Suche durch.

Gebt den Index des Snacks zurück.

Falls der Snack nicht gefunden wird, gebt -1 zurück. 