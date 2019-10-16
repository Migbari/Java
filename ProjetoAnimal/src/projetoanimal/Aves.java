package projetoanimal;


public class Aves extends Animal implements IAlimentacao, IReproducao{
    private boolean corpo_coberto_penas = true;
    private boolean voa;
    private String TipoAlimentacao;
    
    @Override   /**/
    public String alimentacao(){
        return this.TipoAlimentacao;
    }
    public void setTipoAlimentacao(String Alimentacao){
        this.TipoAlimentacao = Alimentacao;
    }
    
    @Override   /*IReprodução*/
    public String reproducao(){
        return "Ovo";
    }

    /**
     * @return the corpo_coberto_penas
     */
    public boolean isCorpo_coberto_penas() {
        return corpo_coberto_penas;
    }

    /**
     * @param corpo_coberto_penas the corpo_coberto_penas to set
     */
    public void setCorpo_coberto_penas(boolean corpo_coberto_penas) {
        this.corpo_coberto_penas = corpo_coberto_penas;
    }

    /**
     * @return the voa
     */
    public boolean isVoa() {
        return voa;
    }

    /**
     * @param voa the voa to set
     */
    public void setVoa(boolean voa) {
        this.voa = voa;
    }
}
