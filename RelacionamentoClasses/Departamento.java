package RelacionamentoClasses;

import java.util.ArrayList;

public class Departamento {
   private String nome;
   private ArrayList<Professor> professores;

   public Departamento(String nome) {
      this.nome = nome;
      this.professores = new ArrayList<Professor>();
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public void addProfessor(Professor professor){
      this.professores.add(professor);
   }

   public void removeProfessor(Professor professor){
      this.professores.remove(professor);
   }

}
