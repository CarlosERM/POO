package ContaClass;
public class Principal {
   public static void main(String[] args) {
      
      Conta c1 = new Conta(12345, 123, "Marcel", "222.222.222-22");

      c1.extrato();

      if(c1.depositar(1000)){
         System.out.println("Deposito realizado com sucesso!");
      }else{
         System.out.println("Erro ao realizar o deposito");
      }
      c1.extrato();

      
      if(c1.sacar(500)){
         System.out.println("Saque realizado com sucesso!");
      }else{
         System.out.println("Erro ao realizar o saque");
      }
      c1.extrato();

      if(c1.sacar(600)){//Erro - saldo insuficiente
         System.out.println("Saque realizado com sucesso!");
      }else{
         System.out.println("Erro ao realizar o saque");
      }

      //c1.saldo = c1.saldo - 600;
      c1.extrato();



      Conta c2 = new Conta(56789, 123, "Cabron", "234.343.343-44");

      c2.extrato();


      if(c1.transferir(500, c2)){
         System.out.println("Tranferência realizada com sucesso");
      }else{
         System.out.println("Erro ao realizar a transferencia");
      }

      c1.extrato();
      c2.extrato();

      if(c2.sacar(500)){
         System.out.println("Saque realizado com sucesso!");
      }else{
         System.out.println("Erro ao realizar o saque");
      }
      c2.extrato();
   }
}
