/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_4;

/**
 *
 * @author stefani.januario
 */
public class Carro implements Veiculo{
    private int marcha=0;

    @Override
    public void Acelerar() {
        System.out.println("O veiculo está andando");
    }

    @Override
    public void Freiar() {
       System.out.println("O veiculo está parando");

    }

    @Override
    public void MudarMarcha() {
        setMarcha(getMarcha()+1);
        System.out.println("O veiculo mudou para a marcha"+getMarcha());

    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
    
}
