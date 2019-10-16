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
public class Prj_Interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1=new Pessoa();
        Cliente c1=new Cliente();
        Funcionario f1=new Funcionario();
        
        p1.imprimir();
        c1.imprimir();
        f1.imprimir();
    }
    
}
