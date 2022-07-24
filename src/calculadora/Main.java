package calculadora;

import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    operacao();
  }

  public static void operacao(){
    int opcao = 1;

    while(opcao != 0){
      System.out.printf("O QUE DESEJA FAZER\n");
      System.out.println("1 - SOMA");
      System.out.println("2 - SUBTRAÇÃO");
      System.out.println("3 - MULTIPLICAÇÃO");
      System.out.println("4 - DIVISÃO");
      System.out.println("5 - QUADRADO");
      System.out.println("0 - SAIR");

      System.out.printf("Escolha uma opção: ");
      
      Scanner in = new Scanner(System.in);
      opcao = in.nextInt();

      switch (opcao) {
        case 1:
          soma();
          break;
        case 2:
          subtracao();
          break;
        case 3:
          multiplicacao();
          break;
        case 4:
          divisao();
          break;
        case 5:
          quadrado();
          break;
        case 0:
          System.out.println("\n========== FIM ============");
          break;
        default:
          System.out.println("\n========== Opção Invalida ==========\n");
          break;
      }
    }
  }

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