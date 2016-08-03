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
public class Box {
    
    private Figure figure;
    private Point point;

    public Box(Figure figure, Point point) {
        this.figure = figure;
        this.point = point;
    }

    public Box(Point point) {
        this.point = point;
        this.figure = Figure.EMPTY;
    }
    
    public boolean hasCross(){
        return this.figure == Figure.CROSS;
    }
    
    public boolean hasCircle(){
        return this.figure == Figure.CIRCLE;
    }
    
    public boolean isEmpty(){
        return this.figure == Figure.EMPTY;
    }

    public Figure getFigureType() {
        return figure;
    }
    
    public String getFigure(){
        if (figure == Figure.CROSS) return "X";
        else return "O";
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
    
    
    
}
