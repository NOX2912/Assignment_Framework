package com.example.assignment_framework;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PingApplication extends Application {
    /*
    Entry point for javaFX application
     */
    @Override
    public void start(Stage stage) {

        //set scene and title
        Scene scene = new Scene(new Group(), 500, 250);
        stage.setTitle("Ping");

        //instantiate TextFields
        TextField pingTxt = new TextField ();
        pingTxt.setText("127.0.0.1");

        //instantiate buttons
        Button pingBtn=new Button("ping");

        //instantiate gridpane, setVgap,Hgap,padding and add children
        GridPane grid = new GridPane();
        grid.setVgap(3);
        grid.setHgap(5);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.add(pingTxt, 1, 0);
        grid.add(pingBtn, 2, 0);


        //listen to mouse click events on buttons
        pingBtn.setOnMouseClicked((MouseEvent event) -> {
            //get textfield values and show in dialog
            Dialog d=new Alert(Alert.AlertType.INFORMATION,"There's no place like "+ pingTxt.getText());
            d.show();
        });

        //add gridpane to group
        Group root = (Group) scene.getRoot();
        root.getChildren().add(grid);
        //set scene and show stage
        stage.setScene(scene);
        stage.show();
    }
    /*
    Main method
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}