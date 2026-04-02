package partie2;
import Partie1.CompteBancaire;
public class Banque {

    private String nom;
    private CompteBancaire[] comptes;
    private int nbActuels;

   
    public Banque(String nom, int capaciteMax) {
        this.nom = nom;
        comptes = new CompteBancaire[capaciteMax];
        nbActuels = 0;
    }

    
    public void ajouterCompte(CompteBancaire c) {
        if (nbActuels < comptes.length) {
            comptes[nbActuels] = c;
            nbActuels++;
            System.out.println("Compte ajoute");
        } else {
            System.out.println("Banque pleine");
        }
    }

    
    public void afficherTous() {
        System.out.println("Banque: " + nom);
        for (int i = 0; i < nbActuels; i++) {
            comptes[i].afficher();
        }
    }
   
}


