/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.martin.gato.base;

import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author martin
 */
public class Game {

    private Player[] players;
    private Box[][] boxes;
    private JButton[][] gui;
    private boolean isGameOver;
    private static final String imgX = "X.png";
    private static final String imgO = "O.png";
    
    public Game(Player gamer1, Player gamer2, JButton[][] buttons) {
        players = new Player[2];
        players[0] = gamer1;
        players[1] = gamer2;
        this.boxes = new Box[3][3];
        this.gui = buttons;
        this.isGameOver = false;
        // Creo objetos casilla en la matriz
        for (int i = 0; i < boxes.length; i++) 
            for (int j = 0; j < boxes[i].length; j++) 
                boxes[i][j] = new Box(new Point(i, j));
    }

    public void resetAll(){
        
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) {
                boxes[i][j].setFigure(Figure.EMPTY);
                gui[i][j].setIcon(null);
            }
        players[0].setIsPlaying(true);
        players[1].setIsPlaying(false);
    }
    
    // Despues de placeFigure hacer updateUI() al panel

    public void placeFigure(Figure figure, Point point){
        boxes[point.getRow()][point.getColumn()].setFigure(figure);
        ImageIcon img;
        String imgName = "";
        
        if (figure == Figure.CROSS) imgName = imgX;
        else imgName = imgO;
        img = new ImageIcon(getClass().getResource("/org/martin/gato/resources/" + imgName));
        gui[point.getRow()][point.getColumn()].setIcon(img);
    }

    // Cuando jugamos contra CPU
    public void placeFigure(Figure figure){
        
        for (int i = 0; i < boxes.length; i++) {
            for (int j = 0; j < boxes[i].length; j++) {
                if (boxes[i][j].isEmpty()) {
                    boxes[i][j].setFigure(figure);
                    break;
                }
                
            }
        }
    }
    
    public Player getCurrentPlayer(){
        return Arrays.stream(players).filter(Player::isPlaying).findFirst().get();
    }
    
    public boolean hasEmpate(){
        boolean hasEmpate = false;
        
        for (int i = 0; i < boxes.length; i++) 
            for (int j = 0; j < boxes[i].length; j++) {
                hasEmpate = !boxes[i][j].isEmpty();
                if (!hasEmpate) return hasEmpate;
            }
        return hasEmpate;
    }
    
    public boolean isGameOver(){
        return isGameOver;
    }
    
    public boolean hasWinner(){
        return (boxes[0][0].hasCross() && boxes[0][1].hasCross() && boxes[0][2].hasCross()) || 
                (boxes[0][0].hasCross() && boxes[1][0].hasCross() && boxes[2][0].hasCross()) ||
                (boxes[0][0].hasCross() && boxes[1][1].hasCross() && boxes[2][2].hasCross()) ||
                (boxes[0][1].hasCross() && boxes[1][1].hasCross() && boxes[2][1].hasCross()) ||
                (boxes[0][2].hasCross() && boxes[1][1].hasCross() && boxes[2][0].hasCross()) ||
                (boxes[0][2].hasCross() && boxes[1][2].hasCross() && boxes[2][2].hasCross()) ||
                (boxes[1][0].hasCross() && boxes[1][1].hasCross() && boxes[1][2].hasCross()) ||
                (boxes[2][0].hasCross() && boxes[2][1].hasCross() && boxes[2][2].hasCross()) ||
                (boxes[0][0].hasCircle() && boxes[0][1].hasCircle() && boxes[0][2].hasCircle()) || 
                (boxes[0][0].hasCircle() && boxes[1][0].hasCircle() && boxes[2][0].hasCircle()) ||
                (boxes[0][0].hasCircle() && boxes[1][1].hasCircle() && boxes[2][2].hasCircle()) ||
                (boxes[0][1].hasCircle() && boxes[1][1].hasCircle() && boxes[2][1].hasCircle()) ||
                (boxes[0][2].hasCircle() && boxes[1][1].hasCircle() && boxes[2][0].hasCircle()) ||
                (boxes[0][2].hasCircle() && boxes[1][2].hasCircle() && boxes[2][2].hasCircle()) ||
                (boxes[1][0].hasCircle() && boxes[1][1].hasCircle() && boxes[1][2].hasCircle()) ||
                (boxes[2][0].hasCircle() && boxes[2][1].hasCircle() && boxes[2][2].hasCircle());
    }
    
    public boolean isValidPlay(Point objectivePoint){
        return boxes[objectivePoint.getRow()][objectivePoint.getColumn()].isEmpty() && 
                !isGameOver;
    }
    
    public void setTurn(){
        players[0].setIsPlaying(players[1].isPlaying());
        players[1].setIsPlaying(!players[1].isPlaying());
    }
    
    public Player getPlayer1() {
        return players[0];
    }

    public void setPlayer1(Player gamer1) {
        this.players[0] = gamer1;
    }

    public Player getPlayer2() {
        return players[1];
    }

    public void setPlayer2(Player gamer2) {
        this.players[1] = gamer2;
    }

    public Box[][] getBoxes() {
        return boxes;
    }

    public void setBoxes(Box[][] boxes) {
        this.boxes = boxes;
    }
    
    
}
