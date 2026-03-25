package Partie3;

import java.util.Scanner;

public class Exercice9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][3];

        System.out.println("Saisir la matrice :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("m[" + i + "][" + j + "] = ");
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transposée :");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println();
            sc.close();
        }

	}
}
