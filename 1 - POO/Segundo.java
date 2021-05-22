import java.util.Scanner;

public class Segundo {
  public static void main(String args[]) {
  
    Scanner scan = new Scanner(System.in);
    // Na organização do código eu coloco os objetos em cima ou embaixo? Existe
    // alguma convenção sobre isso ou é só frescura?

    int dinheiro = 0;
    int resto = 0;
    int[] notas = new int[4];
    
    System.out.println("Quanto você quer sacar?");
    dinheiro = scan.nextInt();

    if (dinheiro >= 50) {
      notas[0] = dinheiro / 50;
      resto = dinheiro % 50;
    }
    if (resto >= 10) {
      notas[1] = resto / 10;
      resto = resto % 10;
    }
    if (resto >= 5) {
      notas[2] = resto / 5;
      resto = resto % 5;
    }
    notas[3] = resto;

    System.out.println(notas[0] + " nota(s) de R$50,00.");
    System.out.println(notas[1] + " nota(s) de R$10,00.");
    System.out.println(notas[2] + " nota(s) de R$5,00. ");
    System.out.println(notas[3] + " nota(s) de R$1,00. ");
    scan.close();

  }
}
