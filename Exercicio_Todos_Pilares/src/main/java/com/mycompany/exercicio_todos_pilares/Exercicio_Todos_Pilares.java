/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_todos_pilares;

/**
 *
 * @author stefani.januario
 */
public class Exercicio_Todos_Pilares {

    public static void ImprimeItem(Item m){
        m.Imprime();
    }
    public static void Alugar(Item a){
        a.AlugarItem();
    }
    public static void Devolver(Item d){
        d.DevolverItem();
    }
    public static void main(String[] args) {
       Livro ObjL = new Livro();
       ObjL.setTitulo("Abcdefg");
       ObjL.setItbn(35);
       ObjL.setNumPg(390);
       
       Revista ObjR = new Revista();
       ObjR.setTitulo("Veja");
       ObjR.setNumEdicao(220);
       
       Biblioteca ObjB = new Biblioteca();
       ObjB.setTitulo(ObjL.getTitulo());
       Biblioteca ObjB2 = new Biblioteca();
       ObjB2.setTitulo(ObjR.getTitulo());
              
       ImprimeItem(ObjL);
       ImprimeItem(ObjR);
       
       Alugar(ObjB);
       Devolver(ObjB);
       
       Alugar(ObjB2);
       Devolver(ObjB2);
       
    }
}
