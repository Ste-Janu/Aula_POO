/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_oo3;

/**
 *
 * @author stefani.januario
 */
public class Exercicio_OO3 {
public static void ImprimeMensagem(Mamiferos m){
        System.out.println("Tem pelos? "+ m.getPelos());
    }            
    public static void main(String[] args) {
        Cachorro ObjetoCao = new Cachorro();
        ObjetoCao.setPelos("Sim");
        ImprimeMensagem(ObjetoCao);

    }
}
