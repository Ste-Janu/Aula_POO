/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_gerenciamentocontas;

/**
 *
 * @author stefani.januario
 */
public class Exercicio_GerenciamentoContas {

    public static void main(String[] args) {
        ContaEspecial CE = new ContaEspecial();
        CE.setNomeTitular("Fulano");
        CE.setSaldo(1800);
        CE.setNumeroConta(123456);
        CE.setLimite(900);
        
        ContaPoupanca CP = new ContaPoupanca();
        CP.setNomeTitular("Ciclano");
        CP.setSaldo(2000);
        CP.setNumeroConta(654321);
        CP.setTaxaRendimento(10);
        
        
    }
}
