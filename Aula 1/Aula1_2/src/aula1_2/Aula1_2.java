/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1_2;

import java.util.Scanner;

/**
 *
 * @author unifgcardoso
 */
public class Aula1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
       System.out.println("Qual o primeiro numero?");
       int numero_1 = input.nextInt();
       
       System.out.println("Qual o segundo numero?");
       int numero_2 = input.nextInt();
       
       System.out.println("Qual o terceiro numero?");
       int numero_3 = input.nextInt();
       
       if(numero_1 > numero_2 && numero_1 > numero_3){
           
           if(numero_2 > numero_3){
               
               System.out.printf("%d %d %d",numero_3,numero_2,numero_1);
               
           }
           else
               System.out.printf("%d %d %d",numero_2,numero_3,numero_1);
       }
       
       
       if(numero_2 > numero_1 && numero_2 > numero_3){
           if(numero_1 > numero_3){
               
               System.out.printf("%d %d %d",numero_3,numero_1,numero_2);
               
           }
           else
               System.out.printf("%d %d %d",numero_1,numero_3,numero_2);
       }
       if(numero_3 > numero_2 && numero_3 > numero_1){
           if(numero_1 > numero_2){
               
               System.out.printf("%d %d %d",numero_2,numero_1,numero_3);
               
           }
           else
               System.out.printf("%d %d %d",numero_1,numero_2,numero_3);
       }

    }
    
}
