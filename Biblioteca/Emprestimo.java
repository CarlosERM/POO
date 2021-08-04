public class Emprestimo {
    String dataInicio;
    String dataRetorno;
    Publicacao emprestada;

    //dor de cabeça. É pra garantir que o empréstimo não seja resetado globalmente, mas sim só no livro que foi devolvido. 
    int renovacao = 0;
  

    public Emprestimo(String dataInicio, String dataRetorno, Publicacao emprestada) {
        this.dataInicio = dataInicio;
        this.dataRetorno = dataRetorno;
        this.emprestada = emprestada;

    }

    
    @Override
    public String toString() {
        return "\nData Início: " + this.dataInicio + "\nData de Retorno: " + dataRetorno +"\nRenovação: " + this.renovacao + "\nDescrição da Publicação: " + emprestada.toString();
    }
  
}
