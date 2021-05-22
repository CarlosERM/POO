
import java.util.Scanner;

public class Terceiro {
  
  public static void main(String args[]) {

    Scanner scn = new Scanner(System.in);

    int numero;

    System.out.println("Digite um número: ");
    numero = scn.nextInt();
    if (numero < 2) {
      int[] fibonacci = new int[2];

      fibonacci[0] = 0;
      fibonacci[1] = 1;

      System.out.println(" O número na posição " + numero + " é " + fibonacci[numero]);
    }

    if (numero > 1) {
      int[] fibonacci = new int[numero];

      fibonacci[0] = 0;
      fibonacci[1] = 1;
      // Existe uma forma melhor de atribuir esses valores?
      for (int i = 2; i < fibonacci.length; i++) {

        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

      }

      System.out.println("Esses são todos os números gerados: ");

      for (int x = 0; x < fibonacci.length; x++) {
        System.out.println(fibonacci[x]);
        // Coloquei isso aqui porque, como o analfabeto que sou, não sei se n-ésima
        // significa imprimir o
        // último ou imprimir todos os números.
      }

      System.out.println(" O número na posição " + numero + " é " + fibonacci[fibonacci.length - 1]);
      // No momento eu não sei nem explicar como isso aqui deu certo.
    }
    scn.close();

  }
}
