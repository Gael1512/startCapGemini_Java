package com.example.Exercicio2.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        System.out.println("Programa de Tabuada! Soma, Subtração, Multiplicação e Divisão:");
        System.out.println("");
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        float numero1 = leitor.nextFloat();
        
        System.out.println("Digite o segundo valor: ");
        float numero2 = leitor.nextFloat();
        
        float soma = numero1 + numero2;
        float subtracao = numero1 - numero2;
        float multiplicacao = numero1 * numero2;
        float divisao = numero1 / numero2;
        
        System.out.println("------------------------------");
        
        System.out.println("Aqui vai os valores de cada operação, baseados nos números sugeridos: ");
        System.out.println("");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        
    }
}
