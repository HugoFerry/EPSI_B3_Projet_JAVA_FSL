# Application FSL

Application permettant de voir différentes statistiques sur les saisons de ligue 1 de football français depuis 2002.

[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com)  [![forthebadge](https://forthebadge.com/images/badges/made-with-java.svg)](http://forthebadge.com)

## Description

Nous sommes une équipe de trois développeurs en étude de troisième année au sein de EPSI Bordeaux.
Ce projet a vu le jour grâce à une évaluation d'intégration Java demandée par notre professeur de Java.

Notre application permet à toute personne qui l'utilise, de voir certaines statistiques à propos des saisons de ligue 1 de football français depuis 2002.
Par exemple, le club qui a le plus gagné de ligue 1 ou bien encore celui qui possède le plus de point.

Nous avons choisi Java comme langage de programmation, car nous avons beaucoup travaillé avec dans différents projets, mais aussi qu'il était obligatoire pour ce projet.

Des améliorations pourront arriver plus tard si nous trouvons que ce projet vaut le coup de l'améliorer.
Nous avons déjà pensé à certaines améliorations, comme augmenter la période, les différents championnats, mais aussi à l'interface utilisateur.

# Table des matières

1. [Application FSL](#application-fsl)
2. [Description](#description)
3. [Pour commencer](#pour-commencer)
4. [Pré-requis](#pr-requis)
5. [Installation et Démarrage](#installation-et-dmarrage)
6. [Hooks](#hooks)
7. [Tests](#tests)
8. [Fabriqué avec](#fabriqu-avec)
9. [Versions](#versions)
10. [Auteurs](#auteurs)
11. [License](#license)

## Pour commencer

### Pré-requis

- Avoir un IDE adapté à Java.
- Avoir les différents packages nécessaires, sinon les installer après avoir ouvert le projet.

### Installation et Démarrage`

Cloner le dossier avec ``git clone https://github.com/HugoFerry/EPSI_B3_Projet_JAVA_FSL.git``. \
Ouvrez le dossier cloné sur votre IDE préféré de java. \
Installer les différents packages s'il vous en manque.

Se rendre sur le fichier ``Main.java`` en suivant le chemin suivant :
``EPSI_B3_Projet_JAVA_FSL-DEV\src\main\java\projet`` \
Lancer le fichier ``Main.java`` via votre IDE.

Si vous avez réussit, votre terminal IDE affichera ceci :

```
-------------------------------------------------------
-        Welcome to Ligue1 Stats (2002 - 2022)        -
-------------------------------------------------------

Choose a number that you want to know about

<MENU>-----------------------------------------
| 1. All Clubs List in Ligue1 for 2002 - 2022 |
| 2. All Stats                                |
| 3. Specific Club Stat                       |
| 4. Specific Club Stat in Specific Season    |
| 5. The Highest Points                       |
| 6. The Least Lost Club                      |
| 7. The Most Won Club                        |
-----------------------------------------------
```
Choisir l'option que vous voulez parmis celles proposées afin de voir les statistiques qui en ressortent.

Exemple :

```
-> 3
Type the Club name that you want (Lyon, Monaco, Bordeaux, Paris_Saint_Germain...)
-> Paris_Saint_Germain
STATS---------------------------------------------------------
In 2002-2003 season, Paris_Saint_Germain was ranked in 11. During 38 games, Paris_Saint_Germain won 14 games,12 games in draw, and 12 games lost
In 2003-2004 season, Paris_Saint_Germain was ranked in 2. During 38 games, Paris_Saint_Germain won 22 games,10 games in draw, and 6 games lost
In 2004-2005 season, Paris_Saint_Germain was ranked in 9. During 38 games, Paris_Saint_Germain won 12 games,15 games in draw, and 11 games lost
In 2005-2006 season, Paris_Saint_Germain was ranked in 9. During 38 games, Paris_Saint_Germain won 13 games,13 games in draw, and 12 games lost
In 2006-2007 season, Paris_Saint_Germain was ranked in 15. During 38 games, Paris_Saint_Germain won 12 games,12 games in draw, and 14 games lost
In 2007-2008 season, Paris_Saint_Germain was ranked in 16. During 38 games, Paris_Saint_Germain won 10 games,13 games in draw, and 15 games lost
In 2008-2009 season, Paris_Saint_Germain was ranked in 6. During 38 games, Paris_Saint_Germain won 19 games,7 games in draw, and 12 games lost
In 2009-2010 season, Paris_Saint_Germain was ranked in 13. During 38 games, Paris_Saint_Germain won 12 games,11 games in draw, and 15 games lost
In 2010-2011 season, Paris_Saint_Germain was ranked in 4. During 38 games, Paris_Saint_Germain won 15 games,15 games in draw, and 8 games lost
In 2011-2012 season, Paris_Saint_Germain was ranked in 2. During 38 games, Paris_Saint_Germain won 23 games,10 games in draw, and 5 games lost
In 2012-2013 season, Paris_Saint_Germain was ranked in 1. During 38 games, Paris_Saint_Germain won 25 games,8 games in draw, and 5 games lost
In 2013-2014 season, Paris_Saint_Germain was ranked in 1. During 38 games, Paris_Saint_Germain won 27 games,8 games in draw, and 3 games lost
In 2014-2015 season, Paris_Saint_Germain was ranked in 1. During 38 games, Paris_Saint_Germain won 24 games,11 games in draw, and 3 games lost
In 2015-2016 season, Paris_Saint_Germain was ranked in 1. During 38 games, Paris_Saint_Germain won 30 games,6 games in draw, and 2 games lost
In 2016-2017 season, Paris_Saint_Germain was ranked in 2. During 38 games, Paris_Saint_Germain won 27 games,6 games in draw, and 5 games lost
In 2017-2018 season, Paris_Saint_Germain was ranked in 1. During 38 games, Paris_Saint_Germain won 29 games,6 games in draw, and 3 games lost
In 2018-2019 season, Paris_Saint_Germain was ranked in 1. During 38 games, Paris_Saint_Germain won 29 games,4 games in draw, and 5 games lost
In 2019-2020 season, Paris_Saint_Germain was ranked in 1. During 27 games, Paris_Saint_Germain won 22 games,2 games in draw, and 3 games lost
In 2020-2021 season, Paris_Saint_Germain was ranked in 2. During 38 games, Paris_Saint_Germain won 26 games,4 games in draw, and 8 games lost
In 2021-2022 season, Paris_Saint_Germain was ranked in 1. During 38 games, Paris_Saint_Germain won 26 games,8 games in draw, and 4 games lost
--------------------------------------------------------------
-------------------
|     Summary     |
-------------------
For 20 seasons, Paris_Saint_Germain had appeared 20 times in Ligue 1
The average rank is 4.95 th
The average won games are 20.85 games
The average drawn games are 9.05 games
The average lost games are 7.55 games
-------------------------------------------------------
```

## Hooks

* Premier Hooks : description
* Deuxième Hooks : description
* Troisième Hooks : description

## Tests
### (description et comment le lancer)
* Premier test : test_All_Club_Numbers() 
* Deuxième test : test_First_Club()

## Fabriqué avec

* [Java](https://www.java.com/fr/download/) - Langage de programmation
* [Intellij IDEA](https://www.jetbrains.com/idea/) - Editeur de code Java

## Versions

* **Dernière version stable :** 0
* **Dernière version :** 0
* Liste des versions : [Cliquer pour afficher](https://github.com/HugoFerry/EPSI_B3_Projet_JAVA_FSL/tags)

## Auteurs

* **Hugo FERRY** _alias_ [@HugoFerry](https://github.com/HugoFerry)
* **Sang Min SHIM** _alias_ [@Sangmin-SHIM](https://github.com/Sangmin-SHIM)
* **Thomas LEBAS** _alias_ [@Thomas-Lebas](https://github.com/Thomas-Lebas)

Lisez la liste des [contributeurs](https://github.com/HugoFerry/EPSI_B3_Projet_JAVA_FSL/graphs/contributors) pour voir qui a aidé au projet !

## License

Ce projet est sous licence ``GPL`` - voir le fichier [LICENSE.md](LICENSE.md) pour plus d'informations
