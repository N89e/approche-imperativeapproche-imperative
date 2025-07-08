package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
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
    }
}
