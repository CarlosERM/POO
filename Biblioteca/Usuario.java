import java.util.ArrayList;

public abstract class Usuario {

    private String nome = new String("");
    private String telefone = new String("");
    private String email = new String("");
    private String cpf = new String("");

    private ArrayList<Emprestimo> emprestados;

    



    public Usuario(String nome, String telefone, String email, String cpf) {
  
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.emprestados = new ArrayList<Emprestimo>();
    }

    public void escolherLivros(int index, String dataInicio, String dataRetorno, ArrayList<Publicacao> publicacoes) {
        Publicacao publi = publicacoes.get(index);
        publicacoes.remove(index);
        //eu nao planejo nada. Fico amarrando coisa com coisa a cada nova revelação. Um porre.
        registrarEmprestimo(new Emprestimo(dataInicio, dataRetorno, publi));

    }

    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestados.add(emprestimo);
    }

    public void renovarEmprestimo(int index, String dataRetorno) {
        emprestados.get(index).dataInicio =  emprestados.get(index).dataRetorno;
        emprestados.get(index).dataRetorno = dataRetorno;
        emprestados.get(index).renovacao++;
    }

    public double entregarLivro(int index, Biblioteca bibli, String dataRetornoDef) {
        //pra pegar o retorno definitivo
        getEmprestados().get(index).dataRetorno = dataRetornoDef;
        
        Publicacao publiDevolvida = getEmprestados().get(index).emprestada;
        bibli.getPublicacoes().add(publiDevolvida);

        double multa = publiDevolvida.getMulta() * (emprestados.get(index).renovacao - 3);
        emprestados.get(index).renovacao = 0;
        if(multa < 0) {
            multa = 0;
        }

        getEmprestados().remove(index);

        return multa;
    }

    public ArrayList<Emprestimo> getEmprestados() {
        return emprestados;
    }

    public void setEmprestados(ArrayList<Emprestimo> emprestados) {
        this.emprestados = emprestados;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

 


    
}
