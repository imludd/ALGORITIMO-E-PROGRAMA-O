package com.mycompany.soma;
import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número N: ");
        int n = sc.nextInt();
        
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma = soma + i;
        }
        System.out.println("A soma de 1 até " + n + " é: " + soma);
        
        sc.close();
    }
}