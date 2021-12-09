package com.example.assignment_framework;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculateApplication extends Application {
    /*
    Entry point for javaFX application
     */
    @Override
    public void start(Stage stage) {

        //set scene and title
        Scene scene = new Scene(new Group(), 350, 50);
        stage.setTitle("My Great Calculator");

        //instantiate TextFields
        TextField calcTxt = new TextField ();
        calcTxt.setText("10/2+6");

        //instantiate buttons
        Button calcBtn=new Button("calculate");

        //instantiate gridpane, setVgap,Hgap,padding and add children
        GridPane grid = new GridPane();
        grid.setVgap(3);
        grid.setHgap(5);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.add(new Label("Calculation: "), 0, 0);
        grid.add(calcTxt, 1, 0);
        grid.add(calcBtn, 2, 0);


        //listen to mouse click events our our buttons
        calcBtn.setOnMouseClicked((MouseEvent event) -> {
            //set textfield values
            calcTxt.setText("11");
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