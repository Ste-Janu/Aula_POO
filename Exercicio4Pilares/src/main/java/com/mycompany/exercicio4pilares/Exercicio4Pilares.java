/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio4pilares;

/**
 *
 * @author stefani.januario
 */
public class Exercicio4Pilares {
public static void ImprimeVeiculo(Veiculo param){
        param.Imprime();
}
    public static void main(String[] args) {
        Aviao ObjA = new Aviao();
        ObjA.setVelocidade(800);
        ObjA.setQuantidadePassageiros(32);
        ObjA.setQuantidadeJanelas(60);
        
        Moto ObjM = new Moto();
        ObjM.setVelocidade(75);
        ObjM.setQuantidadePassageiros(2);
        ObjM.setQuantidadeRetrovisor(2);
        
        ImprimeVeiculo(ObjA);
        ImprimeVeiculo(ObjM);
    }
}
