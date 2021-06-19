
// import java.util.ArrayList;


public class Conta {
    
 

    private int nroConta;
    private int agencia;
    private float saldo;
 



    private Cliente cliente;

    // ArrayList<Conta> listaContas;

    public Conta(int nroConta, int agencia, float saldo, Cliente cliente) {
        this.nroConta = nroConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public boolean sacar(float saque) {
        if(saque > this.saldo || saque <= 0) {
            return false;
        } 

        this.saldo -= saque;
        return true;
    }
    public boolean depositar(float deposito) {
        if (deposito <= 0) {
            return false;
        }
        this.saldo += deposito;
        return true;
    }
    public boolean transferir(float valorTrans, Conta conta1, Conta conta2) {
        if (valorTrans > conta1.saldo || valorTrans <= 0) return false;
        conta1.saldo -= valorTrans;
        conta2.saldo += valorTrans;
        return true;
    }


    public int getNroConta() {
        return nroConta;
    }

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString(){
        return "Nome: " + cliente.getNome() + "\t CPF: " + cliente.getCpf() + "\t ID: " + cliente.getId() + "\t Número da Conta: " + nroConta + "\t Agencia: " + agencia + "\t Saldo: " + this.saldo + "\t Número da Rua: " + cliente.getNroRua()+ "\t Bairro: " + cliente.getBairro() +  "\t Cidade: " + cliente.getCidade();
    }

}
