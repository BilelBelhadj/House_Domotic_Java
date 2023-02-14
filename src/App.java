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

        int choixAct = 0;
        int choixArea = 0;

        boolean test = true;
        while(test == true){

            //choixAct disponibles
            System.out.println("***** Choisir l'action que vous desirez***** ");
            System.out.println ("1- Activee/desactivee l'irrigation dans le jardin.");
            System.out.println ("2- Activee/desactivee Lumiere.");
            System.out.println ("3- Activee/desactivee fenetre.");
            System.out.println ("4- Activee/desactivee porte.");
            System.out.println ("5- Afficher l'etat d'une piece.");
            System.out.println ("6- Fermer le programme.");
            
            try {
                choixAct = sc.nextInt();
            } finally {
                if (choixAct < 1 || choixAct > 6){
                    throw new Myexeption("choix d'action doit etre entre 1 et  6 SVP! ");
                
                }else {System.out.println("choix action valide");}
            }

            //trairement du choixAct
            switch(choixAct){
                case 1:

                    if(jardin.getIrrigation() == true){
                        jardin.setIrrigation(false);
                    }else{
                        jardin.setIrrigation(true);
                    }
                    break;

                case 2:
                    System.out.println ("2- Activee/desactivee Lumiere de |1-Chambre 1  |2-Chambre 2 |3-Garage  |4- Cuisine.");
                    choixArea = sc.nextInt();
                    if(choixArea == 1){

                        if(chambre1.getLight() == true){
                            chambre1.setLight(false);
                        }else{
                            chambre1.setLight(true);
                        }
                    }
                    if(choixArea == 2){
                        if(chambre2.getLight() == true){
                            chambre2.setLight(false);
                        }else{
                            chambre2.setLight(true);
                        }
                    }
                    if(choixArea == 3){
                        if(Garage1.getLight() == true){
                            Garage1.setLight(false);
                        }else{
                            Garage1.setLight(true);
                        }
                    }
                    if(choixArea == 4){
                        if(kitchen.getLight() == true){
                            kitchen.setLight(false);
                        }else{
                            kitchen.setLight(true);
                        }
                    }
                    break;

                case 3:
                System.out.println ("2- Activee/desactivee Lumiere de |1-Chambre 1  |2-Chambre 2 |3-Garage  |4- Cuisine.");
                choixArea = sc.nextInt();
                if(choixArea == 1){

                    if(chambre1.getLight() == true){
                        chambre1.setLight(false);
                    }else{
                        chambre1.setLight(true);
                    }
                }
                if(choixArea == 2){
                    if(chambre2.getLight() == true){
                        chambre2.setLight(false);
                    }else{
                        chambre2.setLight(true);
                    }
                }
                if(choixArea == 3){
                    if(Garage1.getLight() == true){
                        Garage1.setLight(false);
                    }else{
                        Garage1.setLight(true);
                    }
                }
                if(choixArea == 4){
                    if(kitchen.getLight() == true){
                        kitchen.setLight(false);
                    }else{
                        kitchen.setLight(true);
                    }
                }
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

