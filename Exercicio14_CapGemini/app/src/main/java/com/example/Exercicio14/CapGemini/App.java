package com.example.Exercicio14.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Descubra qual o numero inteiro é maior: X ou Y ?");
        System.out.println("");
        System.out.println("Insira o valor do numero X: ");
        int x = leitor.nextInt();
        System.out.println("Insira o valor do numero Y: ");
        int y = leitor.nextInt();
        
        System.out.println("----------------------------------------");
        
        if(x > y){
            System.out.println
        ("O numero " + x + " é MAIOR que o numero " + y + ". Logo: X > Y");
        } else if(x < y){
            System.out.println
        ("O numero " + x + " é MENOR que o numero " + y + ". Logo: X < Y");
        }
        
    }
}
