package com.example.Exercicio1.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("CALCULADORA DE SOMAS!");
        
        System.out.println("Digite o primeiro valor: ");
        int numero1 = leitor.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int numero2 = leitor.nextInt();
        
        int soma = numero1 + numero2;
        
        System.out.println("---------------------------");
        System.out.println("A soma dos valores é igual a: " + soma);
        
        
    }
}
