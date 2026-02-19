package com.example.Exercicio6.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        System.out.println("Sistema que informa exatamente os valores das variaveis...ou nao");
        System.out.println("");
        
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Informe o valor da variavel 1: ");
        float v1 = leitor.nextFloat();
        
        System.out.println("Informe o valor da variavel 2: ");
        float v2 = leitor.nextFloat();
        
        System.out.println("----------------------------------------------");
        
        float vReserva = v1; // o segredo da troca hihi
        
        v1 = v2;
        v2 = vReserva;
        
        System.out.println("Aqui esta os valores das variaveis: ");
        System.out.println("");
        
        System.out.println("Variavel 1: " + v1);
        System.out.println("Variavel 2: " + v2);
        
        System.out.println("");
        System.out.println("Estou certo, né? NÃO????! Me perdoe! Me dê uma nova chance, por favor! :/ ");
        
    }
}
