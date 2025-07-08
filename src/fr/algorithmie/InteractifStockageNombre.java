package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Création d'un tableau de taille 5 pour stocker les nombres
        int[] nombres = new int[5];
        int nombreDeNombres = 0;
        while (true) {
            //Menu
            System.out.println("Menu :");
            System.out.println("1 : Ajouter un nombre");
            System.out.println("2 : Afficher les nombres ajoutés");
            System.out.println("3 : Quitter");
            System.out.print("Votre choix : ");

            int choix = scanner.nextInt();

            if (choix == 1) {
                if (nombreDeNombres == nombres.length) {
                    int[] nouveauTableau = new int[nombres.length * 2];
                    for (int i = 0; i < nombres.length; i++) {
                        nouveauTableau[i] = nombres[i];
                    }
                    System.out.println("Le tableau a été agrandi !");
                    nombres = nouveauTableau;
                }
                System.out.print("Entrez un nombre à ajouter : ");
                int nouveau = scanner.nextInt();
                nombres[nombreDeNombres] = nouveau;
                nombreDeNombres++;
            } else if (choix == 2) {
                if (nombreDeNombres == 0) {
                    System.out.println("Pas de nombres enregistrés !");
                } else {
                    System.out.println("Voici les nombres enregistrés : ");
                    for (int i = 0; i < nombreDeNombres; i++) {
                        System.out.println(nombres[i]);
                    }
                }
            } else if (choix == 3) {
                System.out.println("Programme terminé. Merci !");
                break;
            } else {
                System.out.println("Choix invalide, veuillez recommencer.");
            }
        }
        scanner.close();

    }
}