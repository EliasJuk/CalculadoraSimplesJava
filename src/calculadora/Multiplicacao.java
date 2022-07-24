package calculadora;

import java.util.Scanner;

public class Multiplicacao {
  public static int multiplicacao(){
    System.out.println("\n======= MULTIPLICAÇÃO =======");

    System.out.printf("Digite o Primeiro valor: ");
    Scanner input1 = new Scanner(System.in);
    int valor1 = input1.nextInt();
    
    System.out.printf("Digite o Segundo valor: ");
    Scanner input2 = new Scanner(System.in);
    int valor2 = input2.nextInt();

    int multiplicacao =  valor1 * valor2;
    System.out.printf("A Divisão entre %d e %d é: %d", valor1, valor2, multiplicacao);   

    System.out.printf("\n============================\n\n");  
    return 0;
  }
}