package com.mycompany.mavenproject1;

import java.util.Scanner;
    
public class Mavenproject1 {

    public static void main(String[] args) {
      Scanner resultado = new Scanner(System.in);
      int nota;
    
      System.out.print("Digite uma nota de 0 a 100: ");
      nota = resultado.nextInt();
      while (nota<0 || nota>100){
      System.out.println("Nota Invalida!! Tente outra vez. ");
      System.out.print("Digite uma notra entre 0 e 100: ");
      nota=resultado.nextInt();
    }
      System.out.println("O valor da nota é: " +nota);
      resultado.close();
    
    }
}
