/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pra02ex03;

import java.util.Scanner;

/**
 *
 * @author unifgcardoso
 */
public class DataTeste {
    
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        Data data = new Data();
    
        System.out.println("Que dia eh hoje?");
        int dia = input.nextInt();
    
        System.out.println("Que mes estamos?");
        int mes = input.nextInt();

        System.out.println("Que ano estamos??");
        int ano = input.nextInt();
        
        data.setAno(ano);
        data.setDia(dia);
        data.setMes(mes);
        
        data.exibeData();
        
    
    }
}
