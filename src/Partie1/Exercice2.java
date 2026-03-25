package Partie1;

import java.util.Scanner;

public class Exercice2 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("écrire premeir nombre");
		 int n = sc.nextInt();
		 System.out.println("écrire deuxième nombre");
		 int r = sc.nextInt();
		 System.out.println("écrire troisième nombre");
		 int c = sc.nextInt();
		 int max=n;
		 if(r>max) {
			 max=r;
		 }
		 if(c>max) {
			 max=c;
		 }
		 System.out.println(max);
		 sc.close();
		 
	}
}
