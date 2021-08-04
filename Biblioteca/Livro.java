public class Livro extends Publicacao{
    private String edicao;
    private String editora;
    private String isbn;

    public Livro(String titulo, String dataPub, String edicao, String editora, String isbn) {
        super(titulo, dataPub);

        this.edicao = edicao;
        this.editora = editora;
        this.isbn = isbn;
        
        this.setTipo("Livro\n");
    }
    
    @Override
    public void setMulta(double multa) {
        super.setMulta(multa);
    }


    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
