package com.example.Exercicio11.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Sistema para Lucrar: ");
        System.out.println("");
        
        System.out.println("Informe o valor de compra do produto: (apenas numeros)");
        float compra = leitor.nextFloat();
        
        System.out.println("Agora, informe o percentual que será acrescido ao produto: (apenas numeros)");
        float acrescimo = leitor.nextFloat();
        
        System.out.println("-------------------------------------------------");
        
        float percentual = acrescimo/100.0f;
        
        float venda = compra + (compra * percentual);
        
        System.out.println("Aqui estão os resultados: ");
        System.out.println("");
        System.out.println("O valor de compra do produto: " + compra);
        System.out.println("O valor de VENDA do produto: " + venda);
        
        
        
    }
}
