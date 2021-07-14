 public class Conta  {
  // Você está trabalhando para um banco e precisa implementar uma conta corrente. Para isso é
  // necessário criar uma classe Conta Corrente que possui as informações básicas de uma conta e do
  // seu titular (defina pelo menos 5 atributos). Esta classe também deve conter três métodos básicos:
  // sacar, depositar e transferir.
  // Em todas operações realizadas na conta, o atributo saldo da conta não pode ser negativo! Sempre
  // valide essa informação.
  // Ao final, crie uma classe main para instanciar os objetos Conta e testar a classe criada realizando
  // as operações propostas
  String nomeCliente;
  int cpf;
  int id;
  
  int numeroConta;
  float saldoConta = 200;
//  Cada conta tem no mínimo 200 reais.
  void mostrarSaldo() {
    System.out.println("Você tem R$ " + this.saldoConta);
  }

 void sacar(float valor) {
  if(saldoConta >= valor) {
    this.saldoConta -= valor;
    System.out.println("Você sacou: R$ " + valor + ". Sobraram R$ " + this.saldoConta +" na sua conta.");
  }
  else System.out.println("Hoje não.");

  }

  void depositar(float deposito) {

  this.saldoConta += deposito; 
  System.out.println("Você depositou: R$ " + deposito);
  System.out.println("Você tem: R$ " + this.saldoConta);

  }

 void transferir(Conta objetoTeste, float transferido) {
    if (transferido <= this.saldoConta) {
      this.saldoConta -= transferido;
      objetoTeste.saldoConta += transferido;
      System.out.println("Você transferiu R$ " + transferido + ". Sua transferência foi um sucesso!");
      System.out.println("Sobraram R$ " + this.saldoConta +" na sua conta.");
    } else {
      System.out.println("Hoje não.");
    }
    // Essa aqui foi na intuição. Tentando me lembrar do que eu vi uma vez num curso da Alura.
  }

}