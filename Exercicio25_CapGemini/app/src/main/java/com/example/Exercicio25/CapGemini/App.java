package com.example.Exercicio25.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Igual ou diferente? Entre dois numeros o que sao?");
        System.out.println("");
        
        System.out.println("---------------------");
        System.out.println("Insira o primeiro numero: ");
        int numero1 = leitor.nextInt();
        
        System.out.println("Insira o segundo numero: ");
        int numero2 = leitor.nextInt();
        
        if(numero1 == numero2){
        
            System.out.println("Os dois numeros sao IGUAIS!");
        
        } else if (numero1 > numero2){
            
            System.out.println("Os dois numeros sao DIFERENTES! ");
            System.out.println("O Primeiro numero EH MAIOR que o segundo");
            
        } else {
        
            System.out.println("Os dois numeros sao DIFERENTES! ");
            System.out.println("O Segundo numero EH MAIOR que o primeiro");
            
        }
        
        System.out.println("");
        System.out.println("FIM DO PROGRAMA!");
    }
}
