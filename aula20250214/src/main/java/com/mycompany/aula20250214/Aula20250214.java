package com.mycompany.aula20250214;

import java.util.Scanner;

public class Aula20250214 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("-----------------------MENU--------------------------");
        System.out.println("\t\t[1] - soma(+)");
        System.out.println("\t\t[2] - subtração(-)");
        System.out.println("\t\t[3] - multiplicação(x)");
        System.out.println("\t\t[4] - sulbitração(%)");
        System.out.println("\t\t[5] - sair");
        System.out.println("-----------------------------------------------------");
        System.out.print("\tDigite a operação desejada: ");
        int operacao = scan.nextInt();
        System.out.printf("\tA operação digitata foi: %d \n", operacao);
    }
}
