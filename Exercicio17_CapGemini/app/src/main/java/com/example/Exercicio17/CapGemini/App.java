package com.example.Exercicio17.CapGemini;
import java.util.Scanner;
import java.util.Random; // USADO PARA TESTE

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        //Random gerador = new Random(); // USADO PARA TESTE
        
        System.out.println("Descubra de seu numero ESTA entre 10 e 150: ");
        System.out.println("");
        
        for(int i = 0; i < 80; i++){
        
            System.out.println("Insira um numero: ");
            int numero = leitor.nextInt();
            //int numero = gerador.nextInt(201); // USADO PARA TESTE
            
            if((numero >= 10) && (numero <= 150)){
            
                System.out.println("O numero " + numero + " ESTA entre 10 e 150.");
                
            } else {
            
                System.out.println("O numero " + numero + " NAO ESTA entre 10 e 150.");
            
            }
        
        }
        
    }
}
