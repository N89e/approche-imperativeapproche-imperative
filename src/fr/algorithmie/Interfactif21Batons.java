package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

/**
 * Créer une classe Interfactif21Batons
 * Le jeu est simple mais la réalisation est plus délicate. Vous allez jouer contre l’ordinateur.
 * Le jeu démarre avec un total de 21 bâtons.
 * Celui qui joue en 1er, joueur ou ordinateur, est tiré aléatoirement.
 * A tour de rôle, l’ordinateur et le joueur doivent prendre entre 1 et 3 bâtons.
 * Celui qui prend le dernier bâton a perdu.
 * Dans ce TP vous allez devoir imaginer vous-même le mécanisme à mettre en place, sur la base de ce que vous avez vu précédemment.
 * */

public class Interfactif21Batons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // Pour choisir au hasard qui commence
        int batons = 21;

        // On choisit au hasard qui commence
        boolean joueurCommence = random.nextBoolean();
        //Consignes et régles de jeu
        System.out.println("Bienvenue dans le jeu des 21 bâtons !");
        System.out.println("Celui qui prend le dernier bâton a perdu.");
        System.out.println("Il y a 21 bâtons au départ.");

        if (joueurCommence) {
            System.out.println("Tu commences !");
        } else {
            System.out.println("L'ordinateur commence !");
        }

        // Le jeu continue tant qu'il reste des bâtons
        while (batons > 0) {
            if (joueurCommence) {
                // Tour du joueur
                int prise = 0;
                // On demande au joueur combien de bâtons il veut prendre
                do {
                    System.out.print("Combien de bâtons veux-tu prendre ? (1, 2 ou 3) : ");
                    prise = scanner.nextInt();
                } while (prise < 1 || prise > 3 || prise > batons); // On vérifie que le nombre est correct

                batons = batons - prise; // On enlève les bâtons pris
                System.out.println("Il reste " + batons + " bâton(s).");

                if (batons == 0) {
                    System.out.println("Tu as pris le dernier bâton... Tu as perdu !");
                    break; // Fin du jeu
                }
            } else {
                // Tour de l'ordinateur
                int priseOrdi;
                // L'ordinateur prend un nombre au hasard entre 1 et 3, mais pas plus que le nombre restant
                if (batons >= 3) {
                    priseOrdi = random.nextInt(3) + 1; // 1, 2 ou 3
                } else {
                    priseOrdi = random.nextInt(batons) + 1; // 1 jusqu'à batons
                }
                System.out.println("L'ordinateur prend " + priseOrdi + " bâton(s).");
                batons = batons - priseOrdi;
                System.out.println("Il reste " + batons + " bâton(s).");

                if (batons == 0) {
                    System.out.println("L'ordinateur a pris le dernier bâton... Tu as gagné !");
                    break;
                }
            }
            // On change de joueur pour le prochain tour
            joueurCommence = !joueurCommence;
        }
        scanner.close();
    }
}
