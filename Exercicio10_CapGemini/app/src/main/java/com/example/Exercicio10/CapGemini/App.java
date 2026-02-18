package com.example.Exercicio10.CapGemini;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
       Scanner leitor = new Scanner(System.in);
       
        System.out.println
        ("A Loja Mamao com Açucar agora parcela em CINCO vezes SEM JUROS!");
        System.out.println("");
        
        System.out.print("Informe o valor total da compra(s): R$");
        float compra = leitor.nextFloat();
        
        System.out.println("----------------------------------------");
        
        float parcela = compra/5.0f;
        
        System.out.println("Sua compra foi de R$" + compra);
        System.out.println("");
        System.out.println("Parcelando em cinco vezes fica: R$" + parcela);
        
        
    }
}
