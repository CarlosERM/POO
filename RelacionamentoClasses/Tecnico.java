package RelacionamentoClasses;

public class Tecnico extends Pessoa{
   private String siape;

   public Tecnico(String nome, String telefone, String cpf, String endereco, String siape) {
      super(nome, telefone, cpf, endereco);
      this.siape = siape;
   }

   public String getSiape() {
      return this.siape;
   }

   public void setSiape(String siape) {
      this.siape = siape;
   }
  

}
