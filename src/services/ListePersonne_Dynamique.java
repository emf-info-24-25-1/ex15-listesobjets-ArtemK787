package services;

import models.Personne;

public class ListePersonne_Dynamique {

    private Personne[] personnes;

    public ListePersonne_Dynamique() {

        // taille initialie du tableau est 0

        this.personnes = new Personne[0];
    }

    public int getNombre() {

        // return la taille du tableau

        return this.personnes.length;
    }

    public void vider() {

        // vider le tableau en mettant la taille à 0

        this.personnes = new Personne[0];
    }

    public boolean ajouter(Personne p) {

        // variable de vérification

        boolean ajoutReussi = false;

        // mettre les anciennes valeurs dans le nouveau tableau

        Personne[] listeAjout = new Personne[this.personnes.length + 1];
        for (int i = 0; i < this.personnes.length; i++) {
            listeAjout[i] = this.personnes[i];
        }

        // remplacer les cellules vides de nouveau tableau par la variable

        listeAjout[listeAjout.length - 1] = p;

        // remplacer le tableau en paramètre par celui qui a supprimé la variable

        this.personnes = listeAjout;
        ajoutReussi = true;
        return ajoutReussi;
    }

    public boolean supprimer(Personne p) {
        // Variable de vérification
        boolean suppressionReussie = false;
        int pos = -1;

        // Trouver index à supprimer
        for (int i = 0; i < this.personnes.length; i++) {
            if (this.personnes[i] == p) {
                pos = i;
                suppressionReussie = true;
                break;
            }
        }

        // Si l'élément n'a pas été trouvé, retourner false
        if (pos == -1) {
            return false;
        }

        // Diminuer la taille de tableau par rapport à l'élément supprimé
        Personne[] listeSupprime = new Personne[this.personnes.length - 1];

        // Copier les éléments restants dans le nouveau tableau
        for (int i = 0, j = 0; i < this.personnes.length; i++) {
            if (i != pos) {
                listeSupprime[j] = this.personnes[i];
                j++;
            }
        }

        // Remplacer ancient tableau par le nouveau
        this.personnes = listeSupprime;

        return suppressionReussie;
    }

    public void afficher() {

        if (this.personnes.length == 0) {
            System.out.println("La liste est vide.");
            for (int i = 0; i < this.personnes.length; i++) {
                System.out.println(this.personnes[i]);
            }
            System.out.println("La taille du tableau : " + this.personnes.length);

        } else {

            System.out.println("Liste des personnes :");
            for (int i = 0; i < this.personnes.length; i++) {
                System.out.println((i + 1) + ". " + this.personnes[i]);
            }
            System.out.println("La taille du tableau : " + this.personnes.length);
        }
    }

}
