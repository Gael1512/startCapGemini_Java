package com.example.Exercicio7.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
       Scanner leitor = new Scanner(System.in);
       
        System.out.println("CONVERSOR DE TEMPERATURA! CELSIUS PATA FAHRENHEIT!");
        System.out.println("");
        
        System.out.println("Informe a temperatura em Celsius (Só o número): ");
        float celsius = leitor.nextFloat();
        
        System.out.println("--------------------------------");
        
        float formula = (9.0f * celsius) + 160.0f;
        
        float fahrenheit = formula / 5.0f;
        
        System.out.println("Aqui estão os valores das temperaturas:");
        System.out.println("");
        System.out.println("Celsius: " + celsius + "°C");
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
        
    }
}
