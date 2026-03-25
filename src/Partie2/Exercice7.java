package Partie2;

import java.util.Scanner;

public class Exercice7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[10];

        for (int i = 0; i < 10; i++) {
            tab[i] = sc.nextInt();
        }

        int max = tab[0];

        for (int i = 1; i < 10; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        System.out.println("Le maximum est : " + max);
        sc.close();
    }
}
