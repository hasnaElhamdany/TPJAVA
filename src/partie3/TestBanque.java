package partie3;
import Partie1.CompteBancaire;
import partie2.Banque;

public class TestBanque {

    public static void main(String[] args) {

        
        Banque b = new Banque("Banque Populaire", 5);

       
        CompteBancaire c1 = new CompteBancaire("Hasna", 1000, 500);
        CompteBancaire c2 = new CompteBancaire("Sara", 2000, 300);
        CompteBancaire c3 = new CompteBancaire("Ali", 1500, 400);

        
        b.ajouterCompte(c1);
        b.ajouterCompte(c2);
        b.ajouterCompte(c3);

        
        c1.deposer(500);
        c2.retirer(1000);
        c1.virementVers(c3, 300);

        
        b.afficherTous();

       
        System.out.println("Nombre total comptes: " + CompteBancaire.getNbComptes());
        System.out.println("Taux interet: " + CompteBancaire.getTauxInteretAnnuel());
    }
}

