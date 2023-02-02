/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_3;

/**
 *
 * @author stefani.januario
 */
public class Carro implements Veiculo{
    private int velocidadeCarro;
        
    Carro (){
        setVelocidadeCarro(velocidade);
    }
    @Override
    public void Acelerar() {
        setVelocidadeCarro(getVelocidadeCarro()+10);
        System.out.println("Veiculo acelerou");
    }

    @Override
    public void Freiar() {
        setVelocidadeCarro(getVelocidadeCarro()-10);
        System.out.println("Veiculo freiou");
    }

    public int getVelocidadeCarro() {
        return velocidadeCarro;
    }

    public void setVelocidadeCarro(int velocidadeCarro) {
        this.velocidadeCarro = velocidadeCarro;
    }

    @Override
    public void verificar() {
        System.out.println("Velecidade atual é "+ getVelocidadeCarro());
    }
    
}
