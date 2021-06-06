/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainGUIs;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ghadi
 */
public class LoginScreenController implements Initializable {

    @FXML
    private TextField usernameInput;
    @FXML
    private TextField passwordInput;
    @FXML
    private Label loginValidation;
    @FXML
    private Button loginBtn;
    @FXML
    private Button resetBtn;
    @FXML
    private Button joinBtn;
    Statement statement;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        // never forget to intialize the connection with the database + the statement 
        Connection myConnection = DatabaseConnection.DBconnection.getConnection();
        try {
            statement = myConnection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            System.out.println("connection is loaded succesfully");
        } catch (SQLException ex) {
            System.out.println("Failed to load the connection");
            Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void loginBtnHandle(ActionEvent event) throws SQLException {
        // select * from users 
        // returns a result set each line has : id , name , email , mobile , etc 
        // so we need the email/name field + password to check whether it equals the given one in the input areas 
        String sql = "select email ,password ,role from users";
        boolean usernameFound = false;
        boolean passwordFound = false;
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            if (rs.getString("email").equals(usernameInput.getText())) {
                usernameFound = true;
                if (rs.getString("password").equals(passwordInput.getText())) {
                    passwordFound = true;
                    // so we now have to check the role of this user to redirect him to the proper pages, shouldn't we ?
                    if (rs.getString("role").equals("admin")) {
                        try 
                        {
                            Parent parent = FXMLLoader.load(getClass().getResource("../adminGUIs/AdminDashboard.fxml"));
                            Scene adminScene = new Scene(parent);
                            Stage st = new Stage();
                            st.setScene(adminScene);
                            st.show();
                        }catch (IOException ex) {
                            System.out.println("Check the source of the file");
                            Logger.getLogger(LoginScreenController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        //take him to admin dashboard
                        //new AdminDashboard();
                        System.out.println("user is admin and login is successful ");
                    } else if (rs.getString("role").equals("client")) {
                        //take him to client dashboard
                        System.out.println("user is client and login is successful ");
                    }
                }

            }
        }
        if (!usernameFound && !passwordFound) {
            createErrorDialog("Username we NOT found, please check username and try again :( ");
            hideFields();
        } else if (usernameFound && !passwordFound) {
            createErrorDialog("Password is NOT correct, please Try again :( ");
            // to enforce the click on the reset button 
            hideFields();
        }
    }

    @FXML
    private void resetBtnHandle(ActionEvent event) {
        clearAll();
    }

    private void clearAll() {
        usernameInput.setText("");
        passwordInput.setText("");
        usernameInput.setDisable(false);
        passwordInput.setDisable(false);
    }

    private void hideFields() {
        usernameInput.setDisable(true);
        passwordInput.setDisable(true);
    }

    @FXML
    private void joinBtnHandle(ActionEvent event) {
        // new Screen that's meant to be registratoin form 
    }

    private Dialog<String> createErrorDialog(String content) {
        Dialog<String> dialog = new Dialog();
        dialog.setTitle("Success ");
        dialog.setHeaderText("Process Status : Failure ");
        dialog.setContentText(content);
        ButtonType ok = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().add(ok);
        DialogPane dialogPane = dialog.getDialogPane();
        dialogPane.getStylesheets().add(getClass().getResource("../CSS/dialogStyling.css").toExternalForm());
        dialogPane.getStyleClass().add("errorDialog");
        dialog.show();
        return dialog;
    }

    private Dialog<String> createSuccessDialog(String content) {
        Dialog<String> dialog = new Dialog();
        dialog.setTitle("Success ");
        dialog.setHeaderText("Process Status : Success ");
        dialog.setContentText(content);
        ButtonType ok = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().add(ok);
        DialogPane dialogPane = dialog.getDialogPane();
        dialogPane.getStylesheets().add(getClass().getResource("../CSS/dialogStyling.css").toExternalForm());
        dialogPane.getStyleClass().add("successDialog");
        dialog.show();
        return dialog;
    }
}
