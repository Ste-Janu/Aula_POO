/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_c1;

/**
 *
 * @author stefani.januario
 */
public class Contato {
    private int numeroCel;
    private String email;
    
    private Pessoa contatoPessoa;
    private Endereco contatoEndereco;
    
    public Contato(){
        contatoPessoa = new Pessoa();
        contatoEndereco = new Endereco();
             
    }
    
    public void InserirDados(String nome, int idade, String rua, int numero, int cep, int numeroCel, String email){
        contatoPessoa.setNome(nome);
        contatoPessoa.setIdade(idade);
        contatoEndereco.setRua(rua);
        contatoEndereco.setNumero(numero);
        contatoEndereco.setCep(cep);
        setEmail(email);
        setNumeroCel(numeroCel);
    }

    public void ImprimeContato(){
        System.out.println("Nome "+contatoPessoa.getNome()+" idade "+ contatoPessoa.getIdade()+" Rua: "+contatoEndereco.getRua()+" n "+contatoEndereco.getNumero()+" CEP: "+contatoEndereco.getCep()+" email "+getEmail()+" numero celular "+getNumeroCel());
    }
    public int getNumeroCel() {
        return numeroCel;
    }

    public void setNumeroCel(int numeroCel) {
        this.numeroCel = numeroCel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
