/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_abstracao;

/**
 *
 * @author stefani.januario
 */
public class Cliente extends Pessoa {
    private int codCliente;

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    @Override
    public void Imprime() {
        System.out.println("O cliente "+ getNome()+ " tem "+getIdade()+" anos e possui o cód "+getCodCliente());
    }
}
