/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pra02ex03;

/**
 *
 * @author unifgcardoso
 */
public class Data {
   private int mes,dia,ano;
    
   public void setMes(int mes){
       this.mes = mes;
   }
   
   public int getMes(){
       return mes;
   }
   
   public void setDia(int dia){
       this.dia = dia;
   }
   public int getDia(){
       return dia;
   }
   
   public void setAno(int ano){
       this.ano = ano;
   }
    
   public int getAno(){
       return ano;
   }
   public void exibeData(){
       System.out.printf("%d/%d/%d\n",dia,mes,ano);
   }
}

