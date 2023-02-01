/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_abstracao;

/**
 *
 * @author stefani.januario
 */
public class Exemplo_Abstracao {
    
    public static void ImprimePessoa(Pessoa param){
        param.Imprime();
    }
    public static void main(String[] args) {
        Funcionario ObjF = new Funcionario();
        Cliente ObjC = new Cliente();
        ObjF.setNome("Fulano");
        ObjF.setIdade(26);
        ObjF.setCracha(155);
        
        ObjC.setNome("Ciclano");
        ObjC.setIdade(30);
        ObjC.setCodCliente(88);
        
        ImprimePessoa(ObjF);
        ImprimePessoa(ObjC);
    }
}
