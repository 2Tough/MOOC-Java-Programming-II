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
        for (int i = 0; i < this.sign.size(); i++) {
            if (this.sign.get(0).equals("X")
                    && this.sign.get(1).equals("X")
                    && this.sign.get(2).equals("X")) {

                System.out.println("X wins!");
            }

           
        }
    }
}
