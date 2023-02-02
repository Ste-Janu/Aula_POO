/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_6;

/**
 *
 * @author stefani.januario
 */
public final class Sedan extends Carro {
    private int potenciaSedan;
        
    Sedan (){
        setPotenciaSedan(getPotencia());
    }
    
    void acelera(){
        setPotenciaSedan(getVelocidade()*8);
        System.out.println("O carro acelerou "+getPotenciaSedan());
    }

    public int getPotenciaSedan() {
        return potenciaSedan;
    }

    public void setPotenciaSedan(int potenciaSedan) {
        this.potenciaSedan = potenciaSedan;
    }

}