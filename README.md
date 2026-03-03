# Programmation Orientée Objet Java 2025

Ce dépôt contient une proposition de solution pour les exercices de POO Java suivants :
- Exercice 1 : Héritage et redéfinition (`Personne`, `Adherent`, `Auteur`, `Livre`)
- Exercice 3 : Héritage et polymorphisme (`Vehicule`, `Voiture`, `Moto`, `Avion`)
- Exercice 4 : Classes abstraites (`Employe`, `Ingenieur`, `Manager`)
- Exercice 5 : Classes abstraites (`Figure`, `Cercle`, `Rectangle`, `Triangle`)
- Exercice 6 : Interfaces (`Empruntable`, `Livre`, `DVD`)
- Exercice 7 : Polymorphisme (`Paiement`, `CarteCredit`, `PayPal`, `Commande`)

## Structure

```text
src/
  exercice1/
  exercice3/
  exercice4/
  exercice5/
  exercice6/
  exercice7/
```

## Compilation

Depuis la racine du projet :

```bash
javac -d out $(find src -name "*.java")
```

## Exécution

Exemples :

```bash
java -cp out exercice1.GestionBibliothequeEx1
java -cp out exercice3.GestionVehiculesApp
java -cp out exercice4.GestionEmployesApp
java -cp out exercice5.GestionFiguresApp
java -cp out exercice6.GestionBibliotheque
java -cp out exercice7.GestionPaiementApp
```

## Mise sur GitHub

1. Crée un nouveau repository sur GitHub.
2. Ajoute ce dossier dans ton repo local.
3. Lance les commandes suivantes :

```bash
git init
git add .
git commit -m "Ajout des solutions POO Java"
git branch -M main
git remote add origin <URL_DE_TON_REPO>
git push -u origin main
```
