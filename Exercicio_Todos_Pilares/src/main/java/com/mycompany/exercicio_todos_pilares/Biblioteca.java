/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_todos_pilares;

/**
 *
 * @author stefani.januario
 */
public class Biblioteca extends Item{
 
    @Override
    public void Imprime() {
    }

    @Override
    public void AlugarItem() {
        System.out.println(getTitulo()+" foi alugado");
    }

    @Override
    public void DevolverItem() {
        System.out.println(getTitulo()+" foi devolvido");
    }
}
