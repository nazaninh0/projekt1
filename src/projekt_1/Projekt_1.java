/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projekt_1;

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
        String[] fiende= {"dator "}; 
        int maxfiendehälso = 100 ; 
        int health = 100; 
        boolean running = true; 
        System.out.println("välkoman till spelet ");
        GAME : 
        while(running){
            int max= 100; 
            int min= 1; 
            int x = (int)(Math.random()*(max-min+1)+min); 
            if(x>50){
                System.out.println("det är din tur att attackera ");
            }
            else{
                System.out.println("det är datorns tur att attckera");
                    
            }
            break GAME; 
            }
        
        }
    }
    

