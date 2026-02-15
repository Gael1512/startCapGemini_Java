package com.example.Exercicio22.capGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int i = 0;
        float[] precoCusto = new float[40];
        float[] precoVenda = new float[40];
        
        float somaTotalCusto = 0;
        float somaTotalVenda = 0;
        
        Scanner leitorPreco = new Scanner(System.in);
        
        System.out.println("Programa de Precificacao dos Produtos: ");
        System.out.println("");
        
        for(; i < 40; i++){
        
            System.out.println("Informe o Preço de Custo do Produto: ");
            precoCusto[i] = leitorPreco.nextFloat();
            
            System.out.println("Informe o Preço de Venda do Produto: ");
            precoVenda[i] = leitorPreco.nextFloat();
            
            float valorLucro = precoVenda[i] - precoCusto[i];
            
            if(valorLucro > 0){
            
                System.out.println("Este produto te deu LUCRO de: R$ +" + valorLucro);
                
            } else if(valorLucro < 0){
            
                System.out.println("Este produto te deu PREJUIZO de: R$ " + valorLucro);
                
            } else {
            
                System.out.println("Este produto não te deu Lucro nem Prejuizo.");
            
            }
            
            somaTotalCusto = somaTotalCusto + precoCusto[i];
            somaTotalVenda = somaTotalVenda + precoVenda[i];
            
            System.out.println("--------------------------------------------");
        }
        
        System.out.println("--------------------------------------------");
        
        System.out.println("Valores de cada produto: ");
        
        for(i = 0; i < 40; i++){
        
            System.out.println("");
            System.out.println("Produto Nº" + (i + 1));
            System.out.println("Custo: R$ " + precoCusto[i]);
            System.out.println("Venda: R$ " + precoVenda[i]);
            System.out.println("--------------------------------------");
            
        }
        
        float mediaDeCusto = somaTotalCusto/40;
        float mediaDeVenda = somaTotalVenda/40;
        
        System.out.println("A média do valor de CUSTO é: R$ " + mediaDeCusto);
        System.out.println("A média do valor de VENDA é: R$ " + mediaDeVenda);
    }
}
