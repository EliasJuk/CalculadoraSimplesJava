package calculadora;

import java.util.Scanner;

public class Soma {
  public static int soma(){
    System.out.println("\n========== SOMA ============");

    System.out.printf("Digite o Primeiro valor: ");
    Scanner input1 = new Scanner(System.in);
    int valor1 = input1.nextInt();

    System.out.printf("Digite o Segundo valor: ");
    Scanner input2 = new Scanner(System.in);
    int valor2 = input2.nextInt();
    
    int soma =  valor1 + valor2;
    System.out.printf("A Soma entre %d e %d é: %d", valor1, valor2, soma);   

    System.out.printf("\n============================\n\n"); 
    return 0;
  }  
}