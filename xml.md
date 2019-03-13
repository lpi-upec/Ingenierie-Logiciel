# HTML/XML

2 dérivés du SGML(langage à balise=meta langage(tags,markup))

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
