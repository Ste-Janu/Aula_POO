/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_5;

/**
 *
 * @author stefani.januario
 */
public class MP3Player implements MusicPlayer{

    @Override
    public void play() {
        System.out.println("A musica está tocando");
    }

    @Override
    public void pause() {
        System.out.println("A musica está pausada");
    }

    @Override
    public void stop() {
        System.out.println("A musica parou de tocar");
    }
    
}
