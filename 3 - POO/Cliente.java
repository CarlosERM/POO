public class Cliente {
     
    private String nome;
    private int cpf;
    private int id;


    private String nroRua;
    private String bairro;
    private String cidade;


    public Cliente(String nome, int cpf, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }
    
    public Cliente(String nome, int cpf, int id, String nroRua, String bairro, String cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
        
        this.nroRua = nroRua;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNroRua() {
        return nroRua;
    }

    public void setNroRua(String nroRua) {
        this.nroRua = nroRua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
