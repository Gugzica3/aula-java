/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1_3;

import java.util.Scanner;

/**
 *
 * @author unifgcardoso
 */
public class Aula1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
       System.out.println("Quantos musicos tem na banda?");
       int numero_musicos = input.nextInt();
       int guitarra = 0;
       int bateria = 0;
       int baixo = 0;
        for(int i = 0; i<numero_musicos ; i++){
            System.out.println("voce toca guitarra?(S/N)");
            String toca_guitarra = input.next();
            if(toca_guitarra.equals("s") || toca_guitarra.equals("S")){
                guitarra = guitarra + 1;
            }
            System.out.println("voce toca bateria?(S/N)");
            String toca_bateria = input.next();
            if(toca_bateria.equals("s") || toca_bateria.equals("S")){
                bateria = bateria + 1;
            }
            System.out.println("voce toca baixo?(S/N)");
            String toca_baixo = input.next();
            if(toca_baixo.equals("s") || toca_baixo.equals("S")){
                baixo = baixo + 1;
            }
            
        }
    System.out.printf("%d tocam guitarra, %d tocam bateria e %d tocam baixo", guitarra, bateria, baixo);
    }
    
}
