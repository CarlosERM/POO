package RelacionamentoClasses;

import java.util.ArrayList;

public class Escola {
   private String nome;
   private String endereco;
   private ArrayList<Aluno> alunos;
   private ArrayList<Departamento> departamentos;

   public Escola(String nome, String endereco) {
      this.nome = nome;
      this.endereco = endereco;
      this.alunos = new ArrayList<Aluno>();
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getEndereco() {
      return this.endereco;
   }

   public void setEndereco(String endereco) {
      this.endereco = endereco;
   }

   public void addAluno(Aluno aluno){
      this.alunos.add(aluno);
   }

   public void removeAluno(Aluno aluno){
      this.alunos.remove(aluno);
   }

   public void criarDepartamento(String nome){
      Departamento newDepartamento = new Departamento(nome);
      this.departamentos.add(newDepartamento);
   }

   public void removerDepartamento(String nome){
      for(Departamento d : this.departamentos){
         if(d.getNome().equals(nome)){
            this.departamentos.remove(d);
            return;
         }
      }
   }

}
