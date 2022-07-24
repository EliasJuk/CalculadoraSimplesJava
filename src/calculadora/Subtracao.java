package calculadora;

import java.util.Scanner;

public class Subtracao {
  public static int subtracao(){
    System.out.println("\n======= SUBTRAÇÃO =======");
    
    System.out.printf("Digite o Primeiro valor: ");
    Scanner input1 = new Scanner(System.in);
    int valor1 = input1.nextInt();

    System.out.printf("Digite o Segundo valor: ");
    Scanner input2 = new Scanner(System.in);
    int valor2 = input2.nextInt();
    
    int subtracao =  valor1 - valor2;
    System.out.printf("A Subtração entre %d e %d é: %d", valor1, valor2, subtracao);   

    System.out.printf("\n============================\n\n");  
    return 0;
  }  
}