package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {
        /* Racourci clavier pour System.out.printIn → sout */
        String a = "Bonjour";
        System.out.println(a);
        byte b = 10;
        short c = 20;
        int d = 30;
        long e = 40L;
        float f = 1.56f;
        double g = 1.665;
        char h = '\u09a3';
        boolean i = true;
        System.out.println("byte :" + b);
        System.out.println("short :" + c);
        System.out.println("int :" + d);
        System.out.println("long :" + e);
        System.out.println("float :" + f);
        System.out.println("double :" + b);
        String randomString = "Voici le résultat d’un calcul : 1+5=6";
        System.out.println(randomString);
    }
}
