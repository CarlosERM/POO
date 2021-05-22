import java.util.Scanner;

public class Quinto {

  public static void main(String args[]) {
    Scanner scn = new Scanner(System.in);
    int i = 0;

    int total = 0;
    int usuario = 0;
    
    int menor = Integer.MAX_VALUE;
    int maior = Integer.MIN_VALUE;
    
    while (usuario != -1) {
      
      System.out.print("Digite os valores: ");
      usuario = scn.nextInt();
      if(usuario == -1) break;
      if (usuario < menor) menor = usuario;
      if (usuario > maior) maior = usuario;

      total += usuario;
      i++;
    }

    System.out.println("O usuário digitou: " + i + " números.");
    System.out.println("O maior número digitado: " + maior);
    System.out.println("O menor número digitado: " + menor);
    System.out.println("A média dos números digitados: " + (float) total / i);

    scn.close();
  }
}
