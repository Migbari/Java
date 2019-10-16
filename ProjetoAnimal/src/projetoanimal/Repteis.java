
package projetoanimal;


public class Repteis extends Animal implements IAlimentacao, IReproducao{
    
    private boolean corpo_escamas;
    private boolean carapaca_com_placas;
    private String TipoAlimentacao;
    
    @Override   /*IAlimentação*/
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
     * @return the corpo_escamas
     */
    public boolean isCorpo_escamas() {
        return corpo_escamas;
    }

    /**
     * @param corpo_escamas the corpo_escamas to set
     */
    public void setCorpo_escamas(boolean corpo_escamas) {
        this.corpo_escamas = corpo_escamas;
    }

    /**
     * @return the carapaca_com_placas
     */
    public boolean isCarapaca_com_placas() {
        return carapaca_com_placas;
    }

    /**
     * @param carapaca_com_placas the carapaca_com_placas to set
     */
    public void setCarapaca_com_placas(boolean carapaca_com_placas) {
        this.carapaca_com_placas = carapaca_com_placas;
    }
}
