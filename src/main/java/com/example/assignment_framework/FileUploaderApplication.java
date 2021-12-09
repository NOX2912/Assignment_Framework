package com.example.assignment_framework;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class FileUploaderApplication extends Application {
    /*
    Entry point for javaFX application
     */
    @Override
    public void start(Stage stage) {

        //set scene and title
        Scene scene = new Scene(new Group(), 500, 250);
        stage.setTitle("File Uploader");

        //instantiate TextFields
        TextField fileTxt = new TextField ();

        //instantiate buttons
        Button browseBtn=new Button("browse");
        Button uploadBtn=new Button("upload");

        //instantiate gridpane, setVgap,Hgap,padding and add children
        GridPane grid = new GridPane();
        grid.setVgap(5);
        grid.setHgap(10);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.add(fileTxt, 1, 0);
        grid.add(browseBtn, 2, 0);
        grid.add(uploadBtn, 3, 0);

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

