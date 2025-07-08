import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un nombre entier positif : ");
        int n = scanner.nextInt();

        int somme = 0;
        for (int i = 1; i <= n; i++) {
            somme += i;
        }

        System.out.println("La somme des entiers de 1 à " + n + " est : " + somme);
    }
}
