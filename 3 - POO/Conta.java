public class Conta extends Usuario{
    int nroConta;
    int agencia;
    String rua;
    String bairro;
    String cidade;

    public Conta(String nome, int cpf, int id, int nroConta, int agencia, String rua, String bairro, String cidade) {
        // super(nome, cpf, id);
        this.nomeCliente = nome;
        this.cpf = cpf;
        this.id = id;
        this.nroConta = nroConta;
        this.agencia = agencia;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
    }
    public Conta(String nome, int cpf, int id, int nroConta, int agencia, String rua, String bairro) {
        // super(nome, cpf, id);
        this.nomeCliente = nome;
        this.cpf = cpf;
        this.id = id;
        this.nroConta = nroConta;
        this.agencia = agencia;
        this.rua = rua;
        this.bairro = bairro;
    }
    public Conta(String nome, int cpf, int id, int nroConta, int agencia, String rua) {
        // super(nome, cpf, id);
        this.nomeCliente = nome;
        this.cpf = cpf;
        this.id = id;
        this.nroConta = nroConta;
        this.agencia = agencia;
        this.rua = rua;
    }

    public Conta(String nome, int cpf, int id, int nroConta, int agencia) {
        // super(nome, cpf, id);
        this.nomeCliente = nome;
        this.cpf = cpf;
        this.id = id;
        this.nroConta = nroConta;
        this.agencia = agencia;

    }
    @Override
    public String toString() {
    return "Nome: " + this.nomeCliente + "\t CPF: " + this.cpf + "\t ID: " + this.id + "\tConta: " + this.nroConta + "\t Agência: " + this.agencia + "\t Rua: " + this.rua + "\t Bairro: " + this.bairro + "\tCidade: " + this.cidade;    
    }
}
