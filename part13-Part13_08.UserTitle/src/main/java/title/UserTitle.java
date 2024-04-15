package title;

import java.util.Scanner;
import javafx.application.Application;
import javafx.stage.Stage;


public class UserTitle extends Application {
    
    @Override
    public void start(Stage window) {
        Parameters params = getParameters();
        window.setTitle(params.getNamed().get("title"));
        window.show();
        
    }


}
