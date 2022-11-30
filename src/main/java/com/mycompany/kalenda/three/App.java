package com.mycompany.kalenda.three;

//import packages.User;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
//import javafx.scene.control.Label;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//import java.util.concurrent.TimeUnit;
//import packages.DayNames;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {


        UserStartView pane = new UserStartView();
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Kalenda");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    public static void main(String[] args) {
        
        launch();
    }

}