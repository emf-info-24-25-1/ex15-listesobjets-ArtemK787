package app;

import models.Personne;
import services.ListePersonne_Dynamique;


public class Application {

    /*
     * Exercice d'entraînement et de compréhension sur ces 3 façons de gérer des
     * tableaux d'objets : dynamiquement, sans trous et avec trous.
     * 
     * - Faire l'exercice en 3 groupes, chacun réalisant l'une des 3 classes
     * représentant une liste de personnes.
     */
    public static void main(String[] args) throws Exception {

        Personne p1 = new Personne("Terrieur", "Alain");
        Personne p2 = new Personne("Terrieur", "Alex");
        Personne p3 = new Personne("d'Oeuf", "John");
        Personne p4 = new Personne("Haroni", "Mac");
        Personne p5 = new Personne("Kollyck", "Al");
        Personne p6 = new Personne("Bambelle", "Larry");
        Personne p7 = new Personne("Kan", "Jerry");
        Personne p8 = new Personne("Gale", "Martin");
        Personne p9 = new Personne("Aroide", "Paul");
        Personne p10 = new Personne("Proviste", "Alain");
        Personne p11 = new Personne("Mensoif", "Gérard");
        Personne p12 = new Personne("Tim", "Vic");
        Personne p13 = new Personne("Covert", "Harry");

        Personne[] personnes = new Personne[] { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13 };

        ListePersonne_Dynamique listeDynamique = new ListePersonne_Dynamique();

        for (int i = 0; i < personnes.length; i++) {
            listeDynamique.ajouter(personnes[i]);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("ListePersonne_Dynamique");
        System.out.println("----------------------------------------------------");
        System.out.println("Nombre de personnes : " + listeDynamique.getNombre());
        listeDynamique.afficher();
        listeDynamique.vider();
        System.out.println("Nombre de personnes : " + listeDynamique.getNombre());

    }
}
