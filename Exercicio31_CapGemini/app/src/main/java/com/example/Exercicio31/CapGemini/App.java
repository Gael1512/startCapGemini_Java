package com.example.Exercicio31.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        char operacao = 'X';
        
        System.out.println("Tabuada manual!");
        System.out.println("");
        
        
        
        System.out.println("----------------------------------");
        System.out.println("Vamos começar com os valores!");
        System.out.println("Insira o primeiro valor: ");
        float a = leitor.nextFloat();
        
        System.out.println("Insira o segundo valor: ");
        float b = leitor.nextFloat();
        
        do{
        
        System.out.println("-");
        System.out.println("Agora, insira qual operaçao deseja fazer: ");
        System.out.println("Digite ' + ' para somar.");
        System.out.println("Digite ' - ' para subtrair.");
        System.out.println("Digite ' * ' para multiplicar.");
        System.out.println("Digite ' / ' para dividir.");
        operacao = leitor.next().charAt(0);
        
        System.out.println("-----------------------------------------");
        
        
        float calculo;
        
        
        switch(operacao){
        
            case '+':
                calculo = a + b;
                System.out.println
                ("A soma de " + a + " + " + b + " é igual a " + calculo);
                break;
                
            case '-':
                calculo = a - b;
                System.out.println
                ("A subtraçao de " + a + " - " + b + " é igual a " + calculo);
                break;
                
                
            case '*':
                calculo = a * b;
                System.out.println
                ("A multiplicacao de " + a + " * " + b + " é igual a " + calculo);
                break;
                
                
            case '/':
                calculo = a / b;
                if(b == 0){
                    System.err.println
                    ("ERRO: Um numero NAO pode ser divisivel por ZERO!");
                    return;
                } else {
                    System.out.println
                    ("A divisao de " + a + " / " + b + " é igual a " + calculo);
                    break;
                }
                
            default:
                System.out.println
                ("Por favor, insira uma das opçoes de operadores!");
        
        }
        
        } while ((operacao != '+') && (operacao != '-') 
                && (operacao != '*') && (operacao != '/'));
        
    }
}
