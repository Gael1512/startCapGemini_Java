package com.example.Exercicio4.CapGemini;
import java.util.Scanner;

public class App {      

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("S.I.S - Sistema de Informação do Salário");
        System.out.println("");
        
        System.out.println("Informe seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Informe o seu salário (apenas numeros): ");
        float salario = leitor.nextFloat();
        
        System.out.println("Informe o valor total das vendas feitas esse mês (apenas numeros): ");
        float vendas = leitor.nextFloat();
        
        System.out.println("-----------------------------------------------");
        
        float percentual = 15.0f;
        float adicional = vendas * (percentual / 100);
        
        float salarioTotal = salario + adicional;
        
        System.out.println("Colaborador: " + nome);
        System.out.println("Seu salario base: R$" + salario);
        System.out.println("Seu salario total: R$" + salarioTotal);
        
    }
}
