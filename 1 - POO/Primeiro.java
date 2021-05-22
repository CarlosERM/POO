import java.util.Scanner;

public class Primeiro {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o preço da Gasolina: ");
    float gasolina = scan.nextFloat();

    System.out.println("Digite o preço do Etanol: ");
    float etanol = scan.nextFloat();

    float razao = etanol / gasolina;

    System.out.println(razao <= 0.7 ? "Abasteça com etanol." : "Abasteça com gasolina");
    scan.close();
  }
}