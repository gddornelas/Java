
package com.mycompany.aula20250221;

import java.util.Scanner;


public class Aula20250221 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int operacao = 0;
        
        /**while(operacao != 4){
            System.out.println("-----------------------MENU--------------------------");
            System.out.println("\t\t[0] - soma(+)");
            System.out.println("\t\t[1] - subtração(-)");
            System.out.println("\t\t[2] - multiplicação(x)");
            System.out.println("\t\t[3] - subitração(%)");
            System.out.println("\t\t[4] - sair");
            System.out.println("-----------------------------------------------------");
            System.out.print("\tDigite a operação desejada: ");
            operacao = scan.nextInt();
            switch (operacao){
                case 0:
                    System.out.println("SOMA");
                    break;
                case 1:
                    System.out.println("SUBTRAÇÃO");
                    break;
                case 2:
                    System.out.println("MULTIPLICAÇÃO");
                    break;
                case 3:
                    System.out.println("DIVISÃO");
                    break;
                case 4:
                    System.out.println("SAINDO ...");
                    break;
                default:
                    System.out.println("numero invalido, digite um numero entre 0 e 4 ");
                    break;
            }
        }*/
        
        
        do {
            System.out.println("-----------------------MENU--------------------------");
            System.out.println("\t\t[0] - soma(+)");
            System.out.println("\t\t[1] - subtração(-)");
            System.out.println("\t\t[2] - multiplicação(x)");
            System.out.println("\t\t[3] - Divisão(/)");
            System.out.println("\t\t[4] - sair");
            System.out.println("-----------------------------------------------------");
            System.out.print("\tDigite a operação desejada: ");
            operacao = scan.nextInt();
            int num1 = 0;
            int num2 = 0;
            
            switch (operacao){
                case 0:
                    System.out.print("Digite o primeiro numero da soma: ");
                    num1 = scan.nextInt();
                    System.out.print("Digite o segundo numero da soma: ");
                    num2 = scan.nextInt();
                    System.out.println( num1 + num2);
                    break;
                case 1:
                    System.out.print("Digite o primeiro numero da subtração: ");
                    num1 = scan.nextInt();
                    System.out.print("Digite o segundo numero da subtração: ");
                    num2 = scan.nextInt();
                    System.out.println( num1 - num2);
                    break;
                case 2:
                    System.out.print("Digite o primeiro numero da multiplicação: ");
                    num1 = scan.nextInt();
                    System.out.print("Digite o segundo numero da multiplicação: ");
                    num2 = scan.nextInt();
                    System.out.println( num1 * num2);
                    break;
                case 3:
                    System.out.print("Digite o primeiro numero da divisão: ");
                    num1 = scan.nextInt();
                    System.out.print("Digite o segundo numero da divisão: ");
                    num2 = scan.nextInt();
                    System.out.println( num1 / num2);
                    break;
                case 4:
                    System.out.println("SAINDO ...");
                    break;
                default:
                    System.out.println("numero invalido, digite um numero entre 0 e 4 ");
                    break;
            }
        }
        
        while(operacao != 4);
            
     scan.close();
    }
}
