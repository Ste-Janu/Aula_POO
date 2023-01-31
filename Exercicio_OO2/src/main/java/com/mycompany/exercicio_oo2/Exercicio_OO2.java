/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_oo2;

/**
 *
 * @author stefani.januario
 */
public class Exercicio_OO2 {
public static void Sacar(Conta c){
        System.out.println("Valor saque "+ c.getValor());
}public static void Depositar(Conta c){
        System.out.println("Valor deposito "+ c.getValor());}
    public static void main(String[] args) {
        Conta ObjC = new Conta();
        ContaEspecial ObjCE = new ContaEspecial();
        ObjC.setCliente("Fulano");
        ObjC.setNumero(10);
        ObjC.setSaldo(1500);
        ObjC.setValor(200);
        ObjCE.setValor(350);
        Sacar(ObjC);
        Depositar(ObjCE);
        
    }
}
