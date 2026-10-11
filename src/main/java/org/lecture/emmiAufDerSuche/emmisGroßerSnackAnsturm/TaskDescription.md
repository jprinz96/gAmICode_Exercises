### Task 1/1
Bei Emmi herrscht Hochbetrieb. Ihr bekommt eine ungeordnete ``Liste`` von Snacks und eine ``Liste`` mit vielen gesuchten Snack-IDs.

Erstellt in EmmiSnackFinder die Methode 
```java
public static List<Snack> findSnacks(TrackedSnackList snacks, List<Integer> targetIds)
```
Für jede ID in ``targetIds`` soll der passende Snack gefunden und zur Ergebnisliste hinzugefügt werden. <br>
Beispiel: 
```text
targetIds = [109, 101, 999] --> Ergebnis [Snack mit ID 109, Snack mit ID 101, null]
```
Wird eine ID nicht gefunden, fügt an dieser Stelle ``null`` zur Ergebnisliste hinzu.

Die Tests enthalten bis zu 128 Snacks und bis zu 60 Suchanfragen.<br>
Eure Lösung darf dabei insgesamt höchstens 3.800 Operationen benötigen.<br>
Überlegt, wie ihr die bisher kennengelernten Algorithmen sinnvoll einsetzen könnt, um die vielen Anfragen effizient zu bearbeiten. (max. 330 Punkte)
