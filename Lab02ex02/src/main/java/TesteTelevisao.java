
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author unifgcardoso
 */
public class TesteTelevisao {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        Televisao tv1 = new Televisao();
        
        System.out.println("Qual o modelo?");
        String modelo = input.nextLine();
        System.out.println("Qual o preco?");
        float preco = input.nextFloat();
        System.out.println("Qual o tamanho?");
        float tamanho = input.nextFloat();
        System.out.println("Qual o volume?");
        int volume = input.nextInt();
        System.out.println("Qual o canal?");
        int canal = input.nextInt();
        System.out.println("Esta ligada(nao 0/ sim 1)?");
        int ligar = input.nextInt();
        System.out.println("Coloque a quantia de volume que você quer adicionar ao volume");
        int mudarVolume = input.nextInt();
        
        boolean ligada;
        
        if(ligar == 1){
            ligada = true;
        }
        else
             ligada = false;
        
        tv1.setCanal(canal);
        tv1.setLigada(ligada);
        tv1.setModelo(modelo);
        tv1.setPreco(preco);
        tv1.setTamanho(tamanho);
        tv1.setVolume(volume);
        tv1.alteraVolume(mudarVolume);
        
        input.nextLine();
        
        Televisao tv2 = new Televisao();
        
        System.out.println("Qual o modelo?");
        modelo = input.nextLine();
        System.out.println("Qual o preco?");
        preco = input.nextFloat();
        System.out.println("Qual o tamanho?");
        tamanho = input.nextFloat();
        System.out.println("Qual o volume?");
        volume = input.nextInt();
        System.out.println("Qual o canal?");
        canal = input.nextInt();
        System.out.println("Esta ligada(nao 0/ sim 1)?");
        ligar = input.nextInt();
        System.out.println("Coloque a quantia de volume que você quer adicionar ao volume");
        mudarVolume = input.nextInt();
        
        
        if(ligar == 1){
            ligada = true;
        }
        else
             ligada = false;
        
        tv2.setCanal(canal);
        tv2.setLigada(ligada);
        tv2.setModelo(modelo);
        tv2.setPreco(preco);
        tv2.setTamanho(tamanho);
        tv2.setVolume(volume);
        tv2.alteraVolume(mudarVolume);
        
        
    }
}
