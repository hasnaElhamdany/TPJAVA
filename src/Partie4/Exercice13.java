package Partie4;

import java.util.Scanner;

public class Exercice13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saisir une chaîne : ");
        String ch = sc.nextLine();

        String inv = "";

        for (int i = ch.length() - 1; i >= 0; i--) {
            inv += ch.charAt(i);
        }

        System.out.println("Chaîne inversée = " + inv);
        sc.close();
    }
}
