package com.example.Exercicio28.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Sistema de Reajuste de Salario da A EMPRESA.");
        System.out.println("");
        
        //float salarioMinimo = 1621.0f;
        float folhaNova = 0.0f;
        
       for(int i = 0; i < 584; i++){
           
            System.out.println("----------------------------------------");
            System.out.println("Informe seu nome: ");
            String nome = leitor.next();

            System.out.println("Informe quanto você recebe: ");
            float salario = leitor.nextFloat();
            
            System.out.println("Informe o valor do salario minimo: ");
            float salarioMinimo = leitor.nextFloat();

            System.out.println("-------------------------------------------");

            float cinquenta = 50.0f/100.0f;
            float vinte = 20.0f/100.0f;
            float quinze = 15.0f/100.0f;
            float dez = 10.0f/100.0f;

            float ajuste = 0.0f;

            if(salario < (3 * salarioMinimo)){

                System.out.println("Nome: " + nome);
                System.out.println("Salario antigo: R$ " + salario);
                System.out.println("Reajuste: 50%");
                ajuste = salario + (salario * cinquenta);
                System.out.println("Novo salario: R$ " + ajuste);

            } else if((salario >= (3 * salarioMinimo)) || (salario <= (10 * salarioMinimo))){

                System.out.println("Nome: " + nome);
                System.out.println("Salario antigo: R$ " + salario);
                System.out.println("Reajuste: 20%");
                ajuste = salario + (salario * vinte);
                System.out.println("Novo salario: R$ " + ajuste);

            } else if((salario > (10 * salarioMinimo)) || (salario <= (20 * salarioMinimo))){

                System.out.println("Nome: " + nome);
                System.out.println("Salario antigo: R$ " + salario);
                System.out.println("Reajuste: 15%");
                ajuste = salario + (salario * quinze);
                System.out.println("Novo salario: R$ " + ajuste);

            } else {

                System.out.println("Nome: " + nome);
                System.out.println("Salario antigo: R$ " + salario);
                System.out.println("Reajuste: 10%");
                ajuste = salario + (salario * dez);
                System.out.println("Novo salario: R$ " + ajuste);

            }
            
            float diferencaSalario = ajuste - salario;
            
             
            folhaNova = folhaNova + diferencaSalario;
            
            System.out.println("Aumento na folha de pagamento: +" + folhaNova);
        }
        
        
        
        
    }
}
