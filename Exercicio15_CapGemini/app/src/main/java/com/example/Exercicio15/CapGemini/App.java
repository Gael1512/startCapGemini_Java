package com.example.Exercicio15.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Descubra se o numero esta entre 100 e 200!");
        System.out.println("");
        
        System.out.println("Informe seu numero: ");
        int numero = leitor.nextInt();
        
        System.out.println("------------------------------------------------");
        
        if((numero >= 100) && (numero <= 200)){
            System.out.println("O numero " + numero + " ESTA entre 100 e 200!");
        } else if (numero < 100){
            System.out.println("O numero " + numero + " NAO ESTA entre 100 e 200! Ele é MENOR que 100.");
        } else {
            System.out.println("O numero " + numero + " NAO ESTA entre 100 e 200! Ele é MAIOR que 200.");
        }
        
    }
}
