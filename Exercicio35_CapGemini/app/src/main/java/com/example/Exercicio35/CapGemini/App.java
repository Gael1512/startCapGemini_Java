package com.example.Exercicio35.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int local = 0;
        
            System.out.println("Calculador de Conta de Energia - C.C.E");
            System.out.println("");
            System.out.println("-----------------------------------------");

            System.out.println("Por favor, insira o nome do cliente: ");
            String nome = leitor.nextLine();
            System.out.println("");
            
            System.out.println
            ("Agora, informe a quantidade de horas de uso p/ dia: ");
            float horas = leitor.nextFloat();
            
            System.out.println("");
        
        do{
        
            System.out.println("Por fim, informe o tipo do local do cliente: ");
            System.out.println("1 - RESIDENCIA");
            System.out.println("2 - COMERCIO");
            System.out.println("3 - INDUSTRIA");
            local = leitor.nextInt();
            System.out.println("");

            
            System.out.println("---------------------------------------------");
            
            float mes = horas * 30;
            
            float residencia = mes * 0.60f;
            float comercio = mes * 0.48f;
            float industria = mes * 1.29f;
            
            
            switch(local){
            
                case 1:
                    
                    System.out.println("Nome: " + nome);
                    System.out.println("Tipo de Local: Residencia");
                    System.out.println("Conta a pagar: R$ " + residencia);
                    break;
            
                case 2:
                    
                    System.out.println("Nome: " + nome);
                    System.out.println("Tipo de Local: Comercio");
                    System.out.println("Conta a pagar: R$ " + comercio);
                    break;
                    
                case 3:
                    
                    System.out.println("Nome: " + nome);
                    System.out.println("Tipo de Local: Industria");
                    System.out.println("Conta a pagar: R$ " + industria);
                    break;
                    
                default:
                    
                    System.err.println
                    ("ERRO: ESTA OPCAO EH INVALIDA!!! TENTE NOVAMENTE.");
            }
        
        } while((local < 1) || (local > 3));
        
        System.out.println("-");
        System.out.println("FIM DO PROGRAMA!");
        
    }
}
