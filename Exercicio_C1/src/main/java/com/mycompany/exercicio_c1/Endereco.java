/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_c1;

/**
 *
 * @author stefani.januario
 */
public class Endereco {
    private String rua;
    private int numero;
    private int cep;
    
    public Endereco(){}
    
    Endereco(String rua, int numero, int cep){
        this.rua=rua;
        this.numero=numero;
        this.cep=cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
   
}
