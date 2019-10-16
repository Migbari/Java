/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_interface;

/**
 *
 * @author rolfi.gomes
 */
public class Cliente extends Pessoa 
implements Padrao_de_Codigo
{

    @Override
    public void imprimir() {
        System.out.println("Imprimindo Cliente");
    }
    
}
