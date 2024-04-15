package notifier;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {
    
    @Override
    public void start(Stage window) {
        
        TextField topText = new TextField();
        Button middleBtn = new Button("Update");
        Label bottomLabel = new Label();
        
        middleBtn.setOnAction((event) -> {
            bottomLabel.setText(topText.getText());
        });
        
        
        VBox componentGroup = new VBox();
        componentGroup.getChildren().addAll(topText, middleBtn, bottomLabel);
        
        Scene view = new Scene(componentGroup);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
