package com.example.Exercicio3.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Descubra sua média de consumo de Combustivel!");
        System.out.println("");
        
        System.out.println("Digite aqui (nao precisa colocar 'km') a distancia pecorrida: ");
        float distancia = leitor.nextFloat();
        
        System.out.println
        ("Digite agora a quantidade de combustivel gasto nesse percuso (tambem não precisa colocar 'L')");
        float combustivel = leitor.nextFloat();
        
        float media = distancia/combustivel;
        
        System.out.println("---------------------------------");
        System.out.println("Sua média de consumo é: " + media + "km por litro!");
        
    }
}
