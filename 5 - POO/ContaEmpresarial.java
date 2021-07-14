class ContaEmpresarial extends Conta{
    private PessoaJuridica pessoaJuri;

    

    public ContaEmpresarial(PessoaJuridica pessoaJuri, int nroConta, float saldo) {
        super(saldo, nroConta);
        this.pessoaJuri = pessoaJuri;
    }

    public PessoaJuridica getPessoaJuri() {
        return pessoaJuri;
    }

    public void setPessoaJuri(PessoaJuridica pessoaJuri) {
        this.pessoaJuri = pessoaJuri;
    }

    @Override
    public String toString() {
        return "\nConta Empresarial" + 
               "\nNome: " + pessoaJuri.getNome() + 
               "\nCNPJ: " + pessoaJuri.getCnpj() +
               "\nNúmero da Conta: " + super.getNroConta() +
               "\nSaldo: " + super.getSaldo();
    }
    
}