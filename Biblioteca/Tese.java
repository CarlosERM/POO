public class Tese extends Publicacao {
    private int pagina;
    
    private String resumo;
    private String dataDefesa;
    private String instituicao;
    
    @Override
    public void setMulta(double multa) {
        super.setMulta(multa);
    }

    
    public Tese(String titulo, String dataPub, int pagina, String resumo, String dataDefesa, String instituicao) {
        super(titulo, dataPub);

        this.resumo = resumo;
        this.dataDefesa = dataDefesa;
        this.instituicao = instituicao;

        
        this.setTipo("Tese\n");
    }


    public int getPagina() {
        return pagina;
    }
    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getDataDefesa() {
        return dataDefesa;
    }
    public void setDataDefesa(String dataDefesa) {
        this.dataDefesa = dataDefesa;
    }

    public String getInstituicao() {
        return instituicao;
    }
    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

}
