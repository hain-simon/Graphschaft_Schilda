# Eiszeit

- So kalt es im Winter ist, so warm ist Schilda im Sommer. Nun möchte die Graphschaft
  ihren Bürgern den Zugang zu leckerem, erfrischendem Eis erleichtern. 
- Die Stadt beschließt ein Grundrecht, dass jeder Bürger maximal einen Block zum
  nächsten Eisstand laufen muss. 
- Nun überlegt die Stadt, wie sie dieses Grundrecht umsetzen kann: An den
  Straßenkreuzungen sollen Eisstände so verteilt werden, dass an jeder
  Straßenkreuzung entweder ein Eisstand vorhanden ist oder man nur einen Block zur
  nächsten Straßenkreuzung laufen muss um dort einen Eisstand zu finden. 
- Nachdem die Stadt dieses Grundrecht beschlossen hat, stellt sie fest, dass da ja doch
  immense Kosten auf die Stadt zukommen, so dass zwar das Grundrecht durchgesetzt
  werden soll, aber mit der minimalen Anzahl von Eisständen. 
- Sie werden wieder beauftragt, ein Tool zu entwickeln, dass die besten Standorte für
  11/13/2023
  die Eisstände berechnet.



## Welche Daten sollen verarbeitet werden?
- Es sollen Daten eines Graphen, in form einer zweidimensionalen Matrix, bzw. einer Adjazenzliste verarbeitet werden.

## Was sind die Eingaben?

- Eingabe in den Algorithmus ist ein ungerichteter und ungewichteter Graph in Form einer zweidimensionalen Adjazenzmatrix.


## Was sind die Ausgaben?

- Die Ausgabe dieser Klasse ist wie folgt aufgebaut: 
  1. Adjazenzmatrix, die aus dem Graph erstellt wird 
  2. Adjazenzliste, ebenfalss aus dem Graphen erstellt 
  3. Lösungssets - Lösung zum Problem
  4. Anzahl der Knoten, mit denen alle Kanten abgedeckt werden können 


- Beispielausgabe:

      Input Matrix:
      0 7 0 2 0 4
      7 0 1 0 0 0
      0 1 0 5 0 0
      2 0 5 0 10 1
      0 0 0 10 0 5
      4 0 0 1 5 0

      Man benötigt 2 Kreuzungen, um Schildas Grundrecht bezüglich der Eisstände effizient durchzusetzen.

      Hier sind die Kreuzungen mit ihren jeweiligen verbundenen Kreuzungen:
      Kreuzung 1: deckt folgenden Kreuzungen ab: [0, 2, 4, 5]
      Kreuzung 2: deckt folgenden Kreuzungen ab: [1, 3, 5]

## Welcher Algorithmus eignet sich?

- um dieses Problem zu lösen , eignet sich der Set - Cover Algorithmus. Dieser arbeitet mit einer Kantenüberdeckung

## Welche Datenstruktur eignet sich?
- Hier eignet sich die Datenstruktur Graph, umgesetzt durch eine Adjazenzmatrix oder eine Adjazenzliste
- Zur Umsetzung des Algorithmus werden zusätzliche Datenstrukturen verwendet: 
  - Datenstruktur List 
  - Datenstruktur Set 
## Welches algorithmische Problem?
- Das Set - Cover Problem ist ein klassisches NP vollständiges Problem. Es ist schwierig, eine optimale Lösung in polynomieller Zeit zu finden. Eine gegebene Lösung lässt sich allerdings schnell überprüfen. 
## Was ist die Laufzeit?
- Laufzeit ist abhängig von folgenden Komponenten:
    1) Anzahl der Knoten im Graph: N 
    1)  Anzahl der Kanten im Graph: M
- Laufzeit: O(N * M)

