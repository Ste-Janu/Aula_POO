/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_abstracao;

/**
 *
 * @author stefani.januario
 */
public class Funcionario extends Pessoa {
    private int cracha;

    public int getCracha() {
        return cracha;
    }

    public void setCracha(int cracha) {
        this.cracha = cracha;
    }

    @Override
    public void Imprime() {
        System.out.println("O funcionario "+ getNome()+ " tem "+getIdade()+" anos e possui o crachá "+getCracha());
    }
}
