/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_todos_pilares;

/**
 *
 * @author stefani.januario
 */
public class Revista extends Item {
    private int numEdicao;
    
    @Override
    public void Imprime() {
         System.out.println("A n da edição da revista "+getTitulo()+" é "+getNumEdicao());
    }

    public int getNumEdicao() {
        return numEdicao;
    }

    public void setNumEdicao(int numEdicao) {
        this.numEdicao = numEdicao;
    }

    @Override
    public void AlugarItem() {
    }

    @Override
    public void DevolverItem() {
    }
    
}
