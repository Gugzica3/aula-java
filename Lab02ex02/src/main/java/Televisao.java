/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifgcardoso
 */
public class Televisao {
    private String modelo;
    private float preco,tamanho;
    private int volume,canal;
    private boolean ligada;
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
    public void setTamanho(float tamanho){
        this.tamanho = tamanho;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }
    
    public String getModelo(){
        return modelo;
    }
    public float getPreco(){
        return preco;
    }
    public float getTamanho(){
        return tamanho;
    }
    public int getVolume(){
        return volume;
    }
    public int getCanal(){
        return canal;
    }
    public boolean getLigada(){
        return ligada;
    }
    public void alteraVolume(int arg){
        if( arg > 0){
            volume = volume + arg;
        }
        else
            volume = volume - arg;
    }
    public void alteraCanal(int arg){
        if( arg > 0){
            canal = canal + 1;
        }
        else
            canal = canal - 1;
        
    }
}