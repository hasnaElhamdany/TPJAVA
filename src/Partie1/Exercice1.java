package Partie1;

import java.util.Scanner;

public class Exercice1 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println(" entrer un nombre");
			int nombre = sc.nextInt();
			if(nombre>0) {
				System.out.println("positif");
			}
			else if(nombre<0) {
				System.out.println("négatif");
			}
			else {
				System.out.println("nul");
			}
			sc.close();
			
			
		}
}
