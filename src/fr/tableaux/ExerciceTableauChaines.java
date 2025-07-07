package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] tableauString = {"Paris", "Porto", "Monaco", "Nantes", "Marseille"};
        for (String s : tableauString) {
            System.out.println("Ville :" + s);
        }
        ;
        System.out.println("Longueur tableau :" + tableauString.length);
        tableauString[3] = "Reims";
        Arrays.stream(tableauString).forEach(System.out::println);
    }
}
