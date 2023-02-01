/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4pilares;

/**
 *
 * @author stefani.januario
 */
public class Moto extends Veiculo {
    private int quantidadeRetrovisor;

    public int getQuantidadeRetrovisor() {
        return quantidadeRetrovisor;
    }

    public void setQuantidadeRetrovisor(int quantidadeRetrovisor) {
        this.quantidadeRetrovisor = quantidadeRetrovisor;
    }
    public void Imprime() {
        System.out.println("A moto está na velocidade "+ getVelocidade()+ " tem "+getQuantidadePassageiros()+" passageiros e possui "+getQuantidadeRetrovisor()+ " retrovisores");
    }
}
