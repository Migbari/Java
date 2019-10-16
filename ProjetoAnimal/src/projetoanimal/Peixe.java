
package projetoanimal;

public class Peixe extends Animal implements IReproducao{
    
    private boolean corpo_escamas;

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
    
    @Override   /*IReprodução*/
    public String reproducao(){
        return "Ovo";
    }
}

