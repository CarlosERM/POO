import java.util.Scanner;
public class Main {
  // Eu confesso que fiz isso tudo só para impressionar o professor.
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    Conta conta1 = new Conta();
    Conta conta2 = new Conta();

    boolean repete = true;
    int cpf;
    int decisao;

    float saque;
    float deposito;
    float transferido;

    conta1.nomeCliente = "Chico Anísio";
    conta1.cpf = 111;
    conta1.id = 000;
    conta1.numeroConta = 1;

    conta2.nomeCliente = "Nancy Wanderley";
    conta2.cpf = 000;
    conta2.id = 111;
    conta2.numeroConta = 0;

    System.out.println("-------------------------------------");
    System.out.println("          Banco Strogonoffe          ");
    System.out.println("-------------------------------------");
    
    System.out.println("Qual é o seu CPF? (111 - " + conta1.nomeCliente + " | " + " 000 - " + conta2.nomeCliente + ")");
    cpf = scn.nextInt();
    
    while(repete) {

      if (cpf == 111) {
        
          System.out.println("Bem vindo, " + conta1.nomeCliente + "!");
          System.out.println("O que você deseja fazer?");
          
          System.out.println("-------------------------------------------------");
          System.out.println("1 - Quanto é que ainda tem na minha conta?       ");
          System.out.println("2 - Quero depositar dinheiro na minha conta.     ");
          System.out.println("3 - Preciso sacar dinheiro.                      ");
          System.out.println("4 - Quero transferir meu dinheiro.               ");
          System.out.println("5 - Quero entrar na conta de " + conta2.nomeCliente + ".");
          System.out.println("6 - Quero sair do sistema."                       );
          System.out.println("-------------------------------------------------");

          decisao = scn.nextInt();

          switch (decisao) {
            case 1:
              conta1.mostrarSaldo();
              break;
            
            case 2:
              System.out.println("Quanto você deseja depositar? ");
              deposito = scn.nextFloat();
              conta1.depositar(deposito);
              break;
            
            case 3:
              System.out.println("Quanto você deseja sacar? ");
              saque = scn.nextFloat();
              conta1.sacar(saque);
              break;
            
            case 4:
              System.out.println("Você só pode transferir o seu dinheiro para a Conta de " +conta2.nomeCliente  + ".");
              System.out.println("O sistema é assim pois nosso técnico não sabe fazer algo melhor e não temos mais clientes.");
              System.out.println("Quanto quer transferir?");
              transferido = scn.nextFloat();
              conta1.transferir(conta2, transferido);
              break;
            
            case 5:
              cpf = 000;
              break;
  
            case 6:
              repete = false;
              break;
          }
      }
    
      if (cpf == 000) {
          System.out.println("Bem vinda, " + conta2.nomeCliente + "!");

          System.out.println("O que você deseja fazer?");
          
          System.out.println("-------------------------------------------------");
          System.out.println("1 - Quanto é que ainda tem na minha conta?       ");
          System.out.println("2 - Quero depositar dinheiro na minha conta.     ");
          System.out.println("3 - Preciso sacar dinheiro.                      ");
          System.out.println("4 - Quero transferir meu dinheiro.               ");
          System.out.println("5 - Quero entrar na conta de " + conta1.nomeCliente + ".");
          System.out.println("6 - Quero sair do sistema."                       );
          System.out.println("-------------------------------------------------");

          decisao = scn.nextInt();

          switch (decisao) {
            case 1:
              conta2.mostrarSaldo();
              break;
            
            case 2:
              System.out.println("Quanto você deseja depositar? ");
              deposito = scn.nextFloat();
              conta2.depositar(deposito);
              break;
            
            case 3:
              System.out.println("Quanto você deseja sacar? ");
              saque = scn.nextFloat();
              conta2.sacar(saque);
              break;
            
            case 4:
              System.out.println("Você só pode transferir o seu dinheiro para a Conta de " + conta1.nomeCliente  + ".");
              System.out.println("O sistema é assim pois nosso técnico não sabe fazer algo melhor e não temos mais clientes.");
              System.out.println("Quanto quer transferir?");
              transferido = scn.nextFloat();
              conta2.transferir(conta1, transferido);
              break;
            
            case 5:
              cpf = 111;
              break;
            
            case 6:
              repete = false;
              break;
          }
        }
    }
    System.out.println("Muito Obrigado, volte sempre!");
    scn.close();
  } 
}
