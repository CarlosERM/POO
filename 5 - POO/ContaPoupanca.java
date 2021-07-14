public class ContaPoupanca extends Conta {
    private PessoaFisica pessoaFis;
    private float saldo;
    private boolean ativa;
  
    public ContaPoupanca(PessoaFisica pessoaFis, int nroConta, float saldo) {
        super(saldo, nroConta);
        this.pessoaFis = pessoaFis;
        this.ativa = true;
    }

    public PessoaFisica getPessoaFis() {
        return pessoaFis;
    }

    public void setPessoaFis(PessoaFisica pessoaFis) {
        this.pessoaFis = pessoaFis;
    }
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public String toString() {
        super.setSaldo((float) (super.getSaldo() + super.getSaldo() * 0.05));
        return "\nConta de Poupança" + 
               "\nNome: " + pessoaFis.getNome() + 
               "\nCPF: " + pessoaFis.getCpf() +
               "\nNúmero da Conta: " + super.getNroConta() +
               "\nSaldo: " + super.getSaldo();
    }

}