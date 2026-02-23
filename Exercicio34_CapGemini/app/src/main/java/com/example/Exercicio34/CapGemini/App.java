package com.example.Exercicio34.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Programa de Turmas de Nataçao!");
        System.out.println("");
        System.out.println("----------------------------------");
        
        System.out.println("Por favor, informe o seu NOME: ");
        String nome = leitor.nextLine();
        
        System.out.println("");
        
        System.out.println(nome + ", informe agora sua IDADE: ");
        int idade = leitor.nextInt();
        
        System.out.println("");
        
        System.out.println("---------------------------------------");
        
        if((idade < 5) || (idade > 25)){
            
            System.out.println("Idade fora da faixa etaria! Nao participa.");
            
            
        } else {
        
            if((idade >= 5) && (idade <= 7)){
            
                System.out.println(nome + ", voce se encaixa na turma: Infantil A");
                
            } else if((idade >= 8) && (idade <= 10)){
            
                System.out.println(nome + ", voce se encaixa na turma: Infantil B");
                
            } else if ((idade >= 11) && (idade <= 13)){
            
                System.out.println(nome + ", voce se encaixa na turma: Juvenil A");
            
            } else if((idade >= 14) && (idade <= 17)){
            
                System.out.println(nome + ", voce se encaixa na turma: Juvenil B");
            
            } else {
            
                System.out.println(nome + ", voce se encaixa na turma: Senior");
            
            }
            
        }
        
        System.out.println("-");
        System.out.println("FIM DO PROGRAMA!");
        
    }
}
