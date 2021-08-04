import java.util.ArrayList;

public class Biblioteca {
    private String nomeBiblioteca;
    private ArrayList<Publicacao> publicacoes = new ArrayList<Publicacao>();


    public boolean registrarPublicacao(Publicacao publicacao) {

        publicacoes.add(publicacao);
        return true;

    }

    // public void listarPublicacoes() {
        
    // }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

    public ArrayList<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(ArrayList<Publicacao> publicacoes) {
        this.publicacoes = publicacoes;
    }
 
}