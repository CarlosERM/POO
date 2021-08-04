public class UsuarioNormal extends Usuario{
    private Emprestimo[] emprestadosLim;
    int contaConta;


    

    public UsuarioNormal(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf);
        this.emprestadosLim = new Emprestimo[3];
        this.contaConta = 0;
    }

    @Override
    public void registrarEmprestimo(Emprestimo emprestimo) {
        if(contaConta <3) {
            emprestadosLim[contaConta++] = emprestimo;
        }
    }

    @Override
    public void renovarEmprestimo(int index, String dataRetorno) {
        emprestadosLim[index].dataInicio =  emprestadosLim[index].dataRetorno;
        emprestadosLim[index].dataRetorno = dataRetorno;
        emprestadosLim[index].renovacao++;
    }

    @Override
    public double entregarLivro(int index, Biblioteca bibli, String dataRetornoDef) {
        emprestadosLim[index].dataRetorno = dataRetornoDef;
        Publicacao publiDevolvida = emprestadosLim[index].emprestada;

        bibli.getPublicacoes().add(publiDevolvida);
        double multa = publiDevolvida.getMulta() * (emprestadosLim[index].renovacao - 3);
        emprestadosLim[index].renovacao = 0;
        if(multa < 0) {
            multa = 0;
        }

        emprestadosLim[index] = null;
        contaConta = index;
        //dai eu sempre coloco no lugar que tem espaço lá no array. Espero que isso esteja correto klkkkkkkk
        return multa;
    }

    public Emprestimo[] getEmprestadosLim() {
        return emprestadosLim;
    }

    public void setEmprestadosLim(Emprestimo[] emprestadosLim) {
        this.emprestadosLim = emprestadosLim;
    }


  
    
    
}
