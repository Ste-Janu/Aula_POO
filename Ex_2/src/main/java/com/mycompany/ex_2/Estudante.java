/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_2;

/**
 *
 * @author stefani.januario
 */
public class Estudante extends Pessoa {
    private int idenEstudante;
    
    private Pessoa estudantePessoa;
    
    public Estudante(){
        estudantePessoa = new Pessoa();
    }
    public void completaEstudante(String nome, int idade, int idenEstudante){
       estudantePessoa.setNome(nome);
       estudantePessoa.setIdade(idade);
        setIdenEstudante(idenEstudante);
    }
    public void imprimeEstudante(){
        System.out.println("Aluno: "+estudantePessoa.getNome()+ " Idade: "+estudantePessoa.getIdade()+" Matricula: "+getIdenEstudante());
    }
    public int getIdenEstudante() {
        return idenEstudante;
    }

    public void setIdenEstudante(int idenEstudante) {
        this.idenEstudante = idenEstudante;
    }
}
