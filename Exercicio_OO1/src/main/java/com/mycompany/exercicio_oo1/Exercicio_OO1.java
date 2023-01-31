/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_oo1;

/**
 *
 * @author stefani.januario
 */
public class Exercicio_OO1 {
    
        public static void ImprimeMensagem(Animal a){
        System.out.println("Ele caminha? "+ a.getCaminha());
    }            
    public static void main(String[] args) {
        Cachorro ObjetoCao = new Cachorro();
        Gato ObjetoGato = new Gato();
        ObjetoCao.setCaminha("Sim");
        ObjetoGato.setCaminha("Sim");
        ImprimeMensagem(ObjetoCao);
        ImprimeMensagem(ObjetoGato);
    }
}
