/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_encapsulamento;

/**
 *
 * @author stefani.januario
 */
public class Carro {
    private String montadora;
    private int cilindrada;
    private String paisOrigem;

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        if (!paisOrigem.equals("China")){
        }else{
            System.out.println("Cadastro para carros chineses bloqueados");
        }
        this.paisOrigem = paisOrigem;
    }
}
