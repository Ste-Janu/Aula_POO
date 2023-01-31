/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_e2;

/**
 *
 * @author stefani.januario
 */
public class Aluno {
       private int nota;
       private String nome;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void ImprimeAluno(){
        System.out.println("Aluno " + getNome() + " possui nota "+ getNota());
    }
} 
