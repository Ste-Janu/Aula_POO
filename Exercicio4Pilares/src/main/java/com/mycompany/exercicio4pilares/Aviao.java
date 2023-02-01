/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4pilares;

/**
 *
 * @author stefani.januario
 */
public class Aviao extends Veiculo {
    private int quantidadeJanelas;

    public int getQuantidadeJanelas() {
        return quantidadeJanelas;
    }

    public void setQuantidadeJanelas(int quantidadeJanelas) {
        this.quantidadeJanelas = quantidadeJanelas;
    }

    public void Imprime() {
        System.out.println("O aviao está na velocidade "+ getVelocidade()+ " tem "+getQuantidadePassageiros()+" passageiros e possui "+getQuantidadeJanelas()+" janelas");
    }
}
