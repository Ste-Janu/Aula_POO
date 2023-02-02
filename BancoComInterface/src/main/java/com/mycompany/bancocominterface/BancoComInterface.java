/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bancocominterface;

/**
 *
 * @author stefani.januario
 */
public class BancoComInterface {

    public static void main(String[] args) {
        ContaEspecial CE = new ContaEspecial();
        CE.setLimite(300);
        CE.setSaldo(300);
        
        CE.depositar(200);
        
    }
}
