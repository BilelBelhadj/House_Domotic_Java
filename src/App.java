/*
    Auteur      : Bilel Belhadj
    Description : Projet de simulation d'une maison domotique  
    Date        : 11-02-2023
    Version     : 0.0.1
*/

import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {

        //declaration du scanner
        Scanner sc = new Scanner(System.in); 

        //declaration des objets
        //declaration des garages
        Garage Garage1 = new Garage("Garage", false, false, false);


        //declarations des chambre
        Room chambre1 = new Room("Salon", false, false, false);
        Room chambre2 = new Room("Bedroom", false, false, false);
        Room kitchen  = new Room("Cuisine", false, false, false);

        //declaration du jardin
        Garden jardin =  new Garden(false);

        Garage1.description("Garage du materriel et voiture");
        chambre1.description("Salon avec un TV");
        Garage1.description("Chambre pour dormir");
        Garage1.description("Cuisine avec un TV");

        int choix = 0;

        boolean test = true;
        while(test == true){

            //choix disponibles
            System.out.println("***** Choisir l'action que vous desirez***** ");
            System.out.println ("1- Manipuler l'irrigation dans le jardin.");
            System.out.println ("2- Manipuler chambre1.");
            System.out.println ("3- Manipuler chambre2.");
            System.out.println ("4- Manipuler  la cuisine.");
            System.out.println ("5- Manipuler le garage.");
            System.out.println ("6- Afficher l'etat d'une piece.");
            System.out.println ("7- Fermer le programme.");
            
            try {
                choix = sc.nextInt();
            } finally {
                if (choix < 1 || choix > 7){
                    throw new Myexeption("Choix doit etre entre 1 et  7 SVP! ");
                
                }else {System.out.println("Choix valide");}
            }

            //trairement du choix
            switch(choix){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Thanks for your time");
                    test = false;
                    break;
            } 
        
    }
  
    }
}

