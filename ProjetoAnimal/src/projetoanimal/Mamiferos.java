
package projetoanimal;

public class Mamiferos extends Animal implements IAlimentacao, IReproducao
{ 
   
    private boolean coberto_de_pelo;
    private String locomocao; 
    
    /*Criada p/ o metodo alimentacao
    atraves do metodo setTipoAlimentacao
    */
    private String TipoAlimentacao;
    
    @Override   /*Sobrescrever médoto da Interface IAalimentacao*/
    public String alimentacao(){  /*metodo abstrato da IAlimentacao*/
        return this.TipoAlimentacao;
    }
    public void setTipoAlimentacao(String Alimentacao){
        this.TipoAlimentacao = Alimentacao;
    }
    
    @Override   /*IReprodução*/
    public String reproducao(){
        return "Útero da Mãe";
    }
    /**
     * @return the coberto_de_pelo
     */
    public boolean isCoberto_de_pelo() {
        return coberto_de_pelo;
    }

    /**
     * @param coberto_de_pelo the coberto_de_pelo to set
     */
    public void setCoberto_de_pelo(boolean coberto_de_pelo) {
        this.coberto_de_pelo = coberto_de_pelo;
    }

    /**
     * @return the locomocao
     */
    public String getLocomocao() {
        return locomocao;
    }

    /**
     * @param locomocao the locomocao to set
     */
    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }
}


