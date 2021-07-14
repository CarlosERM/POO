public class ContaEspecial extends Conta{
    private PessoaFisica pessoaFis;

    public ContaEspecial(PessoaFisica pessoaFis, int nroConta, float saldo, boolean identificador) {
        super(saldo, nroConta, identificador);
        this.pessoaFis = pessoaFis;
    }

    public boolean sacar1(float saque) {
        if ( super.getSaldo() < saque) {

            float conta = super.getSaldo() - saque;

            if(conta <= -2001) {
                return false;
            } else {
                super.setSaldo(conta);
                return true;
            }

        } else {
            super.setSaldo(super.getSaldo() - saque);
            return true;
        }
    }

    public PessoaFisica getPessoaFis() {
        return pessoaFis;
    }

    public void setPessoaFis(PessoaFisica pessoaFis) {
        this.pessoaFis = pessoaFis;
    }


    @Override
    public String toString() {
        return "\nConta Especial" + 
               "\nNome: " + pessoaFis.getNome() + 
               "\nCPF: " + pessoaFis.getCpf() +
               "\nNúmero da Conta: " + super.getNroConta() +
               "\nSaldo: " + super.getSaldo();
    }
}
