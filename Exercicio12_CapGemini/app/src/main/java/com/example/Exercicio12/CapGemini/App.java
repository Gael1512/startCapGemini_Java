package com.example.Exercicio12.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Conversor de custo de carro (fabrica para venda): ");
        System.out.println("");
        
        System.out.println("Informe o custo de fabrica do carro desejado (apenas numeros): ");
        float fabrica = leitor.nextFloat();
        
        System.out.println("-------------------------------------------------");
        
        float percentualDistribuidor = 28.0f/100.0f;
        float imposto = 45.0f/100.0f;
        
        float primeiraConversao = fabrica * imposto;
        float segundaConversao =  primeiraConversao * percentualDistribuidor;
        
        float consumidor = fabrica + (fabrica * segundaConversao);
        
        System.out.println("Os resultados são: ");
        System.out.println("");
        System.out.println("Valor de fabrica: R$" + fabrica);
        System.out.println("Valor para o consumidor: R$" + consumidor);
        
    }
}
