package com.example.Exercicio16.CapGemini;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        //------------------INTERAÇÃO---------------------
        
        System.out.println("Descubra, com sua media, sua situacao escolar: ");
        System.out.println("");
        
        System.out.println("Aluno, Informe seu nome: ");
        String aluno = leitor.nextLine();
        
        System.out.println("Agora, Informe a nota do primeiro trimestre: ");
        double nota1 = leitor.nextDouble();
        
        System.out.println("Agora, Informe a nota do segundo trimestre: ");
        double nota2 = leitor.nextDouble();
        
        System.out.println("Agora, Informe a nota do terceiro trimestre: ");
        double nota3 = leitor.nextDouble();
        
        //------------------INTERAÇÃO------------------------
        
        //-------------------  ||  --------------------------
        
        //------------------RESULTADO------------------------
        
        System.out.println("-------------------------------------------------");
        
        double somaNotas = nota1 + nota2 + nota3;
        double media = somaNotas/3;
        
        System.out.println(aluno + ", sua situação é a seguinte: ");
        System.out.println("");
        
        if(media >= 7){
            System.out.println
        ("PARABENS! Com a media " + media + ", voce esta APROVADO!!!");
        } else if(media <= 5){
            System.out.println
        ("QUE PENA! Com a media " + media + ", voce esta REPROVADO!!!");
        } else {
            System.out.println
        ("AINDA HA ESPERANÇA! Com a media " + media + ", voce esta EM RECUPERAÇAO!!!" );
        }
        
        //------------------RESULTADO-------------------------
        
        
    }
}
