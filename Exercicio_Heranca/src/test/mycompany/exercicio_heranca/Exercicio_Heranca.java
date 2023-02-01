/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio_heranca;

/**
 *
 * @author stefani.januario
 */
public class Exercicio_Heranca {

    public static void ImprimeMensagem(Veiculo v){
        System.out.println("Quantidade passageiros "+ v.getQuantidadePassageiros());
    }            
    public static void main(String[] args) {
        Aviao ObjetoAviao = new Aviao();
        Moto ObjetoMoto = new Moto();
        ObjetoAviao.setQuantidadePassageiros(120);
        ObjetoMoto.setQuantidadePassageiros(2);
        ImprimeMensagem(ObjetoMoto);
        ImprimeMensagem(ObjetoAviao);

    }
}
