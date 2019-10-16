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
public class PRJ_Form {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        frmINICIAL frm=new frmINICIAL();
        frm.setVisible(true);
        
        Funcionario f1=new Funcionario();
       
        Cliente cl1=new Cliente();
        
        f1.setNome("João");
        f1.setEmail("joao@gmail.com");
        f1.setDatacontratacao("2/2/2002");
        f1.setRegistro(1234);
        
        cl1.setNome("Pedro");
        cl1.setEmail("pedro@gmail.com");
        cl1.setCpf("123.456.32-1");
        
                
        System.out.println("Nome:" + f1.getNome());
        System.out.println("Email:" +f1.getEmail());
        System.out.println("Data:" +f1.getDatacontratacao());
        System.out.println("Registro:" +f1.getRegistro());
        
        System.out.println("Nome:"+cl1.getNome());
        System.out.println("Email:"+cl1.getEmail());
        System.out.println("CPF:"+cl1.getCpf());
        
        frm.setDados(cl1.getNome(),cl1.getEmail());

    }
    
}
