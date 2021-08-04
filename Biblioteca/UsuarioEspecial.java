
public class UsuarioEspecial extends Usuario {
    int contador;

    public UsuarioEspecial(String nome, String telefone, String email, String cpf) {
        super(nome, telefone, email, cpf);
        contador = 0;
    }

    @Override
    public double entregarLivro(int index, Biblioteca bibli, String dataRetornoDef) {
        //pra pegar o retorno definitivo
        getEmprestados().get(index).dataRetorno = dataRetornoDef;
        
        Publicacao publiDevolvida = getEmprestados().get(index).emprestada;

        bibli.getPublicacoes().add(publiDevolvida);

        double multa = publiDevolvida.getMulta() * (getEmprestados().get(index).renovacao - 5);
        getEmprestados().get(index).renovacao = 0;

        if(multa < 0) {
            multa = 0;
        }

        getEmprestados().remove(index);

        return multa;
    }
    
}
