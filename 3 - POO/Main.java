import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Conta> listaContas = new ArrayList<Conta>();

        Conta conta, conta1Trans = new Conta(0, 0, 0, null), conta2Trans;
        
        Cliente cliente;
        Scanner scan = new Scanner(System.in);
        
        int opcao, opcaoOpt;
        boolean auxiliarPesquisa = false, ativa = true;
        
       
        String nome;
        int id, cpf;

        int nroConta, agencia;
        float depositoInicial, saque, deposito, valorTrans=0;

        String nroRua, bairro, cidade;

        System.out.println("-------------------------------");
        System.out.println("          Banco LOVE           ");
        System.out.println("   Juros baixos e muito love   ");
        System.out.println("-------------------------------");
        System.out.println();

        while(ativa) {
            System.out.println("--------------------------------------------------");

            System.out.println("Selecione uma opção:");
        
            System.out.println("1 - Criar uma Conta");
            System.out.println("2 - Exibir o saldo, ou extrato, de uma conta.");
            System.out.println("3 - Sacar de uma conta.");
            System.out.println("4 - Depositar um valor em uma conta.");
            System.out.println("5 - Transferir valores de uma conta para outra");
            System.out.println("6 - Sair");
            System.out.println("--------------------------------------------------");

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
                    
                    System.out.println("Quanto dinheiro você quer depositar inicialmente?");
                    System.out.print("R$ ");
                    depositoInicial = scan.nextFloat();

                    // Normalmente isso seria obrigatório, mas o Banco Love não se preocupa com endereços, ele é só love. 
                    System.out.println("Você deseja adicionar as informações opcionais? (1 - Sim, 2 - Não)");
                    opcaoOpt = scan.nextInt();

                    if (opcaoOpt == 1) {
                        System.out.println("Qual o numero da sua rua?");
                        System.out.print("Rua: ");
                        nroRua = scan.next();
    
                        System.out.println("Qual o nome do seu bairro?");
                        System.out.print("Endereço(RR Bairro Cidade): ");
                        bairro = scan.next();
    
                        System.out.println("Qual o nome da sua cidade?");
                        System.out.print("Endereço(RR Bairro Cidade): ");
                        cidade = scan.next();

                        cliente = new Cliente(nome,  cpf,  id,  nroRua,  bairro,  cidade);
                        conta = new Conta( nroConta,  agencia, depositoInicial, cliente);
                        
                        listaContas.add(conta);
                        
                        System.out.println("Conta criada com sucesso!!!");
                    
                    } else if (opcaoOpt == 2){
                        cliente = new Cliente(nome,  cpf,  id);
                        conta = new Conta( nroConta,  agencia, depositoInicial, cliente);
                       
                        listaContas.add(conta);
                       
                        System.out.println("Conta criada com sucesso!!!");

                    } else {
                        System.out.println("Opção inválida.");
                    }
                    break;
                case 2:

                    System.out.println("-------------------------------");
                    System.out.println("              SALDO            ");
                    System.out.println("-------------------------------");
                    System.out.println("Qual o número da Conta? ");

                    nroConta = scan.nextInt();
                    // LOCALIZAR O SALDO DA CONTA DIGITADA

                    for (Conta x : listaContas) {
                        // ISSO AQUI SE REPETE MUITO, MAS NÃO SEI COMO USAR ELE DE MODO INTELIGENTE. PERDÃO.
                        if (x.getNroConta() == nroConta) {
                            System.out.println("-------------------------------");
                            System.out.println("Número da Conta: " + x.getNroConta());
                            System.out.println("Nome do Usuário: " + x.getCliente().getNome());
                            System.out.println("Saldo: R$ " + x.getSaldo());
                            System.out.println("-------------------------------");
                            auxiliarPesquisa = true;
                        }
                        
                    }
                    // Aqui é o seguinte, todo valor diferente de true vai ativar esse if aqui. Bagunçado, né? Ainda bem que o meu eu do futuro é que vai ter que lidar com isso.
                    if (!auxiliarPesquisa) System.out.println("Conta não encontrada");
                    auxiliarPesquisa = false; 
                    // resetando a variável.
                    break;
                case 3:
                    System.out.println("-------------------------------");
                    System.out.println("              SACAR            ");
                    System.out.println("-------------------------------");
                    System.out.println("Qual o número da Conta? ");
                    
                    nroConta = scan.nextInt();

                    for (Conta x : listaContas) {
                        if (x.getNroConta() == nroConta) {
                            System.out.println("-------------------------------");
                            System.out.print("Quero sacar: ");
                            
                            saque = scan.nextFloat();
                            
                            System.out.println();
                            System.out.println("-------------------------------");

                            if (x.sacar(saque)) System.out.println("Saque efetuado com sucesso.");
                            else System.out.println("Saque não efetuado.");
                            auxiliarPesquisa = true;

                        }
                    }
                    if (!auxiliarPesquisa) System.out.println("Conta não encontrada");
                    auxiliarPesquisa = false; 

                    break;
                case 4:
                    System.out.println("-----------------------------------");
                    System.out.println("              DEPOSITAR            ");
                    System.out.println("-----------------------------------");
                    System.out.println("Qual o número da Conta? ");
                    nroConta = scan.nextInt();
                    for (Conta x : listaContas) {
                        if (x.getNroConta() == nroConta) {
                            System.out.println("-------------------------------");
                            System.out.print("Quero depositar: ");
                            
                            deposito = scan.nextFloat();
                            System.out.println();
                            System.out.println("-------------------------------");

                            if (x.depositar(deposito)) System.out.println("Depósito efetuado com sucesso.");
                            else System.out.println("Depósito não efetuado.");

                            auxiliarPesquisa = true;
                        }   
                        
                    }
                    if (!auxiliarPesquisa) System.out.println("Conta não encontrada");
                    auxiliarPesquisa = false; 
                    break;
                case 5:
                    System.out.println("------------------------------------");
                    System.out.println("              TRANSFERIR            ");
                    System.out.println("------------------------------------");
                    System.out.println("Qual o número da Conta de onde o dinheiro vai sair ?");

                    nroConta = scan.nextInt();

                    for (Conta x : listaContas) {
                        if (x.getNroConta() == nroConta) {
                            conta1Trans = x;
                            System.out.println("------------------------------------");
                            System.out.print("Quero transferir: R$ ");
                            valorTrans = scan.nextFloat();
                            System.out.println("\n------------------------------------");
                            auxiliarPesquisa = true;

                        }   
                        
                    }
                    if (!auxiliarPesquisa) {
                        System.out.println("Conta não encontrada");
                        break;
                    } 
                    auxiliarPesquisa = false; 

                    System.out.println("Qual o número da  Conta que vai receber o dinheiro?");
                    nroConta = scan.nextInt();
                    
                    for (Conta x : listaContas) {
                        if (x.getNroConta() == nroConta) {
                            conta2Trans = x;

                            if(x.transferir(valorTrans, conta1Trans, conta2Trans)) {
                                System.out.println("Transferência efetuada com sucesso.");
                            } else {
                                System.out.println("Transferência não efetuada.");
                            }

                            auxiliarPesquisa = true;
                        }   
                        
                    }
                    if (!auxiliarPesquisa) {
                        System.out.println("Conta não encontrada");
                        break;
                    }
                    auxiliarPesquisa = false;
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