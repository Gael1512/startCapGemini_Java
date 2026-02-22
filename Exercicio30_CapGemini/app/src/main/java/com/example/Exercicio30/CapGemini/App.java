package com.example.Exercicio30.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Sistema de organizaçao de numeros (ORDEM CRESCENTE): ");
        System.out.println("");
        
        System.out.println("----------------------------------------------------");
        System.out.println("Informe o primeiro numero: ");
        int numero1 = leitor.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        int numero2 = leitor.nextInt();
        
        System.out.println("Informe o terceiro numero: ");
        int numero3 = leitor.nextInt();
        
        System.out.println("-------------------------------------------------");
        
        


          if(numero1 > numero2){
          
              if(numero2 > numero3){
                  
                  System.out.println("Aqui está a ordem dos numeros: ");
                  System.out.println(numero3 + " > " + numero2 + " > " + numero1);
                  
              } else if(numero2 < numero3){
              
                  System.out.println("Aqui está a ordem dos numeros: ");
                  System.out.println(numero2 + " > " + numero3 + " > " + numero1);
                  
              } else {
              
                  System.out.println("Aqui está a ordem dos numeros: ");
                  System.out.println(numero3 + " = " + numero2 + " > " + numero1);
                  
              }
          
          } else if(numero1 < numero2){
          
              if(numero2 > numero3){
                  
                  System.out.println("Aqui está a ordem dos numeros: ");
                  System.out.println(numero1 + " > " + numero3 + " > " + numero2);
                  
              } else if(numero2 < numero3){
              
                  System.out.println("Aqui está a ordem dos numeros: ");
                  System.out.println(numero1 + " > " + numero2 + " > " + numero3);
                  
              } else {
              
                  System.out.println("Aqui está a ordem dos numeros: ");
                  System.out.println(numero1 + " > " + numero3 + " = " + numero1);
                  
              }
          
          } else {
          
              if(numero2 > numero3){
                  
                  System.out.println("Aqui está a ordem dos numeros: ");
                  System.out.println(numero3 + " > " + numero1 + " = " + numero3);
                  
              } else if(numero2 < numero3){
              
                  System.out.println("Aqui está a ordem dos numeros: ");
                  System.out.println(numero1 + " = " + numero2 + " > " + numero3);
                  
              } else {
              
                  System.out.println("Aqui está a ordem dos numeros: ");
                  System.out.println(numero2 + " = " + numero3+ " = " + numero1);
                  
              }
          
          }
          
          System.out.println("-------------------------------------------");
          System.out.println("FIM DO PROGRAMA!");
        
    }
}
