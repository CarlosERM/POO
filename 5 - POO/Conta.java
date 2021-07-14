import java.lang.reflect.Constructor;

public abstract class Conta {

    private float saldo = 0;
    private int nroConta;
    private boolean identificador;
    private boolean ativa;



    public Conta(float saldo, int nroConta) {
        this.saldo = saldo;
        this.nroConta = nroConta;
    }
    
    public Conta(float saldo, int nroConta, boolean identificador) {
        this.saldo = saldo;
        this.nroConta = nroConta;
        this.identificador = identificador;
    }

    public boolean depositar(float valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            return true;
        } else  {
            return false;
        }
    }

    public boolean sacar(float valor) {
        if (valor > 0 && valor < getSaldo()) {
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            return false;
        }      
    }

    
    public boolean sacar1(float valor) {
        return true;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public int getNroConta() {
        return nroConta;
    }

    public void setNroConta(int nroConta) {
        this.nroConta = nroConta;
    }

    public boolean isIdentificador() {
        return identificador;
    }

    public void setIdentificador(boolean identificador) {
        this.identificador = identificador;
    }

    

}
