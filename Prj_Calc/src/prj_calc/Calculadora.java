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
public class Calculadora {
    
    public int soma(int a,int b)
    {    return a+b;    }
    
    public float soma(float a,float b)
    {    return a+b;    }
    
    public long soma(long a,long b)
    {    return a+b;    }
    
    public double soma(double a,double b)
    {    return a+b;    }
    
    public String soma(String a, String b)
    {
        double auxA =0, auxB=0;
        try{
            auxA = Double.parseDouble(a);
            auxB = Double.parseDouble(b);            
        }catch(Exception e)
        {
            System.out.println("Erro:"+e);
        }
        
        return soma(auxA, auxB)+"";
    }
    
    public Object soma(Object a,Object b)
    {
        String auxA, auxB;
        auxA = a.toString();
        auxB = b.toString();
        return soma(auxA,auxB);
    }
    
    
     public double subtracao(double a,double b)
    {    return a-b;    }
     
     
     public String subtracao(String a, String b)
    {
        double auxA =0, auxB=0;
        try{
            auxA = Double.parseDouble(a);
            auxB = Double.parseDouble(b);            
        }catch(Exception e)
        {
            System.out.println("Erro:"+e);
        }
        
        return subtracao(auxA, auxB)+"";
    }
    
     public Object subtracao(Object a,Object b)
    {
        String auxA, auxB;
        auxA = a.toString();
        auxB = b.toString();
        return subtracao(auxA,auxB);
    }
}





















