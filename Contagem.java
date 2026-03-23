package com.mycompany.contagem;
import java.util.Scanner;
        
public class Contagem {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, zero = 0;

        System.out.println("Digite 10 números:");

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n > 0) pos++;
            else if (n < 0) neg++;
            else zero++;
        }

        System.out.println("Positivos: " + pos + " | Negativos: " + neg + " | Zeros: " + zero);
        sc.close();
    }
}
