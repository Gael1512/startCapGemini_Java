package com.example.Exercicio18.CapGemini;
import java.util.Scanner;
import java.util.Random; // USADO PARA TESTE

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        //Random gerador = new Random(); // USADO PARA TESTE
        
        System.out.println("Descubra se voce é DE MAIOR ou DE MENOR (idade): ");
        System.out.println("");
        
        for(int i = 0; i < 75; i++){
        
            System.out.println("Insira sua idade: ");
            int idade = leitor.nextInt();
            //int idade = gerador.nextInt(101); // USADO PARA TESTE
            
            if(idade >= 18){
            
                System.out.println("Se sua idade eh " + idade + ", entao vc eh DE MAIOR!");
            
            } else {
            
                System.out.println("Se sua idade eh " + idade + ", entao vc eh DE MENOR!");
            
            }
        
        }
        
    }
}
