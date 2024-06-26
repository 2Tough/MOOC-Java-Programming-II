package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        HBox text = new HBox();
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is:");

        text.setSpacing(10);
        text.getChildren().add(letters);
        text.getChildren().add(words);
        text.getChildren().add(longest);

        TextArea textInput = new TextArea("");

        layout.setBottom(text);
        layout.setCenter(textInput);
        Scene view = new Scene(layout);

        textInput.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int wordsLen = parts.length;
            String longestWord = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            // set values of text elements
            letters.setText(String.valueOf("Letters: " + characters));
            words.setText(String.valueOf("Words: " + wordsLen));
            longest.setText("The longest word is: " + longestWord);
            
        });

        window.setScene(view);
        window.show();

    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
