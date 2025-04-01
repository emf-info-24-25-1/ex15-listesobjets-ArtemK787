package services;

import models.Personne;

public class ListePersonne_Dynamique {

    private Personne[] personnes;

    public ListePersonne_Dynamique() {

        // Taille initialie du tableau est 0

        this.personnes = new Personne[0];
    }

    public int getNombre() {

        // Return la taille du tableau

        return this.personnes.length;
    }

    public void vider() {

        // Vider le tableau en mettant la taille à 0

        this.personnes = new Personne[0];
    }

    public boolean ajouter(Personne p) {

        // Variable de vérification

        boolean ajoutReussi = false;

        // Mettre les anciennes valeurs dans le nouveau tableau

        Personne[] listeAjout = new Personne[this.personnes.length + 1];
        for (int i = 0; i < this.personnes.length; i++) {
            listeAjout[i] = this.personnes[i];
        }

        // Remplacer les cellules vides de nouveau tableau par la variable

        listeAjout[listeAjout.length - 1] = p;

        // Remplacer le tableau en paramètre par celui qui a supprimé la variable

        this.personnes = listeAjout;
        ajoutReussi = true;
        return ajoutReussi;
    }

    public boolean supprimer(Personne p) {

        // Variable de vérification

        boolean suppressionReussie = false;
        int trouveIndex = -1;

        // Trouver index à supprimer

        for (int i = 0; i < this.personnes.length; i++) {
            if (this.personnes[i] == p) {
                trouveIndex = i;
                break;
            }
        }

        // Vérifier que trouveIndex != -1 (valeur intiale) pour procéder à la suppresion

        if (trouveIndex != -1) {

            // Diminuer la taille de tableau par rapport à l'élément supprimé

            Personne[] listeSupprime = new Personne[this.personnes.length - 1];

            // Copier les éléments restants dans le nouveau tableau

            for (int i = 0, j = 0; i < this.personnes.length; i++) {
                if (i != trouveIndex) {
                    listeSupprime[j] = this.personnes[i];
                    j++;
                }
            }

            // Remplacer ancient tableau par le nouveau

            this.personnes = listeSupprime;

            suppressionReussie = true;

        }

        return suppressionReussie;
    }

    public void afficher() {

        if (this.personnes.length != 0) {
            System.out.println("Liste de personnes :");
            for (int i = 0; i < this.personnes.length; i++) {

                // i + 1 pour afficher les index à partir de 1

                System.out.println((i + 1) + ". " + this.personnes[i]);
            }
            System.out.println("La taille du tableau : " + this.personnes.length);
        } else {
            System.out.println("La liste est vide");
        }
    }

}
