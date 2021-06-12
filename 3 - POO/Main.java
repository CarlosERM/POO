import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Conta> contas = new ArrayList<Conta>();
        int opcao;
        boolean ativa = true;
       
        String nome;
        int cpf;
        int id;

        int nroConta;
        int agencia;

        String nroRua;
        String bairro;
        String cidade;

        System.out.println("///////////////////////////////");
        System.out.println("          Banco LOVE           ");
        System.out.println("   Juros baixos e muito love   ");
        System.out.println("///////////////////////////////");
        System.out.println();

        while(ativa) {
       
            System.out.println("Selecione uma opção:");
        
            System.out.println("1 - Criar uma Conta");
            System.out.println("2 - Exibir o saldo, ou extrato, de uma conta.");
            System.out.println("3 - Sacar de uma conta.");
            System.out.println("4 - Depositar um valor em uma conta.");
            System.out.println("5 - Transferir valores de uma conta para outra");
            System.out.println("6 - Sair");

            System.out.print("Opção: ");
            opcao = scan.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Qual é o seu nome? ");
                    System.out.print("Meu nome é: ");
                    nome = scan.next();
            
                    System.out.println("Qual é o seu CPF? ");
                    System.out.print("Meu CPF é: ");
                    cpf = scan.nextInt();
                
                    System.out.println("Qual é o seu ID? ");
                    System.out.print("Meu ID é: ");
                    id = scan.nextInt();

                    System.out.println("Qual será o número da sua Conta? ");
                    System.out.print("Número da Conta: ");
                    nroConta = scan.nextInt();

                    System.out.println("Qual será a agência da sua Conta? ");
                    System.out.print("Agência: ");
                    agencia = scan.nextInt();
                    
                    // Normalmente isso seria obrigatório, mas o Banco Love não se preocupa com endereços, ele é só love. 
                    System.out.println("Qual o numero da sua rua?(OPCIONAL - DIGITE 0 PARA ENCERRAR) ");
                    System.out.print("Rua: ");
                    nroRua = scan.next();

                    System.out.println("Qual o nome do seu bairro?(OPCIONAL - DIGITE 0 PARA ENCERRAR) ");
                    System.out.print("Endereço(RR Bairro Cidade): ");
                    bairro = scan.next();

                    System.out.println("Qual o nome da sua cidade?(OPCIONAL - DIGITE 0 PARA ENCERRAR) ");
                    System.out.print("Endereço(RR Bairro Cidade): ");
                    cidade = scan.next();
                    // Parece idiota o que eu estou prestes a fazer.
                    if(nroRua.equals("0") && bairro.equals("0") && cidade.equals("0") ) {
                        contas.add(new Conta(nome, cpf, id, nroConta, agencia));

                    } else if (bairro.equals("0") && cidade.equals("0")) {
                        contas.add(new Conta(nome, cpf, id, nroConta, agencia, nroRua));

                    } else if (cidade.equals("0")) {
                        contas.add(new Conta(nome, cpf, id, nroConta, agencia, nroRua,  bairro));
                    } else {
                        contas.add(new Conta(nome, cpf, id, nroConta, agencia, nroRua,  bairro, cidade));
                    }
                    
                    System.out.println(contas.get(0));


                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                System.out.println("Até mais.");
                    ativa = false;
                    break;
            }
        }
        scan.close();
      
    }
}