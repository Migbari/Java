package projetoanimal;

public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    /*Variavel privada*/
    private boolean Patas; 
    private String Som;
    private boolean Vivo; 
    private boolean Saude;
    private boolean Sexo;
    private String Tipo;
    private String Porte;
    private String[] Nome_Especie;
        
    /*Get Pega valor*/
    public boolean getPatas() {
       return this.Patas;    
    }
    /*(boolean Patas)_parametro entrada*/
    /*Set Inclui valor*/
    public void setPatas(boolean Patas) {
      this.Patas = Patas;
    }

    public String getSom() {
        return Som;
    }
    public void setSom(String Som) {
        this.Som = Som;
    }    
    
    public boolean getVivo() {
        return this.Vivo;
    }
    public void setVivo(boolean P_Vivo){ /*Parametro =! de N variável*/
        Vivo = P_Vivo; /*Sem This pq parâmetro =! N variável*/
    }

        /**
     * @return the Saude
     */
    public String[] getNome_Especie() {
        return Nome_Especie;
    }
    /**
     * @param Nome_Especie the Saude to set
     */
    public void setNome_Especie(String[] Nome_Especie) {
        this.Nome_Especie = Nome_Especie;
    }
    
    /**
     * @return the Saude
     */
    public boolean isSaude() {
        return Saude;
    }

    /**
     * @param Saude the Saude to set
     */
    public void setSaude(boolean Saude) {
        this.Saude = Saude;
    }

    /**
     * @return the Sexo
     */
    public boolean isSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(boolean Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the Tipo
     */
    public String getTipo() {
        return Tipo;
    }

    /**
     * @param Tipo the Tipo to set
     */
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    /**
     * @return the Porte
     */
    public String getPorte() {
        return Porte;
    }

    /**
     * @param Porte the Porte to set
     */
    public void setPorte(String Porte) {
        this.Porte = Porte;
    }
    
        
    
}
