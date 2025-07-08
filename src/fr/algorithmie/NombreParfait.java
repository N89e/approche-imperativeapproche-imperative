import java.util.Scanner;

public class NombreParfait {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int n = scanner.nextInt();

        if (estParfait(n)) {
            System.out.println(n + " est un nombre parfait.");
        } else {
            System.out.println(n + " n'est pas un nombre parfait.");
        }
    }

    // Méthode pour vérifier si un nombre est parfait
    public static boolean estParfait(int n) {
        if (n <= 1) return false; // Les nombres parfaits sont strictement supérieurs à 1
        int somme = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                somme += i;
            }
        }
        return somme == n;
    }
}
