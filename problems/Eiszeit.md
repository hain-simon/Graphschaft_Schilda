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
  - Der Datentyp dieses Arrays ist int. 

## Was sind die Eingaben?

- Eingabe in den Algorithmus ist ein ungerichteter und ungewichteter Graph in Form einer zweidimensionalen Adjazenzmatrix.


## Was sind die Ausgaben?

- Die Ausgabe beinhaltet alle Knoten, deren Kanten alle anderen Knoten abdecken. In der Ausgabe ist deutlich, welche Knoten mit deren Knotennummern wichtig sind, um alle Kanten zu überdecken. 


- Beispielausgabe:
  Vertices needed: Knoten 9; Knoten 6; Knoten 4; Knoten 1; Knoten 3;

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
- 
Die Laufzeit des vorliegenden Algorithmus hängt von der Anzahl der Knoten (|V|) und Kanten (|E|) im Graphen ab. Die Schleife while (!remainingVertices.isEmpty()) wird höchstens |V| Iterationen durchlaufen, da in jeder Iteration mindestens ein Knoten aus remainingVertices entfernt wird. Die Methode getVertexWithMostConnections durchläuft alle verbleibenden Knoten und sucht nach dem Knoten mit den meisten ausgehenden Kanten, was O(|V|) Zeit in Anspruch nimmt. Innerhalb der Schleife wird ein Knoten und seine ausgehenden Kanten entfernt, wobei das Entfernen eines Knotens im Allgemeinen O(1) dauert und das Entfernen aller ausgehenden Kanten in O(k), wobei k die Anzahl der ausgehenden Kanten des entfernten Knotens ist.

Zusammengefasst ergibt sich eine geschätzte Gesamtlaufzeit von O(|V|^2 + |E|). 


