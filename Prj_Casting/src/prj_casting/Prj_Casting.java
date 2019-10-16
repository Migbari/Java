/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj_casting;

import java.util.Scanner;

public class Prj_Casting {

    public static void main(String[] args) {
        try {

            // TODO code application logic here
            Scanner teclado = new Scanner(System.in);

            System.out.println("Digite sua idade");
            String idadestr = teclado.nextLine();
            System.out.println("O usuário digitou:" + idadestr);

            int idade = Integer.parseInt(idadestr);

            if (idade >= 18 && idade <= 150) {
                System.out.println("Maior de Idade");
            } else if (idade >= 1 && idade < 18) {
                System.out.println("Menor de Idade");
            } else {
                System.out.println("Idade inválida");
            }

            float altura = 0;
            do {
                try {
                    System.out.println("Digite sua altura");
                    String straltura = teclado.nextLine();
                    straltura = straltura.replace(",", ".");
                    altura = Float.parseFloat(straltura);
                } catch (Exception e) {
                    System.out.println("Digite altura no formato: 1.78 ");
                }
            } while (altura <= 0);

            float peso = 0;
            do {
                try {
                    System.out.println("Digite seu peso");
                    String strpeso = teclado.nextLine();
                    strpeso = strpeso.replace(",", ".");
                    peso = Float.parseFloat(strpeso);
                } catch (Exception e) {
                    System.out.println("Digite o peso no formato: 65.78 ");
                }
            } while (peso <= 0);

            float imc = peso / (altura * altura);

            System.out.println("O Imc:" + imc);

        } catch (Exception erro) {
            System.out.println("Erro:" + erro);
        }

    }

}
