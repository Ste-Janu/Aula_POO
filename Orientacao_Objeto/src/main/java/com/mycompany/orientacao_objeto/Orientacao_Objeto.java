/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.orientacao_objeto;

/**
 *
 * @author stefani.januario
 */
public class Orientacao_Objeto {

    public static void main(String[] args) {
      Carro objeto1 = new Carro();
      objeto1.cilindrada = 1000;
      objeto1.ImprimeCarro();
      
      Carro objeto2 = new Carro();
      objeto2.cilindrada = 1600;
      objeto2.ImprimeCarro();
    }
}
