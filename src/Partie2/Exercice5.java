package Partie2;

import java.util.Scanner;

public class Exercice5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Donner la taille N : ");
        int N = sc.nextInt();

        int[] tab = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Element " + i + " : ");
            tab[i] = sc.nextInt();
        }

        System.out.println("Les éléments sont :");
        for (int i = 0; i < N; i++) {
            System.out.println(tab[i]);
        }
        sc.close();
    }
}

