package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner scan = new Scanner(System.in);

    public static void jeu() {

        int nb = (int) (Math.random() * 101);

        // Choix de l'utilisateur ( nombre entre 1 et 100 )
        for(int i = 0; i<10; i++) {
            System.out.println("Choisir un nombre entre 1 et 100 : ");
            Scanner scan = new Scanner(System.in);
            int userchoice = scan.nextInt();

            if (userchoice == nb ) {
                System.out.println("Vous avez trouvé le bon nombre");
                break;
            } else if ( userchoice > nb) {
                System.out.println("Le nombre à trouver est plus petit");
            } else if (userchoice < nb) {
                System.out.println("Le nombre a trouver est plus grand");
            }
        }

    }



}