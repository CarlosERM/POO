public class Artigo extends Publicacao {
    private String resumo;

    
    public Artigo(String titulo, String dataPub, String resumo) {
        super(titulo, dataPub);
        this.resumo = resumo;

        this.setTipo("Artigo\n");
    }

    @Override
    public void setMulta(double multa) {
        super.setMulta(multa);
    }
    
    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }



}
