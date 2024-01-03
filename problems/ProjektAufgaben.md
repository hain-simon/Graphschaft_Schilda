# ProjektAufgaben

- In der Graphschaft Schilda gibt es viel zu tun. Die Graphschaft hat
  viele Mitarbeiter:innen mit unterschiedlichen Kompetenzen (Finanzen,
  Planung, Straßenbau, Festorganisation, und so weiter).
- Viele Projekte sind zu bewältigen, viel mehr, als es Mitarbeitende gibt.
  Gleichzeitig müssen einige Projekte von mehreren Mitarbeitenden
  gemeinsam bearbeitet werden um erfolgreich zu sein.
- Die Graphschaft hat nun, um die Mitarbeitenden vor Überlastung zu
  schützen, die Policy aufgestellt, dass jede Mitarbeiterin und jeder
  Mitarbeiter an maximal 3 Projekten arbeiten darf.
- Damit nun die Kräfte möglichst gut eingesetzt werden, alle
  Mitarbeier:innen entsprechend ihrer Kompetenzen Projekten
  zugeordnet sind,  aber kein Mitarbeiter/keine Mitarbeiterin mehr als 3
  Projekte bearbeitet, bittet die Stadt Schilda Sie ein Planungstool für
  das Matching zwischen Mitarbeiter:innen und Projekten zu erstellen.


## Notizen

## Welche Daten sollen verarbeitet werden?

- Mitarbeiter mit Kompetenzen
- Projekte mit Bereich
- Anzahl an benötigten Mitarbeiter

## Was sind die Eingaben?
- Zwei Arrays: 
  - Zweidimensionales Array, die Informationen über die Kompetenzen der Mitarbeiter und der Projekte enthält
    - Beispiel/ Aufbau Matrix:
      
        |        | Projekt 1 | Projekt 2 | Projekt ...|
        |-----------------|-----------|-----------|---|
        | Mitarbeiter 1   | 1         | 0         |...
        | Mitarbeiter 2   | 1         | 1         |...
        | Mitarbeiter ... | 0         | 1         |...
       
    - Eindimensionales Array, die Informationen über die gewünschte Anzahl an Mitarbeitern pro Projekt enthält
      - Beispiel/ Aufbau Array:
    
        | Projekt 1 | Projekt 2 | Projekt 3 | Projekt ... |
        |-----------|-----------|-----------|-------------|
        | 3         | 2    | 5         | ...         |
   
  

## Was sind die Ausgaben?

Die Ausgabe ist ein zweidimensionales Array. Jede Zeile entspricht ein Mitarbeiter. Jede Spalte entspricht ein Projekt. 
Falls ein Mitarbeiter einem Projekt zugeordnet ist, so beträgt der Wert in deren Kruezfeld 1. Wenn ein Mitarbeiter und ein Projekt nicht diegleichen Kompetenzen haben, so ist der Wert in ihrem Schnittfeld 0. 

## Welcher Algorithmus eignet sich?

- Eigens erstellter Algorithmus: Mitarbeiter-zu-Projekt-Zuordnungsalgorithmus, welcher mithilfe einer angebeben maximalen Anzahl an Mitarbeitern pro Projekt und den Kompenenten der Mitarbeiter im Vergleich zu den benötigten Kompetenzen für ein Projekt, alle Mitarbeiter den Projekten zuordnet.

## Welche Datenstruktur eignet sich?
- Benutzte Datenstrukturen: 
  - Array
  - List
> Beide Datenstrukturen helfen die Datenstruktur bipartiter Graph (Hier: Zeilen = Mitarbeter; Spalten = Projekte) umzusetzen

## Was ist die Laufzeit?
- Die Laufzeit dieses Algorithmus ist abhängig von folgenden Komponenten: 
  - Anzahl der Mitarbeiter: M
  - Anzahl der Projekte: P
- Analyse des Algorithmus: 
  - äußere for - Schleife: O(P)
  - innnere for - Schleife: O(M) 
  - Mischen der Liste mitarbeiterMitKompetenzen der Länge L: O(L) --> L: durchschnittliche Länge der Liste 

>Insgesamt beträgt die Laufzeitkomplexität O(P * (M + L))

