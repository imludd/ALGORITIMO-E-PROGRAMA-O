package com.mycompany.cregressiva;
import java.util.Scanner;

public class CRegressiva {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();

        int soma = 0;

        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
            soma = soma + i;
        }

        System.out.println("\nSoma = " + soma);

        sc.close();
    }
}