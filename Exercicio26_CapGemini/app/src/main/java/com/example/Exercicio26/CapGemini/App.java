package com.example.Exercicio26.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Sistema que escreve por EXTENSO (1 a 5)");
        System.out.println("");
        
        System.out.println("----------------------------");
        System.out.println("Digite um numero de 1 a 5: ");
        int numero = leitor.nextInt();
        
        switch(numero){
            
            case 1:
                System.out.println("Numero escolhido: UM!");
                break;
                
            case 2:
                System.out.println("Numero escolhido: DOIS!");
                break;
                
            case 3:
                System.out.println("Numero escolhido: TRES!");
                break;
                
            case 4:
                System.out.println("Numero escolhido: QUATRO!");
                break;
                
            case 5:
                System.out.println("Numero escolhido: CINCO!");
                break;
                
            default:
                System.err.println("NUMERO INVALIDO!");
                break;
        }
        
        System.out.println("");
        System.out.println("FIM DO PROGRAMA!");
    }
}
