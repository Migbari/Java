/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_form;

/**
 *
 * @author rolfi.gomes
 */
public class Funcionario extends Pessoa {
    
    private int registro;
    private String datacontratacao;

    /**
     * @return the registro
     */
    public int getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(int registro) {
        this.registro = registro;
    }

    /**
     * @return the datacontratacao
     */
    public String getDatacontratacao() {
        return datacontratacao;
    }

    /**
     * @param datacontratacao the datacontratacao to set
     */
    public void setDatacontratacao(String datacontratacao) {
        this.datacontratacao = datacontratacao;
    }
    
}
