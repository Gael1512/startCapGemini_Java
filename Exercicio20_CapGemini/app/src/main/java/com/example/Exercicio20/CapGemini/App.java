package com.example.Exercicio20.CapGemini;
import java.util.Scanner;
import java.util.Random;

/*

PROGRAMA NAO ACEITA NOME COMPOSTO, APENAS UM NOME! 
EXEMPLO: HONDA CIVIC = NÃO FUNCIONA.
         HONDA = FUNCIONA.
         CIVIC = FUNCIONA.
         QUEIJO = FUNCIONA
         ALMOÇO GRÁTIS = NÃO FUNCIONA.

ISSO É DEVIDO AO USOS DO .NEXT()
.NEXTLINE() ESTÁ DANDO EXCEPTION

*/

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random(); // GERADOR PARA TESTES.
        int i = 0;
        char escolha = 'X';
        
        System.out.println("CARANGO VELHO: O Melhor preço em Carros vc encontra aqui!!!!");
        System.out.println("");
        
        
        System.out.println("--------------------------------------------------");
        System.out.println("");
        
        while(i >=0 ){
        
        System.out.println("Insira o carro desejado: ");
        String nome = leitor.next();
        
        System.out.println("Insira o ano de fabricacao do carro: ");
        int ano = leitor.nextInt();
        
        //System.out.println("Agora o valor do Carro: ");
        //float preco = leitor.nextFloat();
        float preco = gerador.nextFloat(100001.0f) + 10000.0f;
        
        float doze = 12.0f/100.0f;
        float sete = 7.0f/100.0f;
        
        if(ano <= 2000){
        
            System.out.println("Carro: " + nome);
            System.out.println("Ano: " + ano);
            System.out.println("Desconto: 12%");
            System.out.println("-");
            System.out.println("Valor base: " + preco);
            float desconto = preco - (preco * doze);
            System.out.println("Valor com Desconto: " + desconto);
        
        } else {
        
            System.out.println("Carro: " + nome);
            System.out.println("Ano: " + ano);
            System.out.println("Desconto: 7%");
            System.out.println("-");
            System.out.println("Valor base: " + preco);
            float desconto = preco - (preco * sete);
            System.out.println("Valor com Desconto: " + desconto);
            
        }
        
            System.out.println("--------------------------------------");
            System.out.println("");
            
            do{
            
            System.out.println
        ("DESEJA CONTINUAR CALCULANDO DESCONTO? 'S' para SIM E 'N' para NAO" );
            escolha = leitor.next().charAt(0);
            
            switch(escolha){
            
                case 'S':
                    System.out.println("Entao, vamos continuar: ");
                    System.out.println("");
                    break;
                    
                case 's':
                    System.out.println("Entao, vamos continuar: ");
                    System.out.println("");
                    break;
                    
                case 'N':
                    System.out.println("Ok! Muito Obrigado e ate a proxima!");
                    return;
                    
                case 'n':
                    System.out.println("Ok! Muito Obrigado e ate a proxima!");
                    return;
                    
                default:
                    System.err.println("ERRO: Esta opcao nao e valida, repita o processo!");
                    System.out.println("");
            
            }
            
            } while ((escolha != 'S') && (escolha != 's') 
                    && (escolha != 'N') && (escolha != 'n'));
        
        }
    }
}
