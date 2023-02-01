/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_todos_pilares;

/**
 *
 * @author stefani.januario
 */
public class Livro extends Item {
        private int itbn;
        private int numPg;

    public int getItbn() {
        return itbn;
    }

    public void setItbn(int itbn) {
        this.itbn = itbn;
    }

    public int getNumPg() {
        return numPg;
    }

    public void setNumPg(int numPg) {
        this.numPg = numPg;
    }

    @Override
    public void Imprime() {
        System.out.println("O numero do livro "+getTitulo()+" é "+getItbn()+" e tem "+getNumPg()+" páginas");
    }

    @Override
    public void AlugarItem() {
    }

    @Override
    public void DevolverItem() {  
    }
       
}
