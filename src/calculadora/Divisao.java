package calculadora;

import java.util.Scanner;

public class Divisao {
  public static int divisao(){
    System.out.println("\n======= DIVISÃO =======");
      
    System.out.printf("Digite o Primeiro valor: ");
    Scanner input1 = new Scanner(System.in);
    int valor1 = input1.nextInt();
    
    System.out.printf("Digite o Segundo valor: ");
    Scanner input2 = new Scanner(System.in);
    int valor2 = input2.nextInt();

    System.out.printf("A Divisão entre %d e %d é: %.2f", valor1, valor2, ((double)valor1 / valor2));   

    System.out.printf("\n============================\n\n");  
    return 0;
  }
}