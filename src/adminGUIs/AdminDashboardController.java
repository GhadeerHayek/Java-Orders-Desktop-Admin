/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminGUIs;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author ghadi
 */
public class AdminDashboardController implements Initializable {

    @FXML
    private MenuItem menuItemClose;
    @FXML
    private Menu fontSizeMenu;
    @FXML
    private RadioMenuItem radioMenuItemLarge;
    @FXML
    private RadioMenuItem radioMenuItemMedium;
    @FXML
    private RadioMenuItem radioMenuItemSmall;
    @FXML
    private MenuItem menuItemFontColor;
    @FXML
    private CheckMenuItem checkMenuItemFont1;
    @FXML
    private CheckMenuItem checkMenuItemFont2;
    @FXML
    private MenuItem MenuItemBackgroundColor;
    @FXML
    private CheckMenuItem checkMenuItemNoBackground;
    @FXML
    private MenuItem MenuItemAbout;
    @FXML
    private ImageView loadedPhoto;
    @FXML
    private Label greetingLabel;
    @FXML
    private Label jokeLabel;
    @FXML
    private Button changePasswordBtn;
    @FXML
    private Button mInvoiceBtn;
    @FXML
    private Button mOrderBtn;
    @FXML
    private Button mProductBtn;
    @FXML
    private Button mClientBtn;
    @FXML
    private Button logOutBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void menuItemCloseHandle(ActionEvent event) {
    }

    @FXML
    private void radioMenuItemLargeHandle(ActionEvent event) {
    }

    @FXML
    private void radioMenuItemMediumHandle(ActionEvent event) {
    }

    @FXML
    private void radioMenuItemSmallHandle(ActionEvent event) {
    }

    @FXML
    private void menuItemFontColorHandle(ActionEvent event) {
    }

    @FXML
    private void checkMenuItemFont1Handle(ActionEvent event) {
    }

    @FXML
    private void checkMenuItemFont2Handle(ActionEvent event) {
    }

    @FXML
    private void MenuItemBackgroundColorHandle(ActionEvent event) {
    }

    @FXML
    private void checkMenuItemNoBackgroundHandle(ActionEvent event) {
    }

    @FXML
    private void MenuItemAboutHandle(ActionEvent event) {
    }

    @FXML
    private void changePasswordBtnHandle(ActionEvent event) {
    }

    @FXML
    private void mInvoiceBtnHandle(ActionEvent event) {
    }

    @FXML
    private void mOrderBtnHandle(ActionEvent event) {
    }

    @FXML
    private void mProductBtnHandle(ActionEvent event) {
    }

    @FXML
    private void mClientBtnHandle(ActionEvent event) {
    }

    @FXML
    private void logOutBtnHandle(ActionEvent event) {
    }
    
}
