public class ContaCorrente extends Conta{
    private PessoaFisica pessoaFis;

   
    public ContaCorrente(PessoaFisica pessoaFis, int nroConta, float saldo) {
        super(saldo, nroConta);
        this.pessoaFis = pessoaFis;
    }
    
    public PessoaFisica getPessoaFis() {
        return pessoaFis;
    }
    public void setPessoaFis(PessoaFisica pessoaFis) {
        this.pessoaFis = pessoaFis;
    }
    
    
    
    @Override
    public String toString() {
        return "\nConta Corrente" + 
               "\nNome: " + pessoaFis.getNome() + 
               "\nCPF: " + pessoaFis.getCpf() +
               "\nNúmero da Conta: " + super.getNroConta() +
               "\nSaldo: " + super.getSaldo();
    }
}
