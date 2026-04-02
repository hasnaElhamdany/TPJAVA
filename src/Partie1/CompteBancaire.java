package Partie1;
public class CompteBancaire {

    
    private int numero;
    private String titulaire;
    private double solde;
    private double decouvertAutorise;

  
    private static int nbComptes = 0;
    private static double tauxInteret = 0.03;

    
    public CompteBancaire() {
        nbComptes++;
        this.numero = nbComptes;
        this.titulaire = "Inconnu";
        this.solde = 0;
        this.decouvertAutorise = 0;
    }

    
    public CompteBancaire(String titulaire, double solde, double decouvertAutorise) {
        nbComptes++;
        this.numero = nbComptes;
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvertAutorise = decouvertAutorise;
    }

    
    public int getNumero() {
        return numero;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public double getDecouvertAutorise() {
        return decouvertAutorise;
    }

    public static int getNbComptes() {
        return nbComptes;
    }

    public static double getTauxInteretAnnuel() {
        return tauxInteret;
    }

  
    public void setTitulaire(String titulaire) {
        if (titulaire != null && !titulaire.isEmpty()) {
            this.titulaire = titulaire;
        }
    }

    public void setDecouvertAutorise(double decouvertAutorise) {
        if (decouvertAutorise >= 0) {
            this.decouvertAutorise = decouvertAutorise;
        }
    }

    public static void setTauxInteretAnnuel(double taux) {
        if (taux > 0) {
            tauxInteret = taux;
        }
    }

    
    public void afficher() {
        System.out.println("Numero: " + numero);
        System.out.println("Titulaire: " + titulaire);
        System.out.println("Solde: " + solde);
        System.out.println("Decouvert autorise: " + decouvertAutorise);
        System.out.println("-----------------------");
    }

    
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
        } else {
            System.out.println("Montant invalide");
        }
    }

    
    public void retirer(double montant) {
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            solde -= montant;
            System.out.println("Retrait autorise");
        } else {
            System.out.println("Retrait refuse");
        }
    }

    
    public void virementVers(CompteBancaire autre, double montant) {
        if (montant > 0 && solde - montant >= -decouvertAutorise) {
            this.solde -= montant;
            autre.solde += montant;
            System.out.println("Virement effectue");
        } else {
            System.out.println("Virement impossible");
        }
    }

   
    public double calculerSoldeAvecInteret() {
        solde = solde + solde * tauxInteret;
        return solde;
    }

    public double calculerSoldeAvecInteret(double bonus) {
        solde = solde + solde * (tauxInteret + bonus);
        return solde;
    }
}
	     