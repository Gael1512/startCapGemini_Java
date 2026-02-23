package com.example.Exercicio32.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Sistema de triangulos!");
        System.out.println("");
        
        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;
        
        do{
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Informe o valor do lado 1: ");
        lado1 = leitor.nextInt();
        
        System.out.println("Informe o valor do lado 2: ");
        lado2 = leitor.nextInt();
        
        System.out.println("Informe o valor do lado 3: ");
        lado3 = leitor.nextInt();
        
        System.out.println("---------------------------------------------------");
        
        
        if((lado1 <= 0) || (lado2 <= 0) || (lado3 <= 0)){
        
            System.err.println("ERRO: Esse valor não permite fazer um triangulo!");
            
        } else {
        
            if((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)){
            
                System.out.println("Utilizando os valores a seguir: ");
                System.out.println("lado 1: " + lado1);
                System.out.println("lado 2: " + lado2);
                System.out.println("lado 3: " + lado3);
                System.out.println("-");
                System.out.println("Voce obtem o triangulo: ESCALENO");
            
            } else if((lado1 == lado2) && (lado2 == lado3)){
        
                System.out.println("Utilizando os valores a seguir: ");
                System.out.println("lado 1: " + lado1);
                System.out.println("lado 2: " + lado2);
                System.out.println("lado 3: " + lado3);
                System.out.println("-");
                System.out.println("Voce obtem o triangulo: EQUILATERO (TAMBEM ISOSCELES)");
        
            } else {
        
                System.out.println("Utilizando os valores a seguir: ");
                System.out.println("lado 1: " + lado1);
                System.out.println("lado 2: " + lado2);
                System.out.println("lado 3: " + lado3);
                System.out.println("-");
                System.out.println("Voce obtem o triangulo: ISOSCELES");
            
            }
        
          } 
       } while ((lado1 <= 0) || (lado2 <= 0) || (lado3 <= 0));
        
        System.out.println("-");
        System.out.println("FIM DO PROGRAMA!!!");
    }
}
