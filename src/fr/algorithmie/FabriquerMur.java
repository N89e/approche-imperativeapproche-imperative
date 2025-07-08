package fr.algorithmie;

import java.util.Scanner;

public class FabriquerMur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nombre de brique de lg 1m  : ");
        int nbSmall = scanner.nextInt();
        System.out.print("Entrez le nombre de brique de lg 5m  : ");
        int nbBig = scanner.nextInt();
        System.out.print("Entrez la longueur du mur souhaité : ");
        int longueur = scanner.nextInt();

        if (checkLongueur(nbSmall, nbBig, longueur)) {
            System.out.println("Il est possible de réaliser le mur demandé avec une longueur de " + longueur + "m avec les briques que vous avez " + nbSmall + " de 1m et " + nbBig + " de 5m");
        } else {
            System.out.println("Votre mur ne peux pas être réalisé avec les briques que vous disposé");
        }

    }
    static boolean checkLongueur(int nbSmall, int nbBig, int longueur) {
        float result = longueur/((nbSmall*1)+(nbBig*5));
        if (result <= 1) return true;
        return false;
    }

}
