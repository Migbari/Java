
package projetoanimal;

public class Insectos extends Animal implements IAlimentacao, IReproducao{
    private int qtd_patas;
    private boolean asas;

    @Override   /*Sobrescrever médoto da Interface IAalimentacao*/
    public String alimentacao(){  /*metodo abstrato da IAlimentacao*/
        return "Insetívoro";
    }
     
    @Override   /*IReprodução*/
    public String reproducao(){
        return "Ovo";
    }
    
    /**
     * @return the qtd_patas
     */
    public int getQtd_patas() {
        return qtd_patas;
    }

    /**
     * @param qtd_patas the qtd_patas to set
     */
    public void setQtd_patas(int qtd_patas) {
        this.qtd_patas = qtd_patas;
    }

    /**
     * @return the asas
     */
    public boolean isAsas() {
        return asas;
    }

    /**
     * @param asas the asas to set
     */
    public void setAsas(boolean asas) {
        this.asas = asas;
    }
}
