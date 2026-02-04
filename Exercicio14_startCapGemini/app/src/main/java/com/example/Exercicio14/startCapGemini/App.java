package com.example.Exercicio14.startCapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        System.out.print("Digite um numero: ");
        
        Scanner leia = new Scanner(System.in);
        
        
        int numero = leia.nextInt();
        
        
        if((numero >= 100) && (numero <= 200) ){
        
            System.out.println("Este numero ESTA entre 100 e 200");
        
        } else {
        
            System.out.println("Este numero NAO esta entre 100 e 200");
        
        }
        
    }
}
