/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_calc;

/**
 *
 * @author rolfi.gomes
 */
public class Prj_Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calc=new Calculadora();
      
        System.out.println("int:"+calc.soma(1,2));
   System.out.println("long:"+calc.soma(1000000000,2));
   System.out.println("double:"+calc.soma(1.0f,2.0f));
   System.out.println("float:"+calc.soma(1.000000f,2.0f));
   System.out.println("string:"+calc.soma("5.001","2000"));
   System.out.println("obj:"+calc.soma(new Integer(5),"5"));
   
   System.out.println("obj:"+calc.subtracao(5,"5"));
   
    }
    
}
