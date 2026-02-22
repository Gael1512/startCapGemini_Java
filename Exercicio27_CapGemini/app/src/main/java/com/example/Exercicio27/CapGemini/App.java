package com.example.Exercicio27.CapGemini;
import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        //Random gerador = new Random(); // USADO PARA TESTE
        int combustivel;
        float valorCompra = 1;
        
        
        System.out.println("CARANGO: Onde o seu carro cabe no seu bolso!");
        System.out.println("");
        
        while(valorCompra != 0){
        
        System.out.println("------------------------------------------------");
        System.out.println("Informe o carro desejado: ");
        String carro = leitor.next();
        
        
        System.out.println("Informe o combustivel do carro desejado: ");
        System.out.println("0 - Gasolina");
        System.out.println("1 - Alcool");
        System.out.println("2 - Diesel");
        combustivel = leitor.nextInt();
        //combustivel = gerador.nextInt(3); //USADO PARA TESTE
        
        if((combustivel < 0) || (combustivel > 2) ){
            
            System.err.println("ERRO: ESTA OPCAO NAO EH VALIDA!!!");
            valorCompra = 0;
            
        } else {
        
        
            System.out.println("Informe o valor do veiculo: ");
            valorCompra = leitor.nextFloat();

            //valorCompra = gerador.nextFloat(500001) + 100000; //USADO PARA TESTE

            System.out.println("----------------------------------------------");

            float gasolina = 21.0f/100.0f;
            float alcool = 25.0f/100.0f;
            float diesel = 14.0f/100.0f;

            float valorVenda;

            if(valorCompra == 0){

                System.err.println("ENCERRANDO O PROGRAMA...");

            } else {

                switch(combustivel){

                    case 0:
                        System.out.println("Carro selecionado: " + carro);
                        System.out.println("Tipo de combustivel: Gasolina");
                        System.out.println("Desconto: 21%");

                        valorVenda = valorCompra - (valorCompra * gasolina);

                        System.out.println("Valor Base: R$ " + valorCompra);
                        System.out.println("VALOR COM DESCONTO: R$ " + valorVenda);

                        break;

                    case 1:
                        System.out.println("Carro selecionado: " + carro);
                        System.out.println("Tipo de combustivel: Alcool");
                        System.out.println("Desconto: 25%");

                        valorVenda = valorCompra - (valorCompra * alcool);

                        System.out.println("Valor Base: R$ " + valorCompra);
                        System.out.println("VALOR COM DESCONTO: R$ " + valorVenda);

                        break;

                    case 2:
                        System.out.println("Carro selecionado: " + carro);
                        System.out.println("Tipo de combustivel: Diesel");
                        System.out.println("Desconto: 14%");

                        valorVenda = valorCompra - (valorCompra * diesel);

                        System.out.println("Valor Base: R$ " + valorCompra);
                        System.out.println("VALOR COM DESCONTO: R$ " + valorVenda);

                        break;


                    default:
                        System.err.println("ERRO: ESTA OPCAO NAO E VALIDA!");
                        break;

                }
            }
            
        }
        
      }
        
    }
}
