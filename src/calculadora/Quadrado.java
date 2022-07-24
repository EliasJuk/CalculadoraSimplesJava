package calculadora;

import java.util.Scanner;

public class Quadrado {
  public static int quadrado(){
    System.out.println("\n======= Quadrado =======");
    System.out.printf("Digite um valor: ");
    Scanner input = new Scanner(System.in);
    int valor = input.nextInt();

    int quadrado = valor * valor;
    System.out.printf("O Quadrado de %d é: %d", valor, quadrado);

    System.out.printf("\n============================\n\n"); 
    return 0;
  }
}