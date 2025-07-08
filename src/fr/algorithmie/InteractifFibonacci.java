package fr.algorithmie;

import java.util.Scanner;
/**
 * Créer une classe InteractifFibonacci
 * La suite de Fibonacci est une suite qui commence par 0 et 1 et dans laquelle le nombre de rang N est égal à la somme des nombres de rangs N-1 et N-2
 * Créer une classe TestFibonacci (J'ai créer une méthode static à la place de la classe)
 * Demander à l’utilisateur de choisir un rang N
 * Ecrire un algorithme qui calcule et affiche le nombre de rang N
 * */
public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre : ");
        int n = scanner.nextInt();

        int resultat = fibonacci(n);
        System.out.println("Le nombre de rang " + n + " dans la suite de Fibonacci est : " + resultat);

        scanner.close();
    }

    // Méthode statique pour calculer le Fibonacci de rang n ( pour limiter le nb de fichier)
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0;
        int b = 1;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}
