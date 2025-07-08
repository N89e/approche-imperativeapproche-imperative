package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random() * 100) + 1;
        int n = 0;
        int attempts = 0;

        // Pour le debug, vous pouvez afficher la solution :
        // System.out.println("Solution (pour debug) : " + number);

        do {
            System.out.print("Entrez un nombre entier : ");
            n = scanner.nextInt();
            attempts++;
            if (n > number) {
                System.out.println("C'est moins !");
            } else if (n < number) {
                System.out.println("C'est plus !");
            }
        } while (n != number);

        System.out.println("Bravo vous avez trouvé le numéro : " + number + " en " + attempts + " coups");
        scanner.close();
    }
}
