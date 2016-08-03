/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.gato.base;

/**
 *
 * @author martin
 */
public class Player {

    private String name;
    private Figure figure;
    private boolean isPlaying;
    private int quantityWins;

    public Player(String name, Figure figure, boolean isPlaying, int quantityWins) {
        this.name = name;
        this.figure = figure;
        this.isPlaying = isPlaying;
        this.quantityWins = quantityWins;
    }

    public Player(String name, Figure figure) {
        this.name = name;
        this.figure = figure;
        this.isPlaying = false;
        this.quantityWins = 0;
    }

    public Player(String name) {
        this.name = name;
        this.figure = Figure.CROSS;
        this.isPlaying = false;
        this.quantityWins = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setIsPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public int getQuantityWins() {
        return quantityWins;
    }

    public void setQuantityWins(int quantityWins) {
        this.quantityWins = quantityWins;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
