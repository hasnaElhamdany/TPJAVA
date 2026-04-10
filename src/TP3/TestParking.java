package TP3;
public class TestParking {

    public static void main(String[] args) {

        Vehicule[] v = new Vehicule[4];

        v[0] = new Voiture("11A11", "Dacia", 4);
        v[1] = new Voiture("22B22", "Renault", 5);
        v[2] = new Moto("33C33", "Yamaha", true);
        v[3] = new Camion("44D44", "Volvo", 12.5);

        System.out.println("=== Tous les véhicules ===");

        for (Vehicule veh : v) {
            veh.stationner();
            veh.afficher();
            System.out.println("------------");
        }

        System.out.println("=== Les voitures seulement ===");

        for (Vehicule veh : v) {
            if (veh instanceof Voiture) {
                veh.afficher();
            }
        }

        System.out.println("=== Downcasting ===");

        Vehicule x = new Moto("11C22", "Yamaha", true);

        if (x instanceof Voiture) {
            Voiture v1 = (Voiture) x;
            System.out.println("Downcasting réussi !");
        } else {
            System.out.println("Erreur : ce n'est pas une voiture");
        }
    }
}



