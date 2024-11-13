package dev.lpa.udemy418firstjavafxproject;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException { // stage is window or container
//    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
    
    GridPane root = new GridPane(); // fxmlLoader
    root.setAlignment(Pos.CENTER);
    root.setVgap(10);
    root.setHgap(10);
    
    Label greeting = new Label("Welcome to JavaFX!");
    greeting.setTextFill(Color.GREEN);
    greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
    
    root.getChildren().add(greeting); // add label to list of children
    
    Scene scene = new Scene(root, 700, 275); // like a theater, scene is what is seen on the window
    stage.setTitle("Hello JavaFX!");
    stage.setScene(scene);
    stage.show();
  }
  
  public static void main(String[] args) {
    launch();
  }
}