package MainGUIs;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainScreen extends Application {
// main Screen is a login Screen 
// which will validate the input user and redirects him to the proper dashboard   

    @Override
    public void start(Stage primaryStage) throws Exception {
  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginScreen.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Screen");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
