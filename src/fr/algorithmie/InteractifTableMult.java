package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un nombre : ");
            n = scanner.nextInt();
            if (n < 1 || n > 10) {
                System.out.println("Essai une autre fois");
            }
        } while (n < 1 || n > 10);
        System.out.println("Bravo votre numéro est compris entre 1 et 10");
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            count ++;
            System.out.println(n + "x" + count + "=" + (n*count));
        }
    }
}
