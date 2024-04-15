package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage window) {
        Game game = new Game();

        BorderPane layout = new BorderPane();
        Label turnLabel = new Label("Turn: X");
        Label winnerLabel = new Label("Winner: X");
        GridPane board = new GridPane();

        layout.setTop(turnLabel);

        VBox firstRow = new VBox();
        firstRow.setPadding(new Insets(5, 5, 5, 5));
        firstRow.setSpacing(5);

        Button one = new Button(" ");
        Button four = new Button(" ");
        Button seven = new Button(" ");

        firstRow.getChildren().addAll(one, four, seven);

        // Set value to buttons 1, 4, 7
        one.setOnMouseClicked((event) -> {
            String sign = one.getText();
            if (sign.equals(" ")) {
                if (game.getTurn()) {
                    one.setText("X");
                    game.setSignPosition(1, "X");
                    game.setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    one.setText("O");
                    game.setSignPosition(1, "O");
                    game.setTurn();
                    turnLabel.setText("Turn: X");
                }

            }
            game.checkWinner();
        });

        four.setOnMouseClicked((event) -> {
            String sign = four.getText();
            if (sign.equals(" ")) {
                if (game.getTurn()) {
                    four.setText("X");
                    game.setSignPosition(4, "X");
                    game.setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    four.setText("O");
                    game.setSignPosition(4, "O");
                    game.setTurn();
                    turnLabel.setText("Turn: X");
                }

            }
            game.checkWinner();
        });

        seven.setOnMouseClicked((event) -> {
            String sign = seven.getText();
            if (sign.equals(" ")) {
                if (game.getTurn()) {
                    seven.setText("X");
                    game.setSignPosition(7, "X");
                    game.setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    seven.setText("O");
                    game.setSignPosition(7, "O");
                    game.setTurn();
                    turnLabel.setText("Turn: X");
                }

            }
            game.checkWinner();
        });

        VBox secondRow = new VBox();
        secondRow.setPadding(new Insets(5, 5, 5, 5));
        secondRow.setSpacing(5);

        Button two = new Button(" ");
        Button five = new Button(" ");
        Button eight = new Button(" ");

        secondRow.getChildren().addAll(two, five, eight);

        // Set value to buttons 2, 5, 8
        two.setOnMouseClicked((event) -> {
            String sign = two.getText();
            if (sign.equals(" ")) {
                if (game.getTurn()) {
                    two.setText("X");
                    game.setSignPosition(2, "X");
                    game.setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    two.setText("O");
                    game.setSignPosition(2, "O");
                    game.setTurn();
                    turnLabel.setText("Turn: X");
                }

            }

        });

        five.setOnMouseClicked((event) -> {
            String sign = five.getText();
            if (sign.equals(" ")) {
                if (game.getTurn()) {
                    five.setText("X");
                    game.setSignPosition(5, "X");
                    game.setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    five.setText("O");
                    game.setSignPosition(5, "O");
                    game.setTurn();
                    turnLabel.setText("Turn: X");
                }

            }

        });

        eight.setOnMouseClicked((event) -> {
            String sign = eight.getText();
            if (sign.equals(" ")) {
                if (game.getTurn()) {
                    eight.setText("X");
                    game.setSignPosition(8, "X");
                    game.setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    eight.setText("O");
                    game.setSignPosition(8, "O");
                    game.setTurn();
                    turnLabel.setText("Turn: X");
                }

            }

        });

        VBox thirdRow = new VBox();
        thirdRow.setPadding(new Insets(5, 5, 5, 5));
        thirdRow.setSpacing(5);

        Button three = new Button(" ");
        Button six = new Button(" ");
        Button nine = new Button(" ");

        thirdRow.getChildren().addAll(three, six, nine);

        // Set value to buttons 3, 6, 9
        three.setOnMouseClicked((event) -> {
            String sign = three.getText();
            if (sign.equals(" ")) {
                if (game.getTurn()) {
                    three.setText("X");
                    game.setSignPosition(3, "X");
                    game.setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    three.setText("O");
                    game.setSignPosition(3, "O");
                    game.setTurn();
                    turnLabel.setText("Turn: X");
                }

            }

        });

        six.setOnMouseClicked((event) -> {
            String sign = six.getText();
            if (sign.equals(" ")) {
                if (game.getTurn()) {
                    six.setText("X");
                    game.setSignPosition(6, "X");
                    game.setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    six.setText("O");
                    game.setSignPosition(6, "O");
                    game.setTurn();
                    turnLabel.setText("Turn: X");
                }

            }

        });

        nine.setOnMouseClicked((event) -> {
            String sign = nine.getText();
            if (sign.equals(" ")) {
                if (game.getTurn()) {
                    nine.setText("X");
                    game.setSignPosition(9, "X");
                    game.setTurn();
                    turnLabel.setText("Turn: O");
                } else {
                    nine.setText("O");
                    game.setSignPosition(9, "O");
                    game.setTurn();
                    turnLabel.setText("Turn: X");
                }

            }

        });

        board.add(firstRow, 0, 0);
        board.add(secondRow, 1, 0);
        board.add(thirdRow, 2, 0);

        layout.setCenter(board);
        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
