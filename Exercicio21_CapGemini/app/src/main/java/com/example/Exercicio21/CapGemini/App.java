package com.example.Exercicio21.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Programa de Alistamento Militar: ");
        System.out.println("");
        
        System.out.println("Quantos irao se alistar agora?");
        int qtdPessoas = leitor.nextInt();
        System.out.println("");
        
        for(int i = 0; i < qtdPessoas; i++){
        
            System.out.println("------------------------------------------");
            System.out.println("Informe seu nome: ");
            String nome = leitor.next();
            
            System.out.println
            ("Informe seu sexo ('M' para Masculino, 'F' para Feminino): ");
            char sexo = leitor.next().charAt(0);
            
            System.out.println("Informe sua idade: ");
            int idade = leitor.nextInt();
            
            System.out.println
            ("Informe seu estado de saúde('S' para Saudavel, 'D' para Doente): ");
            char saude = leitor.next().charAt(0);
            
            System.out.println("----------------------------------------");
            System.out.println("----------------------------------------");
            
            switch(sexo){
            
                case 'M':
                    
                    System.out.println("Candidato de nome: " + nome);
                    System.out.println("Sexo: Masculino");
                    
                    if((idade >= 18) && (idade <= 100)){
                    
                        System.out.println("Idade: " + idade);
                        
                        switch(saude){
                        
                            case 'S':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 's':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'D':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'd':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            default:
                                
                                System.out.println("Saude: Não sabe se esta saudavel ou doente? "
                                        + "Vamos supor então que voce esta saudavel.");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                        
                        }
                        
                        
                    } else if((idade >= 0) && (idade < 18)){
                    
                        System.out.println("Idade: " + idade);
                        
                        switch(saude){
                        
                            case 'S':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 's':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'D':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'd':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            default:
                                
                                System.out.println("Nao sabe se esta saudavel ou doente? "
                                        + "Nao importa, voce e de menor. Por isso...");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                        
                        }
                    } else {
                    
                        System.out.println("Idade: Idade de Alien!" );
                        System.out.println("Saude: Um Alienigena nao fica doente...");
                        System.out.println("-");
                        System.out.println
                        ("Parabens!!!! "
                        + "Precisamos de um Alien no Exercito e voce foi ESCOLHIDO!");
                        
                    }
                    
                    break;
                    
                case 'm':
                    
                    System.out.println("Candidato de nome: " + nome);
                    System.out.println("Sexo: Masculino");
                    
                    if((idade >= 18) && (idade <= 100)){
                    
                        System.out.println("Idade: " + idade);
                        
                        switch(saude){
                        
                            case 'S':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 's':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'D':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'd':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            default:
                                
                                System.out.println("Saude: Não sabe se esta saudavel ou doente? "
                                        + "Vamos supor então que voce esta saudavel.");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                        
                        }
                        
                    } else if((idade >= 0) && (idade < 18)){
                    
                        System.out.println("Idade: " + idade);
                        
                        switch(saude){
                        
                            case 'S':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 's':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'D':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'd':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            default:
                                
                                System.out.println("Nao sabe se esta saudavel ou doente? "
                                        + "Nao importa, voce e de menor. Por isso...");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                        
                        }
                    } else {
                    
                        System.out.println("Idade: Idade de Alien!" );
                        System.out.println("Saude: Um Alienigena nao fica doente...");
                        System.out.println("-");
                        System.out.println
                        ("Parabens!!!! "
                        + "Precisamos de um Alien no Exercito e voce foi ESCOLHIDO!");
                        
                    }
                    
                    break;
                    
                case 'F':
                    
                    System.out.println("Candidato de nome: " + nome);
                    System.out.println("Sexo: Feminino");
                    
                    if((idade >= 18) && (idade <= 100)){
                    
                        System.out.println("Idade: " + idade);
                        
                        switch(saude){
                        
                            case 'S':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 's':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'D':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'd':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            default:
                                
                                System.out.println("Saude: Não sabe se esta saudavel ou doente?"
                                        + "Vamos supor então que voce esta saudavel.");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                        
                        }
                        
                    } else if((idade >= 0) && (idade < 18)){
                    
                        System.out.println("Idade: " + idade);
                        
                        switch(saude){
                        
                            case 'S':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 's':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'D':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'd':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            default:
                                
                                System.out.println("Nao sabe se esta saudavel ou doente?"
                                        + "Nao importa, voce e de menor. Por isso...");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                        
                        }
                    } else {
                    
                        System.out.println("Idade: Idade de Alien!" );
                        System.out.println("Saude: Um Alienigena nao fica doente...");
                        System.out.println("-");
                        System.out.println
                        ("Parabens!!!! "
                        + "Precisamos de um Alien no Exercito e voce foi ESCOLHIDO!");
                        
                    }
                    
                    break;
                    
                case 'f':
                    
                    System.out.println("Candidato de nome: " + nome);
                    System.out.println("Sexo: Feminino");
                    
                    if((idade >= 18) && (idade <= 100)){
                    
                        System.out.println("Idade: " + idade);
                        
                        switch(saude){
                        
                            case 'S':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 's':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'D':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'd':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            default:
                                
                                System.out.println("Saude: Não sabe se esta saudavel ou doente?"
                                        + "Vamos supor então que voce esta saudavel.");
                                System.out.println("-");
                                System.out.println
                                ("Parabéns!! "
                                + "Você está APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                        
                        }
                        
                    } else if((idade >= 0) && (idade < 18)){
                    
                        System.out.println("Idade: " + idade);
                        
                        switch(saude){
                        
                            case 'S':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 's':
                                
                                System.out.println("Saude: Saudavel");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'D':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            case 'd':
                                
                                System.out.println("Saude: Doente");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                                
                            default:
                                
                                System.out.println("Nao sabe se esta saudavel ou doente?"
                                        + "Nao importa, voce e de menor. Por isso...");
                                System.out.println("-");
                                System.out.println
                                ("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
                        
                        }
                    } else {
                    
                        System.out.println("Idade: Idade de Alien!" );
                        System.out.println("Saude: Um Alienigena nao fica doente...");
                        System.out.println("-");
                        System.out.println
                        ("Parabens!!!! "
                        + "Precisamos de um Alien no Exercito e voce foi ESCOLHIDO!");
                        
                    }
                    
                    break;
                    
                default:
                    
                    System.out.println("Candidato de nome: " + nome);
                    System.out.println("Sexo: Nao sabe? Transgenero? Nao-Binario?");
                    System.out.println("Idade: " + idade);
                    System.out.println("Saude: " + saude);
                    System.out.println("-");
                    System.out.println("Que Pena!"
                                + " Voce NAO esta APTO para cumprir "
                                + "o servico militar obrigatorio!");
                                break;
            }
        
        }
        
    }
}
