package ticTacToe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private List<String> sign;
    private HashMap<Integer, String> board;
    private Button[] button;
    private boolean turn;

    public TicTacToeApplication() {
        this.sign = new ArrayList();
        this.board = new HashMap<>();
        this.button = new Button[9];
        this.turn = true;
        for (int index = 0; index < 9; index++) {
            this.button[index] = new Button();
            this.button[index].setText(" ");
            this.button[index].setFont(new Font("Monospaced", 40));
            this.button[index].setPrefSize(90, 90);
        }

    }

    @Override
    public void start(Stage window) {

        Label turnLabel = new Label("Turn: X");
        GridPane board = new GridPane();

        board.setHgap(10); //horizontal gap in pixels
        board.setVgap(10); //vertical gap in pixels
        board.setPadding(new Insets(20, 20, 20, 20));

        Button zero = this.button[0];
        Button one = this.button[1];
        Button two = this.button[2];

        Button three = this.button[3];
        Button four = this.button[4];
        Button five = this.button[5];

        Button six = this.button[6];
        Button seven = this.button[7];
        Button eight = this.button[8];

        board.add(turnLabel, 0, 0);
        board.setColumnSpan(turnLabel, 2);
        turnLabel.setFont(new Font("Monospaced", 40));

        board.add(zero, 0, 1);
        board.add(one, 1, 1);
        board.add(two, 2, 1);

        board.add(three, 0, 2);
        board.add(four, 1, 2);
        board.add(five, 2, 2);

        board.add(six, 0, 3);
        board.add(seven, 1, 3);
        board.add(eight, 2, 3);

        Scene scene = new Scene(board);

        window.setScene(scene);
        window.show();

        zero.setOnMouseClicked((event) -> {
            String sign = zero.getText();
            if (sign.equals(" ")) {
                if (getTurn()) {
                    zero.setText("X");
                    setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    zero.setText("O");
                    setTurn();

                    turnLabel.setText("Turn: X");
                }
            }
            if (!zero.getText().equals(" ")) {
                if (checkWinner()) {
                    turnLabel.setText("The end!");
                }

            }

        });

        one.setOnMouseClicked((event) -> {
            String sign = one.getText();
            if (sign.equals(" ")) {
                if (getTurn()) {
                    one.setText("X");
                    setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    one.setText("O");
                    setTurn();
                    turnLabel.setText("Turn: X");
                }
            }
            if (!one.getText().equals(" ")) {
                if (checkWinner()) {
                    turnLabel.setText("The end!");
                }
            }

        });

        two.setOnMouseClicked((event) -> {
            String sign = two.getText();
            if (sign.equals(" ")) {
                if (getTurn()) {
                    two.setText("X");
                    setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    two.setText("O");
                    setTurn();
                    turnLabel.setText("Turn: X");
                }

            }
            if (!two.getText().equals(" ")) {
                if (checkWinner()) {
                    turnLabel.setText("The end!");
                }
            }

        });

        three.setOnMouseClicked((event) -> {
            String sign = three.getText();
            if (sign.equals(" ")) {
                if (getTurn()) {
                    three.setText("X");
                    setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    three.setText("O");
                    setTurn();
                    turnLabel.setText("Turn: X");
                }

            }
            if (!three.getText().equals(" ")) {
                if (checkWinner()) {
                    turnLabel.setText("The end!");
                }
            }

        });

        four.setOnMouseClicked((event) -> {
            String sign = four.getText();
            if (sign.equals(" ")) {
                if (getTurn()) {
                    four.setText("X");
                    setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    four.setText("O");
                    setTurn();
                    turnLabel.setText("Turn: X");
                }

            }
            if (!four.getText().equals(" ")) {
                if (checkWinner()) {
                    turnLabel.setText("The end!");
                }
            }

        });

        five.setOnMouseClicked((event) -> {
            String sign = five.getText();
            if (sign.equals(" ")) {
                if (getTurn()) {
                    five.setText("X");
                    setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    five.setText("O");
                    setTurn();
                    turnLabel.setText("Turn: X");
                }

            }
            if (!five.getText().equals(" ")) {
                if (checkWinner()) {
                    turnLabel.setText("The end!");
                }
            }

        });

        six.setOnMouseClicked((event) -> {
            String sign = six.getText();
            if (sign.equals(" ")) {
                if (getTurn()) {
                    six.setText("X");
                    setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    six.setText("O");
                    setTurn();
                    turnLabel.setText("Turn: X");
                }

            }
            if (!six.getText().equals(" ")) {
                if (checkWinner()) {
                    turnLabel.setText("The end!");
                }
            }

        });

        seven.setOnMouseClicked((event) -> {
            String sign = seven.getText();
            if (sign.equals(" ")) {
                if (getTurn()) {
                    seven.setText("X");
                    setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    seven.setText("O");
                    setTurn();
                    turnLabel.setText("Turn: X");
                }

            }
            if (!seven.getText().equals(" ")) {
                if (checkWinner()) {
                    turnLabel.setText("The end!");
                }
            }

        });

        eight.setOnMouseClicked((event) -> {
            String sign = eight.getText();
            if (sign.equals(" ")) {
                if (getTurn()) {
                    eight.setText("X");
                    setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    eight.setText("O");
                    setTurn();
                    turnLabel.setText("Turn: X");
                }

            }
            if (!eight.getText().equals(" ")) {
                if (checkWinner()) {
                    turnLabel.setText("The end!");
                }
            }

        });
    }

    public boolean getTurn() {
        return this.turn;
    }

    public void setTurn() {
        this.turn = !this.turn;
    }

    public boolean checkWinner() {
        // Horizontal wins
        if (!this.button[0].getText().equals(" ") && this.button[0].getText().equals(this.button[1].getText()) && this.button[1].getText().equals(this.button[2].getText())) {
            return true;
        }

        if (!this.button[3].getText().equals(" ") && this.button[3].getText().equals(this.button[4].getText()) && this.button[4].getText().equals(this.button[5].getText())) {
            return true;
        }

        if (!this.button[6].getText().equals(" ") && this.button[6].getText().equals(this.button[7].getText()) && this.button[7].getText().equals(this.button[8].getText())) {
            return true;
        }

        // Vertical wins
        if (!this.button[0].getText().equals(" ") && this.button[0].getText().equals(this.button[3].getText()) && this.button[3].getText().equals(this.button[6].getText())) {
            return true;
        }

        if (!this.button[1].getText().equals(" ") && this.button[1].getText().equals(this.button[4].getText()) && this.button[4].getText().equals(this.button[7].getText())) {
            return true;
        }

        if (!this.button[2].getText().equals(" ") && this.button[2].getText().equals(this.button[5].getText()) && this.button[5].getText().equals(this.button[8].getText())) {
            return true;
        }

        // Diagonal wins
        if (!this.button[0].getText().equals(" ") && this.button[0].getText().equals(this.button[4].getText()) && this.button[4].getText().equals(this.button[8].getText())) {
            return true;
        }

        if (!this.button[2].getText().equals(" ") && this.button[2].getText().equals(this.button[4].getText()) && this.button[4].getText().equals(this.button[6].getText())) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
}
