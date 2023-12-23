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


## Notizen

## Welche Daten sollen verarbeitet werden?


## Was sind die Eingaben?

- Eingabe in den ALgorithmus ist ein ungerichteter und ungewichteter Graph. Dieser wird durch Abfrage in der Konsole mit der Klasse GraphScanner erstellt


## Was sind die Ausgaben?

- Die Ausgabe dieser Klasse ist wie folgt aufgebaut: 
  1. Adjazenzmatrix, die aus dem Graph erstellt wird 
  2. Adjazenzliste, ebenfalss aus dem Graphen erstellt 
  3. Lösungssets - Lösung zum Problem
  4. Anzahl der Knoten, mit denen alle Kanten abgedeckt werden können 


- Beispielausgabe: 
  - Adjacency Matrix:
  
      1 1 0 1
  
      1 1 1 1
  
      0 1 1 1
  
      1 1 1 1

  - Adjacency List:
  
    0: 0 1 3
  
    1: 0 1 2 3
  
    2: 1 2 3
  
    3: 0 1 2 3

  - Lösungs Sets: [[0, 1, 2, 3]]
  

    Man benöitgt 1 Knoten, um alle Kanten abzudecken.

    Hier sind die Knoten mit ihren jeweiligen Kanten, um alle Kanten abzudecken:
    Knoten 1 mit folgenden Kanten: [0, 1, 2, 3]

## Welcher Algorithmus eignet sich?

- um dieses Problem zu lösen , eignet sich der Set - Cover Algorithmus. Dieser arbeitet mit einer Kantenüberdeckung

## Welche Datenstruktur eignet sich?



## Was ist die Laufzeit?


