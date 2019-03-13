# HTML/XML

Langages dérivés du `SGML` (Standard Generalized Markup Language) qui est un langage de balisage avec des metadata (tags/markup)

## Schéma XML

### W3School XSL-T

L'idée c'est, à partir de la reconnaissance d’un chemin dans un flux xml, on cherche à appliquer une ou plusieurs règles  
L’enoncer d’un chemin s'éffectue via le langage Xpath

```XML
<?xml version="1.0" encoding="UTF-8"?>
<promotion nom="licencePro">
    <etudiant nom="Renault" prenom="Theo" />
    <etudiant nom="Morel" prenom="Johann" />
</promotion>
```

La racine d'un flux XML est toujours sur plusieurs axes de parcours :

* Parent
* Child
* Ancestor
* Descendant
* Self
* Namespace

Parcourir l'arborescence :

* descendant_or_self
* ancestor_or_self
* following-sibling
* following
* preceding-sibling
* preceding
* attribute

`XSL-T` permet de définir des regles de transformation qui seront appliquées par un moteur de regles.  
Une regle est definie par un chemin dans le flux d'entré qui permet la selection d'un ensemble de noeuds et d'une sequence d'actions à effectuer.  
