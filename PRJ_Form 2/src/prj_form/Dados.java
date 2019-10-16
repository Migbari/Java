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
public class Dados {
    
    Funcionario f1=new Funcionario();
       
    Cliente cl1=new Cliente();
        
        public void setDados(){
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
        
        //frm.setDados(f1.getNome(),f1.getEmail(), "",f1.getRegistro()+"",f1.getDatacontratacao());
        }
        
        public String[] getCliente(){
            String vcli[]=new String[3];
            vcli[0]= this.cl1.getNome();
            vcli[1]= this.cl1.getEmail();
            vcli[2]= this.cl1.getCpf();
            return vcli;
        }
        
        public String[] getFuncionario()
        {
            String vcli[]=new String[4];
            vcli[0]= this.f1.getNome();
            vcli[1]= this.f1.getEmail();
            vcli[2]= this.f1.getRegistro()+"";
            vcli[3]= this.f1.getDatacontratacao();         
            return vcli;
            
        }
}
