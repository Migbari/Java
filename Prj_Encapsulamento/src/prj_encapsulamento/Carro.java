/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_encapsulamento;

/**
 *
 * @author rolfi.gomes
 */
public class Carro {
    //Atributos
    private int cor;
    private String chassi;
    private String modelo;
    private String modelo_rodas;
    private int portas;
    private String motor;
    private String vidro;
    private String escapamento;
    private int pneus;
    private String marca;
    
    
    //----------------------------
    //Métodos
    public void locomover(){        
    }
    
    public void setCor(int auxcor)
    {
        if(auxcor<=-1)
            return;
        this.cor= auxcor;
    }
    public int getCor()
    {
        return this.cor;
    }
    
    public void setChassi(String aux)
    {
        this.chassi= aux;
    }
    public String getChassi()
    {
        return this.chassi;
    }
    public void setModelo(String aux)
    {
        this.modelo= aux;
    }
    public String getModelo()
    {
        return this.modelo;
    }

    /**
     * @return the modelo_rodas
     */
    public String getModelo_rodas() {
        return modelo_rodas;
    }

    /**
     * @param modelo_rodas the modelo_rodas to set
     */
    public void setModelo_rodas(String modelo_rodas) {
        this.modelo_rodas = modelo_rodas;
    }

    /**
     * @return the portas
     */
    public int getPortas() {
        return portas;
    }

    /**
     * @param portas the portas to set
     */
    public void setPortas(int portas) {
        this.portas = portas;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * @return the vidro
     */
    public String getVidro() {
        return vidro;
    }

    /**
     * @param vidro the vidro to set
     */
    public void setVidro(String vidro) {
        this.vidro = vidro;
    }

    /**
     * @return the escapamento
     */
    public String getEscapamento() {
        return escapamento;
    }

    /**
     * @param escapamento the escapamento to set
     */
    public void setEscapamento(String escapamento) {
        this.escapamento = escapamento;
    }

    /**
     * @return the pneus
     */
    public int getPneus() {
        return pneus;
    }

    /**
     * @param pneus the pneus to set
     */
    public void setPneus(int pneus) {
        this.pneus = pneus;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
