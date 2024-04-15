package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {
    
    @Override
    public void start(Stage window) {
        // 1st View
        GridPane layoutOne = new GridPane();
        Label instruction = new Label("Enter your name and start.");
        TextField textInput = new TextField();
        Button start = new Button("Start");
        
        // Adding elements
        layoutOne.add(instruction, 0, 0);
        layoutOne.add(textInput, 0, 1);
        layoutOne.add(start, 0, 2);
        
        // Styling
        layoutOne.setPrefSize(350, 250);
        layoutOne.setAlignment(Pos.BASELINE_CENTER);
        layoutOne.setVgap(15);
        
        // 2nd View
        GridPane layoutTwo = new GridPane();
        Label welcomeText = new Label();
        
        
        // Adding element
        layoutTwo.add(welcomeText, 0, 0);
        welcomeText.setAlignment(Pos.CENTER);
        welcomeText.setPrefSize(350, 250);
        
        Scene firstView = new Scene(layoutOne);
        Scene secondView = new Scene(layoutTwo);
        
        // Button listener
        start.setOnAction((event)-> {
            welcomeText.setText("Welcome " + textInput.getText() +"!");
            window.setScene(secondView);
        });
        
        window.setScene(firstView);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
