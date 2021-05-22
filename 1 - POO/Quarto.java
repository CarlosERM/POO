import java.util.Scanner;

public class Quarto {



  public static void main(String args[]) {

    Scanner scn = new Scanner(System.in);

    int[] vetorOriginal = new int[10];
    int[] vetorInvertido = new int[10];

    int num = 0;

    while (num < 10) {

      System.out.println("Digite o " + (num + 1) + "º valor: ");
      vetorOriginal[num] = scn.nextInt();
      vetorInvertido[9 - num] = vetorOriginal[num];
      // Nesse exato momento eu estou me achando por ter encontrado essa solução.
      num++;
    }
    System.out.println("Valores do Vetor Original.");
    for (int i = 0; i < 10; i++) {
      System.out.println(vetorOriginal[i]);
    }
    System.out.println("Valores do Vetor Invertido.");

    for (int z = 0; z < 10; z++) {
      System.out.println(vetorInvertido[z]);
    }
    scn.close();
  }
}

