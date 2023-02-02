/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_3;

/**
 *
 * @author stefani.januario
 */
public class Caminhao implements Veiculo{
    private int velocidadeCaminhao;
    
    Caminhao(){
        setVelocidadeCaminhao(velocidade);        
    }
    
    @Override
    public void Acelerar() {
        setVelocidadeCaminhao(getVelocidadeCaminhao()+25);
        System.out.println("Caminhão acelerou");
    }

    @Override
    public void Freiar() {
        setVelocidadeCaminhao(getVelocidadeCaminhao()-25);
        System.out.println("Caminhao freiou ");
    }

    @Override
    public void verificar() {
        System.out.println("A velocidade atual é"+getVelocidadeCaminhao());
    }

    public int getVelocidadeCaminhao() {
        return velocidadeCaminhao;
    }

    public void setVelocidadeCaminhao(int velocidadeCaminhao) {
        this.velocidadeCaminhao = velocidadeCaminhao;
    }
    
}
