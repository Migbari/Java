
package projetoanimal;


public class Anfibios extends Animal implements IAlimentacao, IReproducao{
   private boolean pele_nua; 

    /**
     * @return the pele_nua
     */
    public boolean isPele_nua() {
        return pele_nua;
    }
    
    @Override   /*Sobrescrever médoto da Interface IAalimentacao*/
    public String alimentacao(){  /*metodo abstrato da IAlimentacao*/
        return "Insetívoro";
    }
    
    @Override   /*IReprodução*/
    public String reproducao(){
        return "Ovo";
    }

    /**
     * @param pele_nua the pele_nua to set
     */
    public void setPele_nua(boolean pele_nua) {
        this.pele_nua = pele_nua;
    }
}

