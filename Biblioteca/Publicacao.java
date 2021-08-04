import java.util.ArrayList;

public abstract class  Publicacao {
    /*Bugiganga pra descobrir o tipo*/
    private String tipo;


    private String titulo;
    private String dataPub;
    private double multa;
    private ArrayList<Autor> autores = new ArrayList<Autor>();

    private ArrayList<Publicacao> publicacaoReferencias = new ArrayList<Publicacao>();

    public Publicacao(String titulo, String dataPub) {
        this.titulo = titulo;
        this.dataPub = dataPub;

    }

    public void registrarAutor(Autor autor) {
        autores.add(autor);
  
        
    }

    public void registrarReferencias(Publicacao publicacaoRef) {
        publicacaoReferencias.add(publicacaoRef);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPub() {
        return dataPub;
    }

    public void setDataPub(String dataPub) {
        this.dataPub = dataPub;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    
    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public ArrayList<Publicacao> getPublicacaoReferencias() {
        return publicacaoReferencias;
    }

    public void setPublicacaoReferencias(ArrayList<Publicacao> publicacaoReferencias) {
        this.publicacaoReferencias = publicacaoReferencias;
    }

    public String listarAutores() {
        String autores = new String("");
        for(int x = 0; x <= getAutores().size() - 1; x++) {
            autores +=  "\n\n" + (x + 1) + getAutores().get(x).toString();
        }
        return autores;
    }
    


    @Override
    public String toString() {

        return "\nTipo: " + this.getTipo() + "\nTítulo: " + this.getTitulo() + "\nData de Publicação: " + this.getDataPub() + listarAutores() + "\n\n--------------------------------------------------------";

    }

}
