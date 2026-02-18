package com.example.Exercicio9.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("S.P.R - Sistema de Previsão de Rendimento (0,07%)!");
        System.out.println("");
        
        System.out.println("Informe o valor que será depositado: (apenas numeros)");
        float dinheiro = leitor.nextFloat();
        
        System.out.println("----------------------------------------------------");
        
        float rendimento = 0.07f/100.0f;
        
        float dinheiroRendido = dinheiro + (dinheiro * rendimento);
        
        System.out.println("Seu dinheiro, em um mês será: ");
        System.out.println("");
        System.out.println("Dinheiro depositado: " + dinheiro);
        System.out.println("Dinheiro em um mês: " + dinheiroRendido);
        
    }
}
