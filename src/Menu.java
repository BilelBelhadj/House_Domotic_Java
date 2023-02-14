import java.util.*;

public class Menu {
    static void Menu(){
        Scanner sc = new Scanner(System.in); 
        
        int choix = 0;
        boolean test = true;
        while(test == true){

            //choix disponibles
            System.out.println("***** Choisir l'action que vous desirez***** ");
            System.out.println ("1- Afficher les donnees.");
            System.out.println ("2- Inserer un ligne.");
            System.out.println ("3- Supprimer un ligne.");
            System.out.println ("4- Modifier un ligne.");
            System.out.println ("5- Afficher le nombre d'element.");
            System.out.println ("6- Afficher la moyenne des tailles.");
            System.out.println ("7- Fermer le programme.");

            choix = sc.nextInt();

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
                    
                    break;
            } 
        }
    }
}


