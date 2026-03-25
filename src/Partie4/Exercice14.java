package Partie4;

import java.util.Scanner;

public class Exercice14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saisir une chaîne : ");
        String ch = sc.nextLine();

        String inv = "";

        for (int i = ch.length() - 1; i >= 0; i--) {
            inv += ch.charAt(i);
        }

        if (ch.equals(inv)) {
            System.out.println("C'est un palindrome");
        } else {
            System.out.println("Ce n'est pas un palindrome");
        }
        sc.close();
    }
		  
	  }

