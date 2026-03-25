package Partie1;

import java.util.Scanner;

public class Exercice3 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("écrire un nombre");
			int nombre = sc.nextInt();
			for(int i=1; i<11; i++) {
				System.out.println(nombre+ "*"+ i +"="+(nombre*i));
				
				
				
			}
			
	  sc.close();
			
		}
	}

