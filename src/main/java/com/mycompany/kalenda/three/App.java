package com.mycompany.kalenda.three;

import packages.User;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.util.concurrent.TimeUnit;
import packages.DayNames;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) {

//        User user = new User("Richie");
//        AvailView pane = new AvailView(user);
//        Scene scene = new Scene(pane);
//        primaryStage.setTitle("AvailView Test");
//        primaryStage.setScene(scene);
//        primaryStage.show();
        UserStartView pane = new UserStartView();
        Scene scene = new Scene(pane);
        primaryStage.setTitle("AvailView Test");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }

    public static void main(String[] args) {
        
//        User user = new User("richfrost@gmail.com");
//        
//        user.setGroupNumber(115);
//        user.setGroupSize(2);
//        user.getAvail().getDay(DayNames.MONDAY).setEntireDay("101100000111000000011111");
//        user.getAvail().getDay(DayNames.TUESDAY).setEntireDay("111011110000000000000000");
//        
//        User user2 = new User("jijij@gmail.com");
//        user2.setGroupNumber(116);
//        user2.setGroupSize(67);
//        
//        User user3 = new User("shishishi@gmail.com");
//        user3.setGroupNumber(115);
//        user3.getAvail().getDay(DayNames.MONDAY).setEntireDay("100000111110000000000000");
//        user3.getAvail().getDay(DayNames.TUESDAY).setEntireDay("111000000000000000000000");
////        user3.setGroupSize(7);
//        
//        
//        GroupCreateClient client = new GroupCreateClient("localhost" , 5000, user);
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException ex) {
//            ex.printStackTrace();
//        }
//        GroupCreateClient client2 = new GroupCreateClient("localhost" , 5000, user2);
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException ex) {
//            ex.printStackTrace();
//        }
//        GroupCreateClient client3 = new GroupCreateClient("localhost" , 5000, user3);    

        User user = new User("richiefrost6@gmail.com");
        user.setGroupNumber(115);
        user.setGroupSize(2);
        user.getAvail().getDay(DayNames.MONDAY).setEntireDay("101100000111000000011111");
        user.getAvail().getDay(DayNames.TUESDAY).setEntireDay("111011110000000000000000");
        GroupCreateClient client = new GroupCreateClient("localhost" , 5000, user);
        
        launch();
    }

}