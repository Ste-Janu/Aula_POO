/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_3;

/**
 *
 * @author stefani.januario
 */
public class Bicicleta implements Veiculo {

    private int velocidadeBike;

    Bicicleta() {
        setVelocidadeBike(velocidade);
    }

    @Override
    public void Acelerar() {
        setVelocidadeBike(getVelocidadeBike()+ 5);
        System.out.println("Bike andou");
    }

    @Override
    public void Freiar() {
        setVelocidadeBike(getVelocidadeBike()+ 5);
        System.out.println("Bike freiou");
    }

    @Override
    public void verificar() {
        System.out.println("A velocidade atual é "+getVelocidadeBike());
    }

    public int getVelocidadeBike() {
        return velocidadeBike;
    }

    public void setVelocidadeBike(int velocidadeBike) {
        this.velocidadeBike = velocidadeBike;
    }

}
