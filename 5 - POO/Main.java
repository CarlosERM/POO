import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<Conta>();
        PessoaJuridica pessoaJuri = null;
        PessoaFisica pessoaFis = null;

        int opt, chave = 0, nro=0, nroConta, nro1, nro2;
        String pessoa, cpf, cnpj, nome;

        float saldo, valor;
        System.out.println("-----------------------");
        System.out.println("          BANCO        ");
        System.out.println("-----------------------");
        while(true) {
        
            System.out.println("----------------------------");
            System.out.println("1 - CRIAR CONTA.");
            System.out.println("2 - DEPOSITAR.");
            System.out.println("3 - SACAR.");
            System.out.println("4 - TRANSFERIR.");
            System.out.println("5 - LISTAR TODAS AS CONTAS.");
            System.out.println("6 - SAIR.");
            System.out.println("----------------------------");
            opt = scan.nextInt();

            if(opt == 1) {

                chave = 1;
                System.out.println("--------------------------");
                System.out.println("           CONTA          ");
                System.out.println("--------------------------");

                System.out.print("FÍSICA OU JURÍDICA?(F ou J) ");
                pessoa = scan.next();
            
                System.out.print("Digite o seu nome: ");
                nome = scan.next();
                
                if (pessoa.equals("F")) {

                    System.out.print("Digite o seu CPF: ");
                    cpf = scan.next();

                    pessoaFis = new PessoaFisica(nome, cpf);

                } else if (pessoa.equals("J")) {

                    System.out.print("Digite o seu CNPJ: ");
                    cnpj = scan.next();

                    pessoaJuri = new PessoaJuridica(nome, cnpj);

                } else  {

                    System.out.println("PESSOA INVÁLIDA.");
                    continue;

                }
                System.out.println("QUAL O NÚMERO DA SUA CONTA?");
                nroConta = scan.nextInt();

                System.out.println("QUAL SEU SALDO INICIAL?");
                saldo = scan.nextFloat();

                

                if(pessoa.equals("F")) {
                    System.out.println("------------------------------");
                    System.out.println("   SELECIONE O TIPO DE CONTA  ");
                    System.out.println("------------------------------");

                    System.out.println("1 - CONTA CORRENTE");
                    System.out.println("2 - CONTA ESPECIAL");
                    System.out.println("3 - CONTA POUPANÇA");

                    System.out.print("DIGITE: ");

                    opt = scan.nextInt();

                    if(opt == 1) {

                        System.out.println("--------------------------");
                        System.out.println("      CONTA CORRENTE      ");
                        System.out.println("--------------------------");

                        contas.add(new ContaCorrente(pessoaFis, nroConta, saldo));
                        System.out.println("Conta criada com sucesso!!!");

                    } else if(opt == 2) {

                        System.out.println("--------------------------");
                        System.out.println("      CONTA ESPECIAL      ");
                        System.out.println("--------------------------");

                        contas.add(new ContaEspecial(pessoaFis, nroConta, saldo, true));
                        System.out.println("Conta criada com sucesso!!!");


                    } else if(opt == 3) {

                        System.out.println("--------------------------");
                        System.out.println("      CONTA POUPANÇA      ");
                        System.out.println("--------------------------");

                        contas.add(new ContaPoupanca(pessoaFis, nroConta, saldo));
                        System.out.println("Conta criada com sucesso!!!");

                    } 

                  
              
                } else if(pessoa.equals("J")) {

                    System.out.println("-----------------------------");
                    System.out.println("       CONTA EMPRESARIAL     ");
                    System.out.println("-----------------------------");

                    contas.add(new ContaEmpresarial(pessoaJuri, nroConta, saldo));
                    System.out.println("Conta criada com sucesso!!!");

                }
            

            } else if (opt == 2) {
                if(chave!=1) {
                    System.out.println("CRIE UMA CONTA PARA PROSSEGUIR.");
                } else {
                    System.out.println("--------------------------");
                    System.out.println("          DEPOSITO        ");
                    System.out.println("--------------------------");

                    System.out.print("Digite o número da conta de Depósito: ");
                    nroConta = scan.nextInt();


                    System.out.print("Valor que será depositado na Conta " + nroConta + ":");
                    valor = scan.nextFloat();


                    try{
                        if(contas.get(nroConta-1).getNroConta() == nroConta) {
                            if (contas.get(nroConta-1).depositar(valor)) {
                                System.out.println("\nDepósito realizado com sucesso!!!");
                            } else {
                                System.out.println("\nO DEPÓSITO FALHOU!!!");
                            }

                        }

                        System.out.println("---------------------------------------------");
                        System.out.print("\nItem: " + nroConta);
                        System.out.println(contas.get(nroConta-1).toString());
                        System.out.println("---------------------------------------------");

                    } catch(Exception e) {
                        System.out.println("CONTA NÃO ENCONTRADA.");
                    }
                }

            } else if (opt==3) {
                if(chave!=1) {
                    System.out.println("CRIE UMA CONTA PARA PROSSEGUIR.");
                } else {

                    System.out.println("--------------------------");
                    System.out.println("           SACAR          ");
                    System.out.println("--------------------------");

                    
                    System.out.print("Digite o número da conta de Saque: ");
                    nro = scan.nextInt();

                    System.out.print("Valor que será sacado na Conta é " + nro + ":");
                    valor = scan.nextFloat();
                    try {
                        if(contas.get(nro-1).getNroConta() == nro) {
                            //identifica se é especial ou não.
                            if(contas.get(nro-1).isIdentificador()) {
                                if (contas.get(nro-1).sacar1(valor)) {
                                    System.out.println("Saque realizado com sucesso!!!");
                                } else {
                                    System.out.println("O SAQUE FALHOU!!!");
                                    System.out.println("SEU LIMITE NÃO É TÃO GRANDE ASSIM");
                                }
                            }  else if (contas.get(nro-1).sacar(valor)) {
                                System.out.println("Saque realizado com sucesso!!!");
                            } else {
                                System.out.println("O SAQUE FALHOU!!!");
                            }
                            System.out.println("---------------------------------------------");
                            System.out.print("\nItem: " + nro);
                            System.out.println(contas.get(nro-1).toString());
                            System.out.println("---------------------------------------------");
                        }
                    } catch(Exception e) {
                        System.out.println("CONTA NÃO ENCONTRADA.");
                    }

                }
            } else if (opt==4) {
                if(chave!=1) {
                    System.out.println("CRIE UMA CONTA PARA PROSSEGUIR.");
                } else {

                    System.out.println("-------------------------------");
                    System.out.println("           TRANSFERIR          ");
                    System.out.println("-------------------------------");

                    System.out.print("Digite o número da 1ª Conta: ");
                    nro1 = scan.nextInt();

                    System.out.print("Digite o número da 2ª Conta: ");
                    nro2 = scan.nextInt();

                    System.out.print("Quanto você quer retirar da 1ª Conta e depositar na 2ª Conta?");
                    valor = scan.nextFloat();

                   
                   
                    //identifica se é especial ou não.
                    try {
                        Conta c1 = contas.get(nro1-1);
                        Conta c2 = contas.get(nro2-1);
                        if(c1.isIdentificador()) {
                            if (c1.sacar1(valor)) {
                                System.out.println("Transferência realizada com sucesso!!!");
                                c2.depositar(valor);
        
                            } else {
                                System.out.println("A TRANSFERÊNCIA FALHOU!!!");
                                System.out.println("SEU LIMITE NÃO É TÃO GRANDE ASSIM");
                            }
                        } else if (c1.sacar(valor)) {
                                System.out.println("Transferência realizada com sucesso!!!");
                                c2.depositar(valor);
                        } else {
                            System.out.println("A TRANSFERÊNCIA FALHOU!!!");
                        }
                    } catch(Exception e) {
                        System.out.println("CONTA INEXISTENTE");
                        continue;
                    }
                    
                }
                
            } else if (opt==5) {
                if(chave!=1) {
                    System.out.println("CRIE UMA CONTA PARA PROSSEGUIR.");
                } else {
                    for(int x = 0; x < contas.size(); x++) {
                        System.out.println("---------------------------------------------");
                        System.out.print("\nItem: " + (x + 1));
                        System.out.println(contas.get(x).toString());
                        System.out.println("---------------------------------------------");
                    }
                }
               
            } else if (opt==6) {
                System.out.println("ATÉ MAIS.");
                break;
            }
        }
        scan.close();

    }
  
}