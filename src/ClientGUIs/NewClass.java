/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientGUIs;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author ghadi
 */
public class NewClass extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label testLabel = new Label("This is my Label");
        Button myBtn = new Button("CLICK CLICK ");
        VBox myBox = new VBox (testLabel,myBtn);
        myBox.getStylesheets().add("CSS/Screen1Styling.css");// المؤشر واقف من ملف السورس
        Scene myScene = new Scene(myBox);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }
    public static void main(String[] args) {
            launch(args);
    }
    
}
