package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        
      /// First View  

      BorderPane layoutOne = new BorderPane();
      
      Label firstViewText = new Label("First View!");
      Button goToSecondLayout = new Button("To the second view!");
      
      layoutOne.setTop(firstViewText);
      layoutOne.setCenter(goToSecondLayout);
      
      // Create scene for view
      Scene firstView = new Scene(layoutOne);
      
      /// Second View
      VBox layoutTwo = new VBox();
      
      Button goToThirdLayout = new Button("To the third view!");
      Label SecondViewText = new Label("Second View!");
      
      layoutTwo.setSpacing(10);
      layoutTwo.getChildren().add(goToThirdLayout);
      layoutTwo.getChildren().add(SecondViewText);
      
      // Create scene for view
      Scene secondView = new Scene(layoutTwo);

      /// Third View
      GridPane layoutThree = new GridPane();
      
      Label thirdViewText = new Label("Third View");
      Button goToFirstlayout = new Button("To first view!");
      
      layoutThree.add(thirdViewText, 0, 0);
      layoutThree.add(goToFirstlayout, 1, 1);
      
      // Create scene for view
      Scene thirdView = new Scene(layoutThree);

      
      goToFirstlayout.setOnAction((event) -> {
          window.setScene(firstView);
      });
      
      goToSecondLayout.setOnAction((event) -> {
          window.setScene(secondView);
      });
      
      goToThirdLayout.setOnAction((event) -> {
          window.setScene(thirdView);
      });

      window.setScene(firstView);
      window.show();

    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
