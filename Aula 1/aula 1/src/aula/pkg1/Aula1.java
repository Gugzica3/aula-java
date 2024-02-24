/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula.pkg1;

import java.util.Scanner;

/**
 *
 * @author unifgcardoso
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Qual sua nota da prova?");
        float prova = input.nextInt();
        
        System.out.println("Qual sua nota do projeto?");
        float projeto = input.nextInt();
        
        System.out.println("Qual sua nota do Laboratorio 1?");
        float lab1 = input.nextInt();
        
        System.out.println("Qual sua nota do Laboratorio 2?");
        float lab2 = input.nextInt();
        
        System.out.println("Qual sua nota do Laboratorio 3?");
        float lab3 = input.nextInt();
        
        float media_lab = (lab1+lab2+lab3)/3;
       
        float nota_final = (float) (0.2*media_lab+0.8*Math.sqrt(prova*projeto));
        
        System.out.printf("media final e %.2f \n",nota_final );
    }
    
}
