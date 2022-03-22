/*
IMC = peso/(altura * altura)
Implementar um programa que recebe o peso (em kgs) e a altura (em metros) e calcula o
IMC. O programa deve imprimir na tela a Classificação baseado na tabela
 */
package prog3;
import java.util.Scanner;
public class Prog3 {
    
    public static void main(String args[]) {
            
        Scanner my_scan = new Scanner(System.in); //cria Scanner chamado my_scan que receberá valores digitados pelo usuário

        System.out.println("\nOlá, este programa irá calcular seu IMC.");
        
        System.out.println("\nDigite o seu peso em Kg: ");
        double peso = my_scan.nextDouble(); //variável peso recebe o próximo valor do tipo double que for digitado
        
        System.out.println("\nDigite sua altura em metros(Ex.: 1,70): ");
        double altura = my_scan.nextDouble();//variável altura recebe o próximo valor do tipo double que for digitado
      
        double IMC = peso/(altura*altura); //variável IMC recebe o valor de peso dividido por altura ao quadrado. os () dão prioridade à operação
        
        System.out.println("\nSeu IMC e: "+IMC);
        System.out.println("\n");
        if(IMC < 18.5){ //Se o IMC resultante for menor que 18.5 a mensagem abaixo será mostrada, ou seja 1.84 ou menos
            System.out.println("\nVoce esta abaixo do peso!");
    }
        else if(IMC >= 18.5 && IMC <= 24.9){//Se o IMC resultante for maior ou igual a 18.5 E menor ou igual a 24.9 a mensagem abaixo será mostrada
            System.out.println("\nVoce esta com o peso normal!");
        }
        else if(IMC >= 25 && IMC <= 29.9){//Se o IMC resultante for maior ou igual a 25 E menor ou igual a 29.9 a mensagem abaixo será mostrada
            System.out.println("\nVoce esta com sobrepeso!");
        }
        else if(IMC >= 30 && IMC <= 34.9){//Se o IMC resultante for maior ou igual a 30 E menor ou igual a 34.9 a mensagem abaixo será mostrada
            System.out.println("\nVoce esta com obesidade grau I!");
        }
        else if(IMC >= 35 && IMC <= 39.9){//Se o IMC resultante for maior ou igual a 35 E menor ou igual a 39.9 a mensagem abaixo será mostrada
            System.out.println("\nVoce esta com obesidade grau II!");
        }
        else if(IMC >= 40){//Se o IMC resultante for maior ou igual a 40 a mensagem abaixo será mostrada
            System.out.println("\nVoce esta com obesidade grau III ou morbida");
    }
    
}
}
