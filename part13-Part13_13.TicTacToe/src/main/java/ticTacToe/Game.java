package ticTacToe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Valentin
 */
public class Game {

    private List<String> sign;
    private HashMap<Integer, String> board;
    private boolean turn;

    public Game() {
        this.sign = new ArrayList();
        this.board = new HashMap<>();
        this.turn = true;
    }

    public String getSignPosition(Integer position) {
        return this.board.get(position);
    }

    public void setSignPosition(Integer position, String sign) {
        if (!this.board.containsKey(position)) {
            this.sign.add(sign);
        }
        this.board.put(position, sign);
    }

    public boolean getTurn() {
        return this.turn;
    }

    public void setTurn() {
        this.turn = !this.turn;
    }

    public void checkWinner() {
        // Horizontal X wins
        if (this.sign.get(0) == "X"
                && this.sign.get(1) == "X"
                && this.sign.get(2) == "X") {
            System.out.println("X wins!");
        }

        if (this.sign.get(3) == "X"
                && this.sign.get(4) == "X"
                && this.sign.get(5) == "X") {
            System.out.println("X wins!");
        }

        if (this.sign.get(6) == "X"
                && this.sign.get(7) == "X"
                && this.sign.get(8) == "X") {
            System.out.println("X wins!");
        }

        // Vertical X wins    
        if (this.sign.get(0) == "X"
                && this.sign.get(3) == "X"
                && this.sign.get(6) == "X") {
            System.out.println("X wins!");
        }

        if (this.sign.get(1) == "X"
                && this.sign.get(4) == "X"
                && this.sign.get(6) == "X") {
            System.out.println("X wins!");
        }

        if (this.sign.get(2) == "X"
                && this.sign.get(5) == "X"
                && this.sign.get(8) == "X") {
            System.out.println("X wins!");
        }

        // Diagonal X wins
        if (this.sign.get(0) == "X"
                && this.sign.get(4) == "X"
                && this.sign.get(8) == "X") {
            System.out.println("X wins!");
        }

        if (this.sign.get(2) == "X"
                && this.sign.get(4) == "X"
                && this.sign.get(6) == "X") {
            System.out.println("X wins!");
        }

        // Horizontal O wins
        if (this.sign.get(0) == "O"
                && this.sign.get(1) == "O"
                && this.sign.get(2) == "O") {
            System.out.println("O wins!");
        }

        if (this.sign.get(3) == "O"
                && this.sign.get(4) == "O"
                && this.sign.get(5) == "O") {
            System.out.println("O wins!");
        }

        if (this.sign.get(6) == "O"
                && this.sign.get(7) == "O"
                && this.sign.get(8) == "O") {
            System.out.println("O wins!");
        }

        // Vertical O wins    
        if (this.sign.get(0) == "O"
                && this.sign.get(3) == "O"
                && this.sign.get(6) == "O") {
            System.out.println("O wins!");
        }

        if (this.sign.get(1) == "O"
                && this.sign.get(4) == "O"
                && this.sign.get(6) == "O") {
            System.out.println("O wins!");
        }

        if (this.sign.get(2) == "O"
                && this.sign.get(5) == "O"
                && this.sign.get(8) == "O") {
            System.out.println("O wins!");
        }

        // Diagonal O wins
        if (this.sign.get(0) == "O"
                && this.sign.get(4) == "O"
                && this.sign.get(8) == "O") {
            System.out.println("O wins!");
        }

        if (this.sign.get(2) == "O"
                && this.sign.get(4) == "O"
                && this.sign.get(6) == "O") {
            System.out.println("O wins!");
        }

    }
}
