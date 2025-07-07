package fr.tableaux;

import java.util.Arrays;

public class ExerciceTTableauChaines {
    public static void main(String[] args) {
        String[] tableauString = {"Paris","Porto","Monaco","Nantes","Marseille"};
        Arrays.stream(tableauString).forEach(System.out::println);
        System.out.println("Longueur tableau :" + tableauString.length);
        tableauString[3] = "Reims";
        Arrays.stream(tableauString).forEach(System.out::println);
    }
}
