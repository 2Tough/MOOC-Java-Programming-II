package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {

    @Override
    public void start(Stage window) {
        Button btnComponent = new Button("Continue");
        TextField textComponent = new TextField("tl;dr");
        
        FlowPane componentGroup = new FlowPane();
        
        componentGroup.getChildren().add(btnComponent);
        componentGroup.getChildren().add(textComponent);
        
        Scene view = new Scene(componentGroup);
        
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

}
