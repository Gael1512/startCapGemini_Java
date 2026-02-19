package com.example.Exercicio13.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("É maior que 10 ou não");
        
        System.out.println("Informe o numero: ");
        int numero = leitor.nextInt();
        System.out.println("");
        System.out.println("------------------------------");
        
        if(numero > 10){
            System.out.println("O numero " + numero + " é MAIOR que 10!");
        } else if(numero < 10){
            System.out.println("O numero " + numero + " é MENOR que 10!");
        } else {
            System.out.println("Este É o numero 10!");
        }
    }
}
