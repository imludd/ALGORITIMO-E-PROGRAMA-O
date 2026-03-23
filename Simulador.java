package com.mycompany.simulador;

import java.util.Scanner;

public class Simulador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0;
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\nSaldo: " + saldo + " | 1-Depositar 2-Sacar 3- Ver saldo 4-Sair");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Qual o valor? ");
                double valor = sc.nextDouble();
                if (valor > 0) saldo += valor;
            } 
            else if (opcao == 2) {
                System.out.print("Qual o valor? ");
                double valor = sc.nextDouble();
                if (valor > 0 && valor <= saldo) saldo -= valor;
                else System.out.println("Saldo invalido ou Saldo insuficiente!");
            } 
            else if (opcao == 3) {
                System.out.println("Saldo atual: " + saldo);
            }
        }

        System.out.println("Saldo final: " + saldo);
    }
}
    