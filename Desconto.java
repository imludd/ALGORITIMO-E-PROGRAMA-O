package com.mycompany.desconto;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valor = sc.nextDouble();

        System.out.println("Digite a categoria 1- Comum, 2- Premium ou 3- Funcionario: ");
        int categoria = sc.nextInt();

        if (categoria == 1) {
            double desconto = valor * 0.05;
            double total = valor - desconto;
            System.out.println("Desconto: " + desconto);
            System.out.println("Total a pagar: " + total);
        } 
        else if (categoria == 2) {
            double desconto = valor * 0.10;
            double total = valor - desconto;
            System.out.println("Desconto: " + desconto);
            System.out.println("Total a pagar: " + total);
        } 
        else if (categoria == 3) {
            double desconto = valor * 0.15;
            double total = valor - desconto;
            System.out.println("Desconto: " + desconto);
            System.out.println("Total a pagar: " + total);
        } 
        else {
            System.out.println("Categoria inválida");
        }

        sc.close();
    }
}