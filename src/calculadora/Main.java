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
          Soma.soma();
          break;
        case 2:
          Subtracao.subtracao();
          break;
        case 3:
          Multiplicacao.multiplicacao();
          break;
        case 4:
          Divisao.divisao();
          break;
        case 5:
          Quadrado.quadrado();
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
}