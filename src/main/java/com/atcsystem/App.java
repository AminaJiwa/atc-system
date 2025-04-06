package com.atcsystem;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage; 
  
//To run .\run.ps1
public class App extends Application {
    
    @Override
    public void start(Stage stage) {

        //Create a simple "Hello World" label
        Label helloLabel = new Label("Hello, Air Traffic Control System!");
        
        //Create a layout and add the label
        StackPane root = new StackPane(helloLabel);
        
        //Create a scene with the layout (400x300 pixels)
        Scene scene = new Scene(root, 400, 300);
        
        //Set up the stage (window)
        stage.setTitle("ATC System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); // Starts the JavaFX application
    }
}