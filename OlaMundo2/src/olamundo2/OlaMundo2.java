/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundo2;

import java.util.Scanner;
        
public class OlaMundo2 {

    /**
     * @param args the command line arguments
     */
    //MODIFICADOR - public
    
    public static float soma(float a,float b,
           float c, float d)
    {
        return ((a+b+c+d)/4);
    }
      
    
      public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Olá Mundo");
        System.out.println("Digite algo:");
        
        Scanner teclado=new Scanner(System.in);
        
        String digitado = teclado.nextLine();
        
        System.out.println("O que o usu. digitou:"  + digitado);
        
        try{
        
        //nome
        System.out.println("Digite seu nome");
        String nome = teclado.nextLine();
        // nota 1
        System.out.println("Digite sua nota 1");
        float nota1= teclado.nextFloat();
        // nota 2
        System.out.println("Digite sua nota 2");
        float nota2= teclado.nextFloat();
        //note3
        System.out.println("Digite sua nota 3");
        float nota3= teclado.nextFloat();
        //nota 4
        System.out.println("Digite sua nota 4");
        float nota4= teclado.nextFloat();
        // soma e imprime a soma
        float media = 
          //(nota1+nota2+nota3+nota4)/4;
                soma(nota1,nota2,nota3,nota4); 
                
        //media = media / 4;
        System.out.println("Media:" + media);
        
       }
        catch(Exception e)
        {
            System.out.println("Erro"+e);
        }
        
    }
    
}
