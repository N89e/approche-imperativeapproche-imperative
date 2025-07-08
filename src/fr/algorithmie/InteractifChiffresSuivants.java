package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = scanner.nextInt();
        for (int i = n; i < (n + 11) ; i++) {
            System.out.println(i);
        }
    }
}
