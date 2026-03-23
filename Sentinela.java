package com.mycompany.sentinela;

import java.util.Scanner;

public class Sentinela {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int total = 0;
     int contador = 0;
     System.out.print("Digite um número ou use o 0 para encerrar: ");
     int nota = sc.nextInt();
     while (nota != 0) {
         total += nota;
         contador++;
         
         System.out.print("Informe a nota ou 0 para encerrar: ");
         nota = sc.nextInt ();
         
     }
     if (contador > 0) {
         double media = (double) total / contador;
         System.out.println("\nSoma das notas: " + total);
         System.out.println("Nenhuma nota foi informada ");
  
     }
    }
}
