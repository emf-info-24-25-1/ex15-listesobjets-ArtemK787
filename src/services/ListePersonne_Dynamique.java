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

        // variables de vérification

        boolean suppresionReussi = false;
        int indexSuppresion = -1;

        // vide la cellule concernée

        for (int i = 0; i < this.personnes.length; i++) {
            if (this.personnes[i] == p) {
                indexSuppresion = i;
                suppresionReussi = true;
                break;
            }
        }

        // diminuer la taille du tableau

        Personne[] listeSupprime = new Personne[this.personnes.length - 1];

        // copier les éléments sauf la valeur supprimée

        int j = 0;
        for (int i = 0; i < this.personnes.length; i++) {
            if (i != indexSuppresion) {
                listeSupprime[j] = this.personnes[i];
                j++;
            }
        }

        // remplacer l'ancient tableau par le nouveau

        this.personnes = listeSupprime;
        return suppresionReussi;

    }

    public void afficher() {
        // A faire !
    }
}
