/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projekt_1;

import static java.lang.Math.random;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nazanin.heydari
 */
public class Projekt_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in); 
        Random rand= new Random();
        String[] fiende= {"Opponent"}; 
        int maxfiendehälso = 100 ; 
        int health = 100; 
        // while loop 
        boolean running = true; 
        System.out.println("!!-----------welcome to the game-----------!!");
        System.out.println("It is text based game between you and the opponent \n You attack by pressing the enter on the keyboard \n You have recieved 100 HP");
        scan.nextLine();
        System.out.println("Enter your name ");
        String namn= scan.nextLine();
        for (String opponent: fiende){
           System.out.println(opponent +"appeard");
        }
        GAME : 
        while(running){
            int max= 100; 
            int min= 1; 
            // slumpa ett tal mellan 1-100 för att avgöra ifall det är opponents tur eller spelaren 
            int x = (int)(Math.random()*(max-min+1)+min);
            if(x>50){
                System.out.println(namn + " It is your turn to attack ");
                System.out.println("press the enter ");
                scan.nextLine();
                // slumpa ett tal för att se om en attack ska lycka eller inte 
                int attacklyckas = (int)(Math.random()*(max-min+1)+min); 
                //om slump talet är mindre än 25 attacket kommer lyckas 
                if ( attacklyckas < 25)
                {
                  int spelare = 1 + (int)(Math.random()*100);
                  int dator = 1+ (int)(Math.random()*100); 
                  // differesen mellan dator och spelare slump tal 
                  int antalhp= dator-spelare; 
                  // hälso poängen miskar med antalhp 
                  health-=antalhp;  
                  System.out.println("attack succed "+ " you have "+ health +" HP " );
                }
                else{
                    // attack lyckas inte (slumpa tal är större än 25)
                    System.out.println("attack didnt succe");
                }
                             
                if (health<30){
                  //spelaren dött
                  System.out.println("You dont have enough HP to continue!!");
                  System.out.println("opponent won ");
                  break GAME;
                }
            }
            else{
                // opponent tur 
              System.out.println("It is opponenet turn to attack!!"); 
                System.out.println("press the enter");
                scan.nextLine(); 
              int attacklyckas = (int)(Math.random()*(max-min+1)+min);
              
              if (attacklyckas<25){
                  int spelare = 1 + (int)( Math.random()*100);
                  int dator = 1 + (int) (Math.random()*100); 
                  int hp1= dator -spelare ; 
                  // opponents hälso poäng efter att attcken lyckades 
                  maxfiendehälso-=hp1 ; 
                  System.out.println("attack succed "+" opponent have "+ maxfiendehälso +" HP ");   
              }
              else {
                  // attack lyckas inte 
                  System.out.println("attack didnt sucess" );
              }
              if (maxfiendehälso<30){
                  // opponent dött
                 System.out.println("Congrats "+ namn + " you won" );
                 break GAME;
              }
            }
          /* //funkade inte och hade inte tillräcklingt mycket tid att fundera på den :(
            System.out.println("!!!-----------------------------------!!!");
          System.out.println("What would you like to do now");
          System.out.println("1.Continue playing \n 2: stop ");
          int svar= scan.nextInt(); 
          int svar1 = 1; 
          int svar2= 2;
          try{
              svar1 = scan.nextInt();
              svar2= scan.nextInt();
          }
          catch(Exception e){
              System.out.println("You need enter a number not a word");
          }
          if (svar==1){
             System.out.println("You continue playing");
            }
          else{
             System.out.println("You stoped the game ");
             break; 
            } */            

        }
        
        System.out.println("!!-------------------!!"); 
         
        System.out.println(" thanks for playing");
         
        }
        
    }
    
    

