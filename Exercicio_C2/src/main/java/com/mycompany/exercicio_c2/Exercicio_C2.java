/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_c2;

/**
 *
 * @author stefani.januario
 */
public class Exercicio_C2 {

    public static void ImprimeEndereco(Endereco e){
        e.Imprime();
    }
    public static void main(String[] args) {
        Endereco End = new Endereco("XV de novembro",759,89010001);
        ImprimeEndereco(End);
    }
}
