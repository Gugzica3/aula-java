/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03ex04;

/**
 *
 * @author unifgcardoso
 */
public class Data {
    private int dia,mes,ano;
    private String mesStr;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(int dia, int ano) {
        this.ano = ano;
        if(dia < 31){
            mes = 1;
        }
        if(dia > 31 && dia < 59){
            mes = 2;
        }
        if(dia < 30){
            mes = 1;
        }
        if(dia < 30){
            mes = 1;
        }
        if(dia < 30){
            mes = 1;
        }
        if(dia < 30){
            mes = 1;
        }
        if(dia < 30){
            mes = 1;
        }
        if(dia < 30){
            mes = 1;
        }
        if(dia < 30){
            mes = 1;
        }
        if(dia < 30){
            mes = 1;
        }
        if(dia < 30){
            mes = 1;
        }
        
    }
    
    public Data(int dia, String mes, int ano){
        this.dia = dia;
        if(mes.equals("janeiro")){
            this.mes = 1;
            mesStr = "janeiro";
        }
        if(mes.equals("fevereiro")){
            this.mes = 2;
            mesStr = "fevereiro";
        }
        if(mes.equals("marco")){
            this.mes = 3;
            mesStr = "marco";
        }
        if(mes.equals("abril")){
            this.mes = 4;
            mesStr = "abril";
        }
        if(mes.equals("maio")){
            this.mes = 5;
            mesStr = "maio";
        }
        if(mes.equals("junho")){
            this.mes = 6;
            mesStr = "junho";
        }
        if(mes.equals("julho")){
            this.mes = 7;
            mesStr = "julho";
        }
        if(mes.equals("agosto")){
            this.mes = 8;
            mesStr = "agosto";
        }
        if(mes.equals("setembro")){
            this.mes = 9;
            mesStr = "setembro";
        }
        if(mes.equals("outubro")){
            this.mes = 10;
            mesStr = "outubro";
        }
        if(mes.equals("novembro")){
            this.mes = 11;
            mesStr = "novembro";
        }
        if(mes.equals("dezembro")){
            this.mes = 12;
            mesStr = "dezembro";
        }
    }

   public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void printtudo(){
        System.out.println(dia + "/" + mes + "/" + ano );
        System.out.println(dia + "/" + mesStr + "/" + ano );
        System.out.println(dia + "/" + "/" + ano );
    }
    
    
}
