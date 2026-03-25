package Partie4;

import java.util.Scanner;

public class Exercice12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saisir une chaîne : ");
        String ch = sc.nextLine();

        int count = 0;

        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);

            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
                c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                count++;
            }
        }

        System.out.println("Nombre de voyelles = " + count);
        sc.close();
    }
}
