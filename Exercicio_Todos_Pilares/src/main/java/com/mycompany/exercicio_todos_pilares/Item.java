/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_todos_pilares;

/**
 *
 * @author stefani.januario
 */
public abstract class Item {
    String titulo;
    private String autor;
    private int numeroEx;
    
    public abstract void Imprime();
    public abstract void AlugarItem();
    public abstract void DevolverItem();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEx() {
        return numeroEx;
    }

    public void setNumeroEx(int numeroEx) {
        this.numeroEx = numeroEx;
    }
    
}
