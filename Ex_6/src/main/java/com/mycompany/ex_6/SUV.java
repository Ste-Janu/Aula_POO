/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_6;

/**
 *
 * @author stefani.januario
 */
public class SUV extends Carro {
     private int potenciaSUV;
        
    SUV (){
        setPotenciaSUV(getPotencia());
    }
    
    void acelera(){
        setPotenciaSUV(getVelocidade()*35);
        System.out.println("O carro acelerou "+getPotenciaSUV());
    }

    public int getPotenciaSUV() {
        return potenciaSUV;
    }

    public void setPotenciaSUV(int potenciaSUV) {
        this.potenciaSUV = potenciaSUV;
    }
}
