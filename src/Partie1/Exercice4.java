package Partie1;

import java.util.Scanner;

public class Exercice4 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("entrer un nombre");
		 int x = sc.nextInt();
		 int i = 1;
		 int som = 0;
		 while(i<=x) {
			 som = som+i;
			 i++;
		 }
		 System.out.println(som);
	
	sc.close();
}
    }
