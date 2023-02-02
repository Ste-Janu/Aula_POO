/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_1;

/**
 *
 * @author stefani.januario
 */
public class CalculadoraImpl implements Calculadora {

    private int n1;
    private int n2;
    private int total;

    CalculadoraImpl(int n1, int n2) {
        setN1(n1);
        setN2(n2);
    }

    @Override
    public void somar() {
        setTotal(getN1() + getN2());
        System.out.println(total);
    }

    @Override
    public void subtrair() {
        setTotal(getN1() - getN2());
        System.out.println(total);
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
