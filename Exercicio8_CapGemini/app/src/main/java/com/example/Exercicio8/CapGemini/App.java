package com.example.Exercicio8.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("CONVERSOR DE MOEDA (DOLAR PARA REAL)!");
        System.out.println("");
        
        System.out.println("Primeiro, informe a COTACAO do Dolar (em reais): ");
        float cotacao = leitor.nextFloat();
        
        System.out.println("Agora, informe quantos dolares você tem: ");
        float dolar = leitor.nextFloat();
        
        System.out.println("------------------------------------------------");
        
        float real = dolar * cotacao;
        
        System.out.println("Aqui estão os resultados:");
        System.out.println("");
        System.out.println("Dolar: US$ " + dolar);
        System.out.println("Real: R$ " + real);
        
    }
}
