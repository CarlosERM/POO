package RelacionamentoClasses;

public class Aluno extends Pessoa{
   private String nroMatricula;
   private Professor orientador;

   public Aluno(String nome, String telefone, String cpf, String endereco, String nroMatricula) {
      super(nome, telefone, cpf, endereco);
      this.nroMatricula = nroMatricula;
      this.orientador = null;
   }

   public Aluno(String nome, String telefone, String cpf, String endereco, String nroMatricula, Professor orientador) {
      super(nome, telefone, cpf, endereco);
      this.nroMatricula = nroMatricula;
      this.orientador = orientador;
   }

   public String getNroMatricula() {
      return this.nroMatricula;
   }

   public void setNroMatricula(String nroMatricula) {
      this.nroMatricula = nroMatricula;
   }


   public Professor getOrientador() {
      return this.orientador;
   }

   public void setOrientador(Professor orientador) {
      this.orientador = orientador;
   }

}
