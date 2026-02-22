package com.example.Exercicio23.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Mensagem comum, RARA, ou nada: ");
        System.out.println("");
        
        System.out.println("----------------------------------------------");
        System.out.println("Insira um numero: ");
        int numero = leitor.nextInt();
        
        if(numero > 80){
        
            System.out.println("MENSAGEM COMUM: ESSE NUMERO EH MAIOR QUE 80");
            
        } else if (numero < 25){
        
            System.out.println("MENSAGEM COMUM: ESSE NUMERO EH MENOR QUE 25");
        } else if(numero == 40){
        
            System.out.println("MENSAGEM RARA!!!: ESSE NUMERO EH O 40! PARABENS");    
        }
        
        System.out.println("");
        System.out.println("FIM DO PROGRAMA!");
        
    }
}
