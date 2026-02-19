package com.example.Exercicio5.CapGemini;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Descubra sua média do semestre!!!");
        System.out.println("");
        
        System.out.println("Caro aluno, informe seu nome: ");
        String nome = leitor.nextLine();
        
        System.out.println("Vamos... Informe a primeira nota: ");
        double nota1 = leitor.nextDouble();
        
        System.out.println("Agora... Informe a segunda nota: ");
        double nota2 = leitor.nextDouble();
        
        System.out.println("E finalmente... Informe a terceira nota: ");
        double nota3 = leitor.nextDouble();
        
        System.out.println("-------------------------------------------");
        
        double somaNotas = nota1 + nota2 + nota3;
        double mediaNotas = somaNotas / 3;
        
        System.out.println("Caro Aluno, aqui vai sua média: ");
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + mediaNotas);
        
    }
}
