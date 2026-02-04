package com.example.Exercício24;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int i = 1;
        
        while (i <= 9999){
            
            System.out.println("Digite um número que deseja saber se é: NEGATIVO, POSITIVO OU ZERO");
            int numeros = leitor.nextInt();
            
            if(numeros < 0){
                System.out.println("O numero " + numeros + " é NEGATIVO!");
            } else if(numeros > 0){
                System.out.println("O numero " + numeros + " é POSITIVO!");
            } else {
                System.out.println("Esse número é o ZERO!");
            }
            
            
            
            System.out.println("Deseja PARAR agora? Se SIM digite '0', se NÃO digite '1'!");
            byte resposta = leitor.nextByte();
            
            do{
            
            switch(resposta){
            
                case 0:
                    System.err.println("Encerrando programa!");
                    return;
                    
                case 1:
                    break;
                    
                default:
                    System.err.println("ESTA OPÇAO NAO E VALIDA!!! TENTE NOVAMENTE!!!!:");
                    System.out.println("----------------------------------------------");
                    
                    System.out.println("Deseja PARAR agora? Se SIM digite '0', se NÃO digite '1'!");
                    resposta = leitor.nextByte();
                    continue;
            }
            
            }while((resposta < 0) || (resposta > 1));

            i++;
            
        }
        
        
        
        
    }
}
