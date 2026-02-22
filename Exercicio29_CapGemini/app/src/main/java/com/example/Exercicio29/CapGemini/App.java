package com.example.Exercicio29.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int mes = 0;
        
        System.out.println("Sistema para identificar o mês!");
        System.out.println("");
        
        do{
        
        System.out.println("-------------------------------------------");
        System.out.println("Digite um numero de 1 a 12: ");
        mes = leitor.nextInt();
        
        System.out.println("---------------------------------------------");
        
        switch(mes){
        
            case 1:
                System.out.println("O mes '1' eh o mes de JANEIRO!");
                break;
                
            case 2:
                System.out.println("O mes '2' eh o mes de FEVEREIRO!");
                break;
                
            case 3:
                System.out.println("O mes '3' eh o mes de MARÇO!");
                break;
                
            case 4:
                System.out.println("O mes '4' eh o mes de ABRIL!");
                break;
                
            case 5:
                System.out.println("O mes '5' eh o mes de MAIO!");
                break;
                
            case 6:
                System.out.println("O mes '6' eh o mes de JUNHO!");
                break;
                
            case 7:
                System.out.println("O mes '7' eh o mes de JULHO!");
                break;
                
            case 8:
                System.out.println("O mes '8' eh o mes de AGOSTO!");
                break;
                
            case 9:
                System.out.println("O mes '9' eh o mes de SETEMBRO!");
                break;
                
            case 10:
                System.out.println("O mes '10' eh o mes de OUTUBRO!");
                break;
                
            case 11:
                System.out.println("O mes '11' eh o mes de NOVEMBRO!");
                break;
                
            case 12:
                System.out.println("O mes '12' eh o mes de DEZEMBRO!");
                break;
                
                
            default:
                System.err.println
                ("ERRO: ESTE VALOR EH INVALIDO! TENTE NOVAMENTE!");
        
        }
        
        
        }while((mes < 1) || (mes > 12));
        
        
        System.out.println("-----------------------");
        System.out.println("FIM DO PROGRAMA!");
        
        
        
    }
}
