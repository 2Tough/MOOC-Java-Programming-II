package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);

        Button jokeBtn = new Button("Joke");
        Button answerBtn = new Button("Answer");
        Button explanationBtn = new Button("Explanation");
        
        menu.getChildren().addAll(jokeBtn, answerBtn, explanationBtn);
        layout.setTop(menu);
        
        StackPane joke = createView("What do you call a bear with no teeth?");
        StackPane answer = createView("A gummy bear.");
        StackPane explanation = createView("Because it's soft! Get it?");
        

        jokeBtn.setOnAction((click) -> layout.setCenter(joke));
        answerBtn.setOnAction((click) -> layout.setCenter(answer));
        explanationBtn.setOnAction((click) -> layout.setCenter(explanation));
        
        layout.setCenter(joke);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }
    
    private StackPane createView(String text) {
        StackPane newLayout = new StackPane();
        newLayout.setPrefSize(300,200);
        newLayout.getChildren().add(new Label(text));
        newLayout.setAlignment(Pos.CENTER);
        
        return newLayout;
    }
    

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }
}
