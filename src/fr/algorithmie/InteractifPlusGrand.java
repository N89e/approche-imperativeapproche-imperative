package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Entrez un nombre entier : ");
            int n = scanner.nextInt();
            array[i] = n;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Valeur max de votre saisi : " + max);
    }
}
