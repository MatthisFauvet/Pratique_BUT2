# TP 1

## Partie BD

### Tables
_PaysFA_
| Type | Nom |
|:---- | ---: | 
|INTEGER|idPays|
|VARCHAR(20)|nomPays|

___

_VoteFA_
| Type | Nom |
|:---- | ---: | 
|INTEGER|idVote|
|INTEGER|competiteur|
|INTEGER|votant|
|INTEGER|pointsVote|

### Requête SQL


#### Creation des tables

> [!WARNING]
> N'ayant pas respecter certaines consignes de bases lors de la création de mon côté, il n'est pas impossible qu'il faille, de votre côté, modifier les requêtes dans les différentes class en Java. Ce pourrait être simplement des majuscules à supprimer.  

```SQL
CREATE TABLE PaysFa (
    idPays INTEGER NOT NULL,
    nomPays VARCHAR(20) NOT NULL,
    PRIMARY KEY (idPays)
);
```

``` sql
CREATE TABLE VoteFa (
    idVote INTEGER NOT NULL,
    competiteur INTEGER NOT NULL,
    votant INTEGER NOT NULL,
    PRIMARY KEY (idVote),
    FOREIGN KEY (competiteur) REFERENCES PaysFa(idPays),
    FOREIGN KEY (votant) REFERENCES PaysFa(idPays)
);
```

_PaysFa_


#### Remplissage des tables

_PaysFa_
```sql
INSERT INTO PaysFa(nomPays) VALUES ("Pays-Bas"), ("Italie"), ("Russie");
```

_VoteFa_
```SQL
INSERT INTO VoteFa(competiteur, votant, pointsVote) VALUES (1,2,5), (1,3,5), (2,1,16), (2,3,1), (3,1,5), (3,2,8);
```

