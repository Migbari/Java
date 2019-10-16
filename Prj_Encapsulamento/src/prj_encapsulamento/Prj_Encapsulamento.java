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
public class Prj_Encapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciação: fazer um "cópia" de
        // uma classe no programa
        Carro car=new Carro();
        System.out.println(car.toString());
      
     
 
      //car.cor=1;
        car.setCor(-1);
    //System.out.println("A cor do carro:"+car.cor);
    System.out.println("A cor do carro:"
            + car.getCor()
            );
    
    car.setChassi("XX0901A");
    System.out.println("chassi:" + 
            car.getChassi());
        
    car.setModelo("Fusca");
    
    car.setEscapamento("duplo");
    car.setMarca("VolksWagem");
    car.setMotor("1.0");
    car.setPneus(5);
    car.setPortas(2);
    car.setVidro("azul");
    car.setModelo_rodas("Liga leve");
    
    System.out.println("Escapamento:"
            +car.getEscapamento());
    
    
        
    System.out.println("Marca:"+car.getMarca());
    System.out.println("Motor:"+car.getMotor());
    System.out.println("Pneus:"+car.getPneus());
    System.out.println("Qtd Portas:"+car.getPortas());
    System.out.println("Cor vidro:"+car.getVidro());
    System.out.println("Modelo Rodas:"
            +car.getModelo_rodas());
    
    }
    
}
