package com.example.Exercicio19.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Cadastro de Sexo/Genero: ");
        System.out.println("");
        
        String nome;
        char genero = 'X';
        
        int qtdHomens = 0;
        int qtdMulheres = 0;
        
               
        
        for(int i = 0; i < 56; i++){
           
        
            System.out.println("Primeiro, informe o seu nome: ");
            nome = leitor.next();
            
            do{
            
            System.out.println
        ("Agora, informe seu sexo/genero (M para Masculino e F para Feminino: ");
            genero = leitor.next().charAt(0);
            
            System.out.println("---------------------------------------------");
            
            switch(genero){
            
                case 'M':
                    System.out.println("Seu nome eh " + nome + ".");
                    System.out.println("Voce eh HOMEM!");
                    qtdHomens++;
                    break;
                    
                case 'm':
                    System.out.println("Seu nome eh " + nome + ".");
                    System.out.println("Voce eh HOMEM!");
                    qtdHomens++;
                    break;
                    
                case 'F':
                    System.out.println("Seu nome eh " + nome + ".");
                    System.out.println("Voce eh MULHER!");
                    qtdMulheres++;
                    break;
                    
                case 'f':
                    System.out.println("Seu nome eh " + nome + ".");
                    System.out.println("Voce eh MULHER!");
                    qtdMulheres++;
                    break;
                    
                default:
                    System.err.println
        ("ERRO: Essa opçao nao e valida, Tente novamente o genero!");
                    
            
            }
            
            } while((genero != 'M') && (genero != 'm') 
                    && (genero != 'F') && (genero != 'f'));
        
        } 
        
        System.out.println("------------------------------------------------");
        
        System.out.println("Quantidade de HOMENS cadastrados: " + qtdHomens);
        System.out.println("Quantidade de MULHERES cadastradas: " + qtdMulheres);
        
        
        }
        
    }

