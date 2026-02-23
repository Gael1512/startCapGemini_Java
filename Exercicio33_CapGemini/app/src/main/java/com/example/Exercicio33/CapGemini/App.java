package com.example.Exercicio33.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        int nivel = 0;
        
        
        System.out.println("Programa de Pagamento // ESCOLA APRENDER");
        System.out.println("");
        
        System.out.println("-----------------------------------------");
        System.out.println("Professor, Informe o seu NOME: ");
        String nome = leitor.nextLine();
        System.out.println("");
        
        System.out.println("Professor " + nome + ", informe quantas horas/aulas por dia: ");
        System.out.println("OBS: 1h = 1 aula");
        int aula = leitor.nextInt();
        System.out.println("");
        
        System.out.println("Professor " + nome + ", informe quantos dias trabalhados neste mes: ");
        int dias = leitor.nextInt();
        
        do{
        
        System.out.println("Professor " + nome + ", informe o seu NIVEL: ");
        System.out.println("1 - NIVEL 1");
        System.out.println("2 - NIVEL 2");
        System.out.println("3 - NIVEL 3");
        nivel = leitor.nextInt();
        
        System.out.println("------------------------------------------");
        
        int nivel1 = 12;
        int nivel2 = 17;
        int nivel3 = 25;
        
        int mes = aula * dias;
        int salario;
        
        switch(nivel){
        
            case 1:
                System.out.println("Aqui esta suas informaçoes: ");
                System.out.println("Nome: " + nome);
                System.out.println("Nivel: " + nivel);
                salario = nivel1 * mes;
                System.out.println("Salario: R$ " + salario);
                break;
                
            case 2:
                System.out.println("Aqui esta suas informaçoes: ");
                System.out.println("Nome: " + nome);
                System.out.println("Nivel: " + nivel);
                salario = nivel2 * mes;
                System.out.println("Salario: R$ " + salario);
                break;
                
            case 3:
                System.out.println("Aqui esta suas informaçoes: ");
                System.out.println("Nome: " + nome);
                System.out.println("Nivel: " + nivel);
                salario = nivel3 * mes;
                System.out.println("Salario: R$ " + salario);
                break;
                
            default: 
                System.err.println("ERRO: ESTA OPÇAO NAO ESTA DISPONIVEL!");
                System.out.println("Professor " + nome + ", tente novamente.");
                System.out.println("-----------------------------------------");
                
        
        }
    } while((nivel < 1) || (nivel > 3));
        
        System.out.println("-");
        System.out.println("FIM DO PROGRAMA!");
        
        
    }
}
